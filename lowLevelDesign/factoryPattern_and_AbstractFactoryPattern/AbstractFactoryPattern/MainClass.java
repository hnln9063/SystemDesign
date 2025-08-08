package factoryPattern_and_AbstractFactoryPattern.AbstractFactoryPattern;

public class MainClass {
    public static void main(String[] args) {

        VehicleFactoryLayer2 vehicleFactory1 = new VehicleFactoryLayer2();

        // Luxury Factory
        VehicleFactory luxury = vehicleFactory1.getVehicleFactory("LuxuryFactory");
        
        // Luxury -> Benz Car
        Vehicle benz = luxury.getVehicle("Benz");
        benz.display();

        // Luxury -> BMW car
        Vehicle bmw = luxury.getVehicle("BMW");
        bmw.display();
        
        // Ordinary Factory
        VehicleFactory ordinary = vehicleFactory1.getVehicleFactory("OrdinaryFactory");
        
        // Ordinary -> Swift
        Vehicle swift = ordinary.getVehicle("Swift");
        swift.display();

        // Ordinary -> hundai
        Vehicle hundai = ordinary.getVehicle("Hundai");
        hundai.display();


    }
}
