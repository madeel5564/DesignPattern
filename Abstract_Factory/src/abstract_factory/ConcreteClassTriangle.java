/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory;

/**
 *
 * @author fa20-bse-163
 */
 class NormalTriangle implements Triangle {
   @Override
   public void draw() {
      System.out.println("Inside NormalTriangle::draw() method.");
   }
}

 class RoundedTriangle implements Triangle {
   @Override
   public void draw() {
      System.out.println("Inside RoundedTriangle::draw() method.");
   }
}