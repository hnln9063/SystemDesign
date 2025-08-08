package factoryPattern_and_AbstractFactoryPattern.AbstractFactoryPattern;

public class LuxuryFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String input) {
       switch (input) {
        case "Benz":
            return new Benz();
        
        case "BMW":
            return new BMW();

        default:
            return null;
       }
    }
    
}
