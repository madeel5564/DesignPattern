public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      HexaObserver ob1 = new HexaObserver(subject);
      OctalObserver ob2  = new OctalObserver(subject);
      BinaryObserver ob3 = new BinaryObserver(subject);
      
      subject.detach(ob1);
      System.out.println("First state change: 15");	
      subject.setState(15);
      subject.detach(ob2);
      System.out.println("Second state change: 10");	
      subject.setState(10);
      
     
      

    
   }
}