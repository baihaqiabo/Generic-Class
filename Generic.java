/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.io.PrintStream;

/**
 *
 * @author baihaqi
 */
public class Generic <T> {
    private T type;
    private boolean setType;
    
    public T getType() {
        return type;
    }
    
    public void setType (T type){
        this.type = type;
    }
    
    public static void main (String [] args) {
        Generic <Character> genChar = new Generic<>();
        genChar.setType('1');
        System.out.println(genChar.setType<>);
    }
}
