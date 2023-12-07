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
 abstract class AbstractFactory {
   abstract Shape getShape(String shapeType) ;
   abstract Triangle getTriangle(String triangleType);
}