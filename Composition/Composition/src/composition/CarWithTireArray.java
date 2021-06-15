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
public class CarWithTireArray {
    private Tire[] _tireSet;
    private Engine _engine;
    
    public CarWithTireArray()
    {
        _tireSet = new Tire[4];        
        _tireSet[0] = new Tire();
        _tireSet[1] = new Tire();
        _tireSet[2] = new Tire();
        _tireSet[3] = new Tire();
        _engine = new Engine();
    }
       
      public Tire[] getTires()
      {return _tireSet;}
    
      public void setTires(Tire[] Ts)
      {_tireSet = Ts;}
      
       
          
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
