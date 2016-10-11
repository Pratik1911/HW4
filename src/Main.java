import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Car("Mercury Sable", 1999, true, 35000, 14, false);
        Vehicle v2 = new Vehicle("Harley Davidson Motorcycle", 2009, false, 11000, 38);
        Vehicle v3 = new Car("Pontiac Bonneville", 2013, false, 29000, 22, true);
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(v1);
        vehicleList.add(v2);
        vehicleList.add(v3);

//




        Vehicle[] e = {new Car("Mercury Sable", 1999, true, 35000, 14, false),
                new Vehicle("Harley Davidson Motorcycle", 2009, false, 11000, 38),
                new Car("Pontiac Bonneville", 2013, false, 29000, 22, true),
                new Car("Nissan Ultima", 2008, true, 12000, 23,false),
                new Truck("Chevy Silverado", 2015, true, 52000, 14, true,16000),
                new Truck("Ford F350", 2014, true, 43000, 14, false, 14000)
        };

    }

    public static void printVehicle(Vehicle e){
        System.out.println(e.getYear() + " " + e.getName());
        if (e.getFourWheelDrive())      //if 4wd, prints 4wd, otherwise prints No 4wd
            System.out.println("4WD");
        else if(!e.getFourWheelDrive())
            System.out.println("No 4WD");
        System.out.println("$" +e.getRetailPrice());
        System.out.println(e.getMPG()+ "MPG");
        //Car object specific output
        if (e instanceof Car){
            if (((Car) e).isConvertible()) {
                System.out.println("Convertible");}
            else System.out.println("No Convertible");
        }
        //Truck object specific output
        if (e instanceof Truck){        //if its a truck, print info about stepside & towCap
            if (((Truck) e).isStepSide()) {
                System.out.println("StepSide");}
            else System.out.println("No StepSide");
            System.out.println("Towing Capacity: " + ((Truck)e).getTowCap());
        }
    }
}
