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
public class GenericMainTwoTypes {
    public static void main (String[] args){
            GenericTwoTypes<Character, Integer>
                genCharInt = new GenericTwoTypes<>();
                genCharInt.setType1(1);
                System.out.println(genCharInt.getType());
                
            GenericTwoTypes<Character, Integer>
                genCharInt1 = new GenericTwoTypes<>();
                genCharInt1.setType1(6);
                System.out.println(genCharInt1.getType1());
                
            GenericTwoTypes<Character, Integer>
                genCharInt2 = new GenericTwoTypes<>();
                genCharInt2.setType1(10);
                System.out.println(genCharInt2.getType1());
    }
    
}
