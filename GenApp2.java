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
public class GenApp2 <T,R> {
    private T type;
    private R type1;
    
    public T getType () {
        return type;
    }
    public R getType1 () {
        return type1;
    }
    
    public void setType (T type){
        this.type = type;
    }   
    public void setType1 (R type1){
        this.type1 = type1;
    }
    
    private static <N> void anythingYouWanted (N freeParType) {
                System.out.println(freeParType);
            }
            public static void main (String[] args) {
                anythingYouWanted(1);
            }
}
