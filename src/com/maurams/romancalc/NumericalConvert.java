/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maurams.romancalc;

import java.util.TreeMap;

/**
 *
 * @author Maurice
 * This class needs to convert a roman numeral back to a number 
 */
public class NumericalConvert {
    private final static TreeMap<String, Integer> map = new TreeMap<String, Integer>();
     static {
    
    map.put("M",1000);
    map.put("CM", 900);
    map.put("D", 500);
    map.put("CD", 400);
    map.put("C", 100);
    map.put("XC", 90);
    map.put("L", 50);
    map.put("XL", 40);
    map.put("X", 10);
    map.put("IX", 9);
    map.put("V", 5);
    map.put("IV", 4);
    map.put("I", 1);
    
     }
//     public final static String toNumeral(String num){
//        //get the corresponding entry to each number
//        String l = map.floorKey(num);
//        if(num == l){
//            return map.get(num);
//        }
//        //recursive method calls itself with the value mapped each number
//        return map.get(l) + toNumeral(num-l);
    
    
    }

