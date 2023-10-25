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
 class RoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new RoundedSquare();
      }	 
      return null;
   }
     @Override
   public Triangle getTriangle(String triangleType) {
      if (triangleType.equalsIgnoreCase("NORMAL")) {
         return new NormalTriangle();
      } else if (triangleType.equalsIgnoreCase("ROUNDED")) {
         return new RoundedTriangle();
      }
      return null;
   }
}