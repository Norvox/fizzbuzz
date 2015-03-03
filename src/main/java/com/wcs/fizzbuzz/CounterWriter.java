/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wcs.fizzbuzz;

/**
 *
 * @author Máté
 */
public class CounterWriter {
    FizzBuzzer fibu = new FizzBuzzer();
    String szamHelyett;
    int i;
    
    public void progi() {
            for ( i = 1; i < 101; i++ ) {
            szamHelyett = fibu.execute( i );
            System.out.println( szamHelyett );
        }
    }
}
