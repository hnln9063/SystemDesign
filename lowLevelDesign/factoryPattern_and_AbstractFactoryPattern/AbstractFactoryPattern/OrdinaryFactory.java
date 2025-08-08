package factoryPattern_and_AbstractFactoryPattern.AbstractFactoryPattern;

public class OrdinaryFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String input) {
       switch (input) {
        case "Hundai":
            return new Hundai();

        case "Swift":
            return new Swift();

        default:
            return null;
       }
    }
    
}
