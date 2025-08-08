package factoryPattern_and_AbstractFactoryPattern.AbstractFactoryPattern;

public interface VehicleFactory {
    VehicleFactoryLayer2 vehicleFactory = new VehicleFactoryLayer2();
    Vehicle getVehicle(String input);
} 