package designpatterns.javapatterns;

public class Factory {
    IProduct product ; 

    public IProduct makeOrder(String productType){
        if(productType == "a"){
            product = new ProductB() ; 
        }else{
            product = new ProductB() ; 
        }
        return product;
    }
    
}
