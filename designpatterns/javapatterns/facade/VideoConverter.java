package designpatterns.javapatterns.facade;

public class VideoConverter {
    SomeConverter converter ; 

    VideoConverter (SomeConverter worker){
        converter = worker ; 
    }

    //This method is a facade to our someconverter class 
    // Any client will use this method for converting a file instead of directly communicating with 
    // our Someconverter library 
    public void convert(String fileName , String format){
        SomeConverter converter = new SomeConverter(fileName , format) ; 
        converter.checkFileSuitability();
        converter.processFile(); 
        converter.addEffect();
    }
}
