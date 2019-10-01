package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min=3, max=20)
    private String make;

    @NotNull
    @Size(min=3, max=20)
    private String model;

    @NotNull
    @Min(1)
    private int year;

    @NotNull
    @Size(min=3, max=20)
    private String type;            // Sedan, truck, mini-van, SUV, ...

    @NotNull
    @Size(min=3, max=50)
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
