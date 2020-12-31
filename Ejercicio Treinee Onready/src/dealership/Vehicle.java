package dealership;

public abstract class Vehicle implements Comparable<Vehicle>{
    
    protected String brand;
    protected String model;
    protected double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

     public double getPrice() {
        return price;
    }
     
    public void containsLetterY(){
       if(this.getModel().contains("Y")){
           System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+ this.getBrand()+" "+this.getModel()+" "+this.getPrice());
       }
    }

    @Override
    public int compareTo(Vehicle v){
        return (int) (this.price - v.price);   
    }
    
    public abstract void features();
}