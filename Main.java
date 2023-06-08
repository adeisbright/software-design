import designpatterns.javapatterns.Singleton;
import oop.javaoop.Dog;

public class Main {
    public static void main(String ...args){
        System.out.println("Testing My java code");
        Dog dog = new Dog("Ballo" , 2 , "German Shepherd") ;

        dog.echoName();

        Singleton single = Singleton.getInstance() ; 
        single.sayType(); 

        Singleton secondSingle = Singleton.getInstance();

        secondSingle.sayType();
    }
}
