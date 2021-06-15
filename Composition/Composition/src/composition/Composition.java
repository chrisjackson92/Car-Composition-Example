/*
 * Christopher Jackson
 */
package composition;

/**
 *
 * @author tec435-student
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //test an internal object first.
        //dont make all and test on first run
        Tire T1 = new Tire(30, 60);
     
        System.out.println(T1.getSize() + " " + T1.getPrice());
        T1.setPrice(65);
        System.out.println(T1.getSize() + " " + T1.getPrice());
        
        Car testCar = new Car();
        
        //how big is the right front tire?
        System.out.println(testCar.getRightFrontTire().getSize());
        //too big. Let's change it
        testCar.getRightFrontTire().setSize(55);
        System.out.println(testCar.getRightFrontTire().getSize());
    
        //Change the whole tire
        Tire boughtIt = new Tire(40, 1000);
        testCar.setLeftFrontTire(boughtIt);
         System.out.println(testCar.getLeftFrontTire().getSize() 
                       + " " + testCar.getLeftFrontTire().getPrice());
    
         //use engine...so tightly bound that we are using delegation
         //here the programmer doesn't even see the engine as separate
         testCar.Start();
         testCar.addMiles(100);
         System.out.println(testCar.getMiles());
    
         CarWithTireArray testCar2 = new CarWithTireArray();
         //may need ( ) around the array as you pull it out
         System.out.println((testCar2.getTires())[0].getSize()); 
         //change it
         (testCar2.getTires())[0].setSize(99);
         //show it again
         System.out.println((testCar2.getTires())[0].getSize()); 
         
         //print all tire sizes in array
         for (int x = 0; x < testCar2.getTires().length; x++)
         {System.out.print((testCar2.getTires())[x].getSize() + " ");}
         System.out.println();
    }
    
}
