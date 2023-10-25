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
 class DoubleBorderedSquare extends Square {
   @Override
   public void draw() {
      System.out.println("Inside DoubleBorderedSquare::draw() method.");
      // Draw the double border here
   }
}

 class DoubleBorderedTriangle implements Triangle {
   @Override
   public void draw() {
      System.out.println("Inside DoubleBorderedTriangle::draw() method.");
      // Draw the double border here
   }
}
 
 class DoubleBorderedRoundedTriangle extends RoundedTriangle {
   @Override
   public void draw() {
      System.out.println("Inside DoubleBorderedRoundedTriangle::draw() method.");
      // Draw the double border here
   }
}