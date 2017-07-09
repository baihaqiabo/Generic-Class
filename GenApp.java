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
public class GenApp {
	private static <T> void printArray (T[] a)
        {
	for (Object o : a) {
		System.out.println(o);
        }
    }
        public static void main (String[] args) {
            Integer iArr[] = new Integer[3];
            iArr[0] = 10;
            iArr[1] = 20;
            iArr[2] = 30;
            printArray (iArr);
            
            String sArr[] = new String[3];
            sArr[0] = "sepuluh";
            sArr[1] = "dua puluh";
            sArr[2] = "tiga puluh";
            printArray (sArr);
            
            Character cArr[] = new Character[3];
            cArr[0] = 'a';
            cArr[1] = 'b';
            cArr[2] = 'c';
            printArray (cArr);
            
            Double dArr[] = new Double[3];
            dArr[0] = 0.1;
            dArr[1] = 0.2;
            dArr[2] = 0.3;
            printArray (dArr);
        }
}
