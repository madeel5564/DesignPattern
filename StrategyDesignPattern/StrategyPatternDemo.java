/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-163
 */
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());		
      System.out.println("50 + 10 = " + context.executeStrategy(50, 10));

      context = new Context(new OperationSubstract());		
      System.out.println("50 - 10 = " + context.executeStrategy(50, 10));

      context = new Context(new OperationMultiply());		
      System.out.println("50 * 10 = " + context.executeStrategy(50, 10));
      
      context = new Context(new OperationDivide());		
      System.out.println("50 / 10 = " + context.executeStrategy(50, 10));
      
      context = new Context(new OperationPower());		
      System.out.println("50 ^ 10 = " + context.executeStrategy(50, 10));
   }
}