public class Human extends Shape {

   public Human(){
     type = "Human";
   }

   @Override
   public void draw() {
      System.out.println("Inside Human::draw() method.");
   }
}
