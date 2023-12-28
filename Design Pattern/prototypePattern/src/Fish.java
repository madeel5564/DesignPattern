public class Fish extends Shape {

   public Fish(){
     type = "Fish";
   }

   @Override
   public void draw() {
      System.out.println("Inside Fish::draw() method.");
   }
}