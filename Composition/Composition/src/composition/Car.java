/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author tec435-student
 */
public class Car {
    private Tire LF, RF;
    private Engine _engine;
    
    public Car()
    {
        LF = new Tire();
        RF = new Tire(77, 88);
        _engine = new Engine();
    }
       
      public Tire getLeftFrontTire()
      {return LF;}
    
      public void setLeftFrontTire(Tire T)
      {LF = T;}
      
        public Tire getRightFrontTire()
      {return RF;}
    
      public void setRightFrontTire(Tire T)
      {RF = T;}
    
      /* using delegation? don't need this to outside
      public Engine getEngine()
      {return _engine;}
    
      public void setEngine(Engine E)
      {_engine = E;}
      */
    
      //use delegation...another way to do it
      public void Start()
      {System.out.println("Gauges Light Up");
       _engine.Start();
      }
      
     public void addMiles(int m)
      {
          _engine.setMiles(_engine.getMiles() + m);
      }
     
        public String getMiles()
      {
        return "Odeometer is " + _engine.getMiles();
      }
      
}
