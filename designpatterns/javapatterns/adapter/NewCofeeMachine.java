package designpatterns.javapatterns.adapter;

public class NewCofeeMachine {
    CoffeeMachineAdapter adapter ; 

    public NewCofeeMachine(CoffeeMachineAdapter adaptor){
        this.adapter = adaptor;
    }
    public void selectA(String value){
        this.adapter.chooseFirstSelection(value);
    } 
    public void selectB(){}
}
