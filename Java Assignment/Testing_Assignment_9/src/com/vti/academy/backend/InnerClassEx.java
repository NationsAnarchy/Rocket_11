package com.vti.academy.backend;

public class InnerClassEx {
    public class Car {
        private String carName;
        private String carType;
        private String carEngine;

        public Car(String carName, String carType) {
            this.carName = carName;
            this.carType = carType;
        }

        public void setCarEngine(String engine) {
            this.carEngine = engine;
        }

        public void showInformation() {
            System.out.println("Car name: " + carName);
            System.out.println("Car type: " + carType);
            System.out.println("Car engine: " + carEngine);
        }

        public class Engine {
            private String engineType;

            public String getEngineType() {
                return engineType;
            }

            public void setEngineType(String engineType) {
                this.engineType = engineType;
            }

            @Override
            public String toString() {
                return engineType;
            }
        }
    }
}
