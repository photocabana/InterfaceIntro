package com.demo.interfaces;


//  Required
public interface ACPowerable {
//	Member variables - any class that implements this interface will have these voltage & frequency - a contract 
//	of a list of things that a class need to have if they are implementing this interface. 
	Integer voltage = 120;
    Integer frequency = 60;
    
    
//    These methods here are basically just listing the requirements, they don't have any implementations - they 
//    are not defined ONLY DECLARED inside of this interface - If you have any electrons that are ACPowerable 
//    they are required to implement this unPlug method and are required to checkPluggedIn method. 
    abstract void unPlug();
    abstract boolean checkPluggedIn();
    
    
//    Default method for ACPowerable
    public default void hasPower() {
        String message = "The device is ";
        if(!checkPluggedIn()) {
            message += "not ";
        }
        System.out.println(message + "plugged in.");
    }
    
}
