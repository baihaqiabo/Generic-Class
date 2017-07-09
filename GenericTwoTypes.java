/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author baihaqi
 */
public class GenericTwoTypes <T, N> {
    
    private T type;
    private N type1;
    
    public T getType() {
        return type;
    }
    
    public N getType1() {
        return type1;
    }
    public void setType(T type) {
         this.type = type;
    }

    public void setType1(N type1) {
        this.type1 = type1; 
    }  
}
