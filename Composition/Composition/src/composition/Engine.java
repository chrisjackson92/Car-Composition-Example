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
public class Engine {
   private int _miles;

  
   
   public Engine()
   {
      _miles = 0;
 
    }
    
      public Engine(int m)
   {
      _miles = m;

    }
     
       public int getMiles()
      {return _miles;}
       
      public void setMiles(int s)
      {_miles = s;}  
      
      public void Start()
      {System.out.println("Engine Roars");}
}
