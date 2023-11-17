package br.com.carrent.controllers;

import br.com.carrent.entities.VehicleEntity;
import br.com.carrent.services.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicles")
@CrossOrigin("*")
public class VehiclesController {
    @Autowired
    VehicleService vehicleService;

    @Operation(description = "Busca veículos disponíveis no path available, senão busca todos")
    @GetMapping("/{available}")
    public List<VehicleEntity> getAllVehicles(@PathVariable("available") Boolean availableVehicles){
        if(availableVehicles){
            return vehicleService.getAvailableVehicles();
        }
        return vehicleService.getAllVehicles();
    }

    @Operation(description = "Adiciona um veículo se ele não existir")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna veículo adicionado e mensagem de sucesso"),
            @ApiResponse(responseCode = "500", description = "Retorna mensagem de erro")
    })
    @PostMapping("/add")
    public ResponseEntity<String> addVehicle(@RequestBody VehicleEntity vehicle){
        if(vehicle.getVehicleId() == null) {
            vehicleService.addVehicle(vehicle);
            return ResponseEntity.status(200).body("Veículo adicionado com sucesso");
        }
        return ResponseEntity.status(500).body("Veículo não adicionado");
    }

    @Operation(description = "Altera informações de um veículo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Altera o veículo"),
            @ApiResponse(responseCode = "500", description = "Retorna mensagem de erro")
    })
    @PutMapping("/{vehicleId}")
    public ResponseEntity editVehicle(@RequestBody VehicleEntity vehicle, @PathVariable Integer vehicleId){
        if(vehicle.getVehicleId() != null) {
            vehicleService.editVehicle(vehicle, vehicleId);
            return ResponseEntity.status(200).body(vehicle);
        }
        return ResponseEntity.status(500).body("Erro ao alterar veículo");
    }

    @Operation(description = "Apaga um veículo pelo id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Apaga o veículo")
    })
    @DeleteMapping("/{vehicleId}")
    public void deleteVehicle(@PathVariable("vehicleId") Integer vehicleId){
        vehicleService.deleteVehicle(vehicleId);
    }

}
