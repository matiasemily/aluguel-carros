package br.com.carrent.services;

import br.com.carrent.dtos.ManageVehicleDto;
// import br.com.carrent.dtos.VehicleDto;
import br.com.carrent.repositories.VehicleRepository;
import br.com.carrent.entities.VehicleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<VehicleEntity> getAllVehicles(){
        return vehicleRepository.findAll();
    }

    public List<VehicleEntity> getAvailableVehicles(){
        return vehicleRepository.findAllByCurrentRenterIdIsNull();
    }

    public ManageVehicleDto addVehicle(VehicleEntity vehicleDto) {
        vehicleDto.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        vehicleRepository.save(vehicleDto);
        ManageVehicleDto manageVehicleDto = new ManageVehicleDto();
        manageVehicleDto.setReturnMessage("Salvo com sucesso");
        manageVehicleDto.setReturnSuccess(true);
        return manageVehicleDto;
    }

    public ManageVehicleDto editVehicle(VehicleEntity vehicleDto, Integer vehicleId){
        ManageVehicleDto manageVehicleDto = new ManageVehicleDto();
        Optional<VehicleEntity> vehicleDatabaseOptional = vehicleRepository.findById(vehicleId);
        if (vehicleDatabaseOptional.isPresent()){
            VehicleEntity vehicle = vehicleDatabaseOptional.get();
            vehicle.setPlate(vehicleDto.getPlate());
            vehicle.setModel(vehicleDto.getModel());
            vehicle.setBrand(vehicleDto.getBrand());
            vehicle.setColor(vehicleDto.getColor());
            vehicle.setYear(vehicleDto.getYear());
            if (vehicleDto.getCurrentRenterId() != null){
                vehicle.setCurrentRenterId(vehicleDto.getCurrentRenterId());
            }
            vehicleRepository.save(vehicle);

            manageVehicleDto.setReturnMessage("Veículo atualizado com sucesso");
            manageVehicleDto.setReturnSuccess(true);
        } else {
            manageVehicleDto.setReturnMessage("Erro ao atualizar veículo");
            manageVehicleDto.setReturnSuccess(false);
        }
        return manageVehicleDto;
    }

    public void deleteVehicle(Integer vehicleId){
        List<VehicleEntity> allById = vehicleRepository.findAllById(Collections.singletonList(vehicleId));
        System.out.println(allById.size());
        vehicleRepository.deleteAll(allById);
    }

}
