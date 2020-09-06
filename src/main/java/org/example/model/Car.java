package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Car implements Serializable {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID carId;
    private String regNumber;
    private String NameBrand;
    private String model;
    private LocalDate regDate;
    private Owner owner;

    public Car() {
    }

    public Car(String regNumber, String nameBrand, String model, LocalDate regDate, Owner owner) {
        this.carId = UUID.randomUUID();
        this.regNumber = regNumber;
        this.NameBrand = nameBrand;
        this.model = model;
        this.regDate = regDate;
        this.owner = owner;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getNameBrand() {
        return NameBrand;
    }

    public void setNameBrand(String nameBrand) {
        NameBrand = nameBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("carId=").append(carId);
        sb.append(", regNumber='").append(regNumber).append('\'');
        sb.append(", nameBrand='").append(NameBrand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", regDate=").append(regDate);
        sb.append('}');
        return sb.toString();
    }
}
