package corejava.oops.composition;

import java.util.ArrayList;
import java.util.List;

public class Car {


    private Engine engine;

    public Car(Engine engine){
      this.engine = engine;
    }


    public Engine getEngine() {
        return engine;
    }

    void start(){
        engine.start();
        System.out.println("car is running");
    }



}
