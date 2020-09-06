package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;

public class Owner implements Serializable {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private int ownerId;
    private String name;
    private LocalDate birthDate;

    public Owner() {
    }

    public Owner(int ownerId, String name, LocalDate birthDate) {
        this.ownerId = ownerId;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", birthDate='").append(birthDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}