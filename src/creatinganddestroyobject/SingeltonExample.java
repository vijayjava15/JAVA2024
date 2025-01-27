package creatinganddestroyobject;

public class SingeltonExample{

    private String value;

    // it should have static member within class , it make sure memory allocated only once
    //keeping only instance memory
    private static SingeltonExample instance;

    //we need a private constructor, so others wont direclty access the class to create  a instance
    // if we have private then they can only access the member of the class. example instance
    //get instance to create a object.............................................
    private SingeltonExample(){

    }

    //A crucial aspect of the Singleton pattern is the presence of a static factory method.
    // This method acts as a gateway, providing a global point of access to the Singleton object.
    public  static  SingeltonExample getInstance(){
        if (instance==null)
            instance = new SingeltonExample();
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
