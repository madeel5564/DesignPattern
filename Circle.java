/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorater;

/**
 *
 * @author Haier
 */
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
