package oop.javaoop.adapter;

//The adapter can safely call a method in the adaptee class 
// such as the selectA and selectB method 
// 
public class CoffeeMachineAdapter implements ICoffeMachine {
   public  OldCoffeMachine oldMachine ; 

    public CoffeeMachineAdapter(OldCoffeMachine machine){
        oldMachine = machine ; 
    }

    //The client will directly work with the 
    // adpated method 
    public  void chooseFirstSelection(String value){
        //Do whatever needs to be done here and then 
        // return a method from the adaptee 
        String newValue = value + value  ;
        oldMachine.selectA(newValue);
    } 
    public void chooseSecondSelection(){
        oldMachine.selectB();
    }

}
