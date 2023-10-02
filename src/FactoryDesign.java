/**
 * Factory Design Pattern Implementation.
 *
 * Additional details about the class.
 *
 * @author Your Name
 * @version 1.0
 * @since yyyy-mm-dd
 */
interface  Vehicle {
    void manufacture();
}

//Concrete product implementations
class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car is manufactured");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Motorcycle is manufactured");
    }
}

interface VehicleFactory {
    Vehicle createVehicle();
}

//Concrete factory implementation
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

public class FactoryDesign {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.manufacture();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.manufacture();

    }
}
