package com.synchrozine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String make;
    private String model;

    public Car(String model) {
        this.model = model;
    }
}
