import java.util.Scanner;

public class in {
    public static void main(String[] args) {
        System.out.println(System.in);
       

       Instrument a = new Instrument("Guitar", 101.5);
       Instrument b = new Instrument("piano" , 200.0);
       Instrument c = new Instrument("Violin " ,150.0);

      

        // //paling mahal
        // if a > b && a > c
        // sout a paling mahal 
        // if else b > c && b > a
        // sout b paling mahal
        // else 
        // sout c paling mahal
        
        //paling murah
        // //if a < b && a < c
        // sout a paling murah 
        // if else b < c && b < a
        // sout b paling mahal
        // else 
        // sout c paling mahal//
        //mahal
        if(a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()){
            System.out.println("paling mahal adalah Guitar");
        }
        else if(b.getPrice() > c.getPrice() && b.getPrice() > a.getPrice()){
System.out.println("Harga paling mahal adalah Piano");
        }
        else{System.out.println("harga paling mahal adalah violin");}

        //murah
        if(a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()){
            System.out.println("paling murah adalah gitar" );
        }
        else if(b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()){
System.out.println("Harga paling murah adalah piano");
        }
        else if(c.getPrice() < a.getPrice() && c.getPrice() < b.getPrice()) {
            System.out.println("harga paling murah adalah violin");}


        
        }

}
