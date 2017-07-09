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
public class mainGenerik1 {
    public static void main (String[] args){
           generik1<Character>
                genChar1 = new generik1<>();
                genChar1.setType();
                System.out.println(genChar1.getType());
                
            GenericTwoTypes<Character, Integer>
                genCharInt1 = new GenericTwoTypes<>();
                genCharInt1.setType1(6);
                System.out.println(genCharInt1.getType1());
                
            GenericTwoTypes<Character, Integer>
                genCharInt2 = new GenericTwoTypes<>();
                genCharInt2.setType1(10);
                System.out.println(genCharInt2.getType1());
}
