import designpatterns.javapatterns.Singleton;
import oop.javaoop.Dog;
import oop.javaoop.adapter.CoffeeMachineAdapter;
import oop.javaoop.adapter.NewCofeeMachine;
import oop.javaoop.adapter.OldCoffeMachine;

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
