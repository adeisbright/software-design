package designpatterns.javapatterns;

public class Factory {
    IProduct product ; 

    public IProduct makeOrder(String productType){
        product = new ProductB() ; 
        return product;
    }
    
}
