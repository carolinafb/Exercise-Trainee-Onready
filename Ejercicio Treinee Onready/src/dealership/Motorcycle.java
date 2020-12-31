package dealership;

import java.util.Locale;

public class Motorcycle extends Vehicle{
    
    private double cylinderCapacity;

    public Motorcycle(double cylinderCapacity, String brand, String model, double price) {
        super(brand, model, price);
        this.cylinderCapacity = cylinderCapacity;
    }
     
    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    @Override
    public void features() {
         System.out.println("Marca: "+ this.getBrand() +" // Modelo: "+ this.getModel() +" // Cilindrada: "+ this.getCylinderCapacity() +"cc // Precio: "+ String.format(Locale.getDefault(), "%,.2f",this.getPrice()));
    }
}
