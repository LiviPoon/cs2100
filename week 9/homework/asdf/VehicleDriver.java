/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: VehicleDriver reads file Vehicles.txt and saves all the vehicles to an array list then prints out vehicles to be sold (oldest models).
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;


public class VehicleDriver {

    public static void main(String[] args) throws IOException{
        ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
        Scanner vehicleFile = new Scanner(new File("Vehicles.txt"));

        while(vehicleFile.hasNext()){

            String type = vehicleFile.nextLine();
            String name = vehicleFile.nextLine();
            String address = vehicleFile.nextLine();
            String phone = vehicleFile.nextLine();
            Person tmpPerson = new Person(name, address, phone);

            if (type.equals("Taxi")){
                String make = vehicleFile.nextLine();
                String model = vehicleFile.nextLine();
                int year = Integer.parseInt(vehicleFile.nextLine());
                int miliage = Integer.parseInt(vehicleFile.nextLine());
                int numberPassengers = Integer.parseInt(vehicleFile.nextLine());
                boolean isSuv = Boolean.parseBoolean(vehicleFile.nextLine());

                String nameD = vehicleFile.nextLine();
                String addressD = vehicleFile.nextLine();
                String phoneD = vehicleFile.nextLine();
                Person tmpDriver = new Person(nameD, addressD, phoneD);

                String id = vehicleFile.nextLine();

                Taxi tmpTaxi = new Taxi(tmpPerson, make, model, year, miliage, numberPassengers, isSuv, tmpDriver, id);
                cars.add(tmpTaxi);
            }

            else if (type.equals("Automobile")){
                String make = vehicleFile.nextLine();
                String model = vehicleFile.nextLine();
                int year = Integer.parseInt(vehicleFile.nextLine());
                int miliage = Integer.parseInt(vehicleFile.nextLine());
                int numberPassengers = Integer.parseInt(vehicleFile.nextLine());
                boolean isSuv = Boolean.parseBoolean(vehicleFile.nextLine());

                Automobile tmpAutomobile = new Automobile(tmpPerson, make, model, year, miliage, numberPassengers, isSuv);
                cars.add(tmpAutomobile);
            }

            else if (type.equals("Truck")){
                String make = vehicleFile.nextLine();
                String model = vehicleFile.nextLine();
                int year = Integer.parseInt(vehicleFile.nextLine());
                int miliage = Integer.parseInt(vehicleFile.nextLine());
                int cap = Integer.parseInt(vehicleFile.nextLine());
                int axels = Integer.parseInt(vehicleFile.nextLine());

                Truck tmpTaxi = new Truck(tmpPerson, make, model, year, miliage, cap, axels);
                cars.add(tmpTaxi);
            }
        }

        ArrayList<Integer> year = new ArrayList<Integer>();

            for (int i = 0; i<cars.size(); i++){

                year.add(cars.get(i).getYear());
            }

            System.out.println("Vehicles to be sold:");

            int timer = 0;

            for (int a = 0; a<cars.size(); a++){
                
                if (cars.get(a).getYear() == Collections.min(year)){
                    timer++;
                    System.out.printf("%s: %d: %s%n%n", cars.get(a).getClass(), timer,cars.get(a));
                }
            }


    }

    

    
   
}
