package br.com.carrent.repositories;

import br.com.carrent.entities.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Integer> {
    List<VehicleEntity> findAllByCurrentRenterId(Integer currentRenterId);

    List<VehicleEntity> findAllByCurrentRenterIdIsNull();
}
