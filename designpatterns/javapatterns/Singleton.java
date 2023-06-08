package designpatterns.javapatterns;

/**
 * Problems to think on : 
 * 1. Where and where should I use a singleTon 
 * 2. How do I ensure my SingleTon is used once 
 * 3. In Programs that uses modules, cann't it be redeclared in another files 
 */
public class Singleton {
    private static Singleton uniqueInstance ; 

    private Singleton(){}; 

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton() ; 
        }
        return uniqueInstance ; 
    }

    public void sayType() {
        System.out.println("This is a singleton");
    }
}
