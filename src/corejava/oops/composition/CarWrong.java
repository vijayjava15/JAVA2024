package corejava.oops.composition;

public class CarWrong extends EngineWrong {

     void run(){
         System.out.println("car is running");
     }
    public static void main(String[] args) {
        CarWrong carWrong = new CarWrong();
        carWrong.start();
        carWrong.run();

    }

    //here we are using a inheritance... but if i want to add a new future to car? it wont workout
    // like if i create electric engine it wont support to inherit in car
    //
}
