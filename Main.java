import designpatterns.javapatterns.Singleton;
import designpatterns.javapatterns.adapter.CoffeeMachineAdapter;
import designpatterns.javapatterns.adapter.NewCofeeMachine;
import designpatterns.javapatterns.adapter.OldCoffeMachine;
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

        //Testing the Adapter Design Pattern 
        OldCoffeMachine oldMachine = new OldCoffeMachine() ; 

        CoffeeMachineAdapter adapter = new CoffeeMachineAdapter(oldMachine);
       

       NewCofeeMachine newMachine = new NewCofeeMachine(adapter) ;

       newMachine.selectA("Boris");
    }
}
