package com.vti.academy.backend;

import com.vti.academy.entity.InnerClassEx.*;

public class InnerClassEx {
    public void question2() {
        Car car = new Car("McLaren", "RWD");
        Car.Engine engine = new Car.Engine();

        engine.setEngineType("Electric");

        car.setCarEngine(engine);
        car.showInformation();
    }
}
