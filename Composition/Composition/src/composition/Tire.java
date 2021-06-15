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
public class Tire {
  private int _size;
  private double _price;
  
   
   public Tire()
   {
      _size = 20;
     _price = 50; 
    }
    
      public Tire(int s, double p)
   {
      _size = s;
     _price = p; 
    }
      
      public double getPrice()
      {return _price;}
    
      public void setPrice(double p)
      {_price = p;}
      
      
      
       public int getSize()
      {return _size;}
       
      public void setSize(int s)
      {_size =s;}  
       
}
