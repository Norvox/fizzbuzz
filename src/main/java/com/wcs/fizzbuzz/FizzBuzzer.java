package com.wcs.fizzbuzz;

public class FizzBuzzer {
    
    public String execute(int number) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if ( number % 3 == 0 && number % 5 == 0 )   return "FizzBuzz";
        else if ( number % 3 == 0 )                 return "Fizz";
        else if ( number % 5 == 0 )                 return "Buzz";
        else                                        return Integer.toString( number );
    }
    
}
