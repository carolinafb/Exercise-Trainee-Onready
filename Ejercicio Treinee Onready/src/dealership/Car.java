package dealership;

import java.util.Locale;

public class Car extends Vehicle {
    
    private int doors;

    public Car(int doors, String brand, String model, double price) {
        super(brand, model, price);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public void features() {
         System.out.println("Marca: "+ this.getBrand() +" // Modelo: "+ this.getModel() +" // Puertas: "+ this.getDoors() +" // Precio: "+ String.format(Locale.getDefault(), "%,.2f",this.getPrice()));
    }
   

}
