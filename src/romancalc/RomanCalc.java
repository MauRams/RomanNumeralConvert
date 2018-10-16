/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romancalc;

import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Maurice with reference to the following snippet https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java
 */
public class RomanCalc {
//create TreeMap to establish the number conversion to be used
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
     static {
    
    map.put(1000, "M");
    map.put(900, "CM");
    map.put(500, "D");
    map.put(400, "CD");
    map.put(100, "C");
    map.put(90, "XC");
    map.put(50, "L");
    map.put(40, "XL");
    map.put(10, "X");
    map.put(9, "IX");
    map.put(5, "V");
    map.put(4, "IV");
    map.put(1, "I");
    
    }
    
    public final static String toRoman(int num){
        //get the corresponding entry to each number
        int l = map.floorKey(num);
        if(num == l){
            return map.get(num);
        }
        //recursive method calls itself with the value mapped each number
        return map.get(l) + toRoman(num-l);
    }
    //can be used to test the conversions
//    public static void testRomanConvert(String inString){
//        for (int i = 1; i<100; i++){
//            System.out.println(i+"\t=\t " +RomanCalc.toRoman(i));
//        }
//    }
    
    public static void main(String[] args) {
        //take input from the user and pass to an int
		int in = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        //declare a String a to be equal to the result of passing int in to the toRoman() method above
		String a = RomanCalc.toRoman(in);
        //show it to the user
		JOptionPane.showMessageDialog(null,"Your Number ("+ in + ") in Roman Numerals is " + a);
		
	}
    
}
