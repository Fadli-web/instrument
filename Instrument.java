//Object Class

import java.util.Scanner;

public class Instrument {
    // variabel

    private String type;
    private double price;

    // Constructor Default (yg membangun object)
    public Instrument() {
        type = "";
        price = 0;
    }

    // Construstor Parameter
    public Instrument(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // Getter
    // Setter
    // Method
    public void print() {
        System.out.println("Intrument type: " + type);
        System.out.println("price : " + price);

    }

    public String getType() {
      return this.type;
    }
    public void setType(String value) {
      this.type = value;
    }

    public double getPrice() {
      return this.price;
    }
    public void setPrice(double value) {
      this.price = value;
    
      
    }
    
    }

  
  

