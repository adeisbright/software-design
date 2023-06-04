package oop.javaoop;

public class Animal {
    protected  String name  ; 
    protected  int age ; 

    public Animal(String name , int age){
        this.name = name ;
        this.age = age;
    }

    public void echoName(){
        System.out.println(this.name);
    }

    public int getAge(){
        return this.age ;
    }
}
