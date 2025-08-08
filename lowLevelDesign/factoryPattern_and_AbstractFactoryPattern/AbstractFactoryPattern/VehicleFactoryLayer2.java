package factoryPattern_and_AbstractFactoryPattern.AbstractFactoryPattern;

public class VehicleFactoryLayer2 {
    VehicleFactory getVehicleFactory(String input) {
        switch (input) {
            case "LuxuryFactory":
                return new LuxuryFactory();
            
            case "OrdinaryFactory":
                return new OrdinaryFactory();

            default:
                return null;
        }
    }
}
