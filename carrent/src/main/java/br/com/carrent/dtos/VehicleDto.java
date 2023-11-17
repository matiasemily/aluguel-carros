package br.com.carrent.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDto {

    private Integer currentRenterId;

    private Integer vehicleId;

    private String plate;

    private String model;

    private String brand;

    private String color;

    private Integer year;

}
