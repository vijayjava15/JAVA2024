package corejava.oops.composition;

public class CompositionTest {

    public static void main(String[] args) {
        PetrolEngine petrol = new PetrolEngine();
        ElectricEngine electric = new ElectricEngine();
        DieselCar card = new DieselCar();
        Car petrolcar = new Car(petrol);
        Car electricCar = new Car(electric);
        Car dieselCar = new Car(card);
        petrolcar.start();
        electricCar.start();
        dieselCar.start();

        dieselCar.getEngine();
        //Car::getEngine();


    }
}
