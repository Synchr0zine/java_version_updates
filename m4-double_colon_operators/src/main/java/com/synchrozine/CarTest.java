package com.synchrozine;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //NoArgConstructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;

        //SingleArgConstructor
        Function<String, Car> f1 = model -> new Car(model);
        Function<String, Car> f2 = Car::new;

        //Two Arg Constructor
        BiFunction<String, String, Car> f3 = Car::new;
        Car honda = f3.apply("Nissan", "Rogue");
        System.out.println(honda.getMake() + " " + honda.getModel());
    }
}
