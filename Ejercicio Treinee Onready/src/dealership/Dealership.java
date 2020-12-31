package dealership;

import java.util.ArrayList;
import java.util.Collections;

public class Dealership {

    ArrayList<Vehicle> data = new ArrayList<>();
    boolean sort =false;

    private void setUp(){   
       data.add(new Car(4,"Peugeot","206",200000.00));
       data.add(new Motorcycle(125,"Honda","Titan",60000.00));
       data.add(new Car(5,"Peugeot","208",250000.00));
       data.add(new Motorcycle(160,"Yamaha","YBR",80500.50));
    }
    
    private void showData(){
       data.forEach((v)-> v.features());
    }
    
    private void showBrandAndModel(){
         for (int i = data.size()-1; i >= 0; i--) {
             System.out.println(data.get(i).getBrand() +" "+ data.get(i).getModel());
        }
    }
    
    private void vehicleWithLetterY(){
       data.forEach((v)-> v.containsLetterY());
    }
    
    private void sortByPrice(){
    Collections.sort(data);
    }
    
    private void moreExpensive(){
        if (!sort){
        sortByPrice();
        sort =true;
        }
        Vehicle v =data.get((data.size()-1));
        System.out.println("Vehiculo mas caro: "+ v.getBrand() +" "+ v.getModel());

    }
    private void moreCheaper(){
        if (!sort){
        sortByPrice();
        sort =true;
        }
        Vehicle v =data.get(0);
        System.out.println("Vehiculo mas barato: "+ v.getBrand() +" "+ v.getModel());
    }

    public static void main(String[] args) {
       
        Dealership dealership = new Dealership();
        dealership.setUp();
        dealership.showData();
        
        System.out.println("===================================================");
        
        dealership.sortByPrice();
        dealership.moreExpensive();
        dealership.moreCheaper();
        dealership.vehicleWithLetterY();
        
        System.out.println("===================================================");
        
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        dealership.showBrandAndModel();

       
    }
    
}
