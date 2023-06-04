package oop.javaoop ; 

public class Dog extends Animal implements IAnimal {

    private String breed ; 

    public Dog( String name ,  int age , String breed ){
        super(name , age) ; 
        this.breed = breed ; 
    }

    public String getBreed(){
        return this.breed ; 
    }

    public String speak(String sound){
        return sound + " " + "Woo woo" ;
    }
}
