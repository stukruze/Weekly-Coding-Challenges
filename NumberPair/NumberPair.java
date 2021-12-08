package com.stuart.kruze;

import java.math.BigInteger;

public class NumberPair {

    public static BigInteger numberPair(long s)
    {
    	int length = String.valueOf(s).length();
    	String str = String.valueOf(s);
    	
    	StringBuilder q = new StringBuilder();
    	 
    	
    	if(length % 2 != 0) {
    		s = -1;
    		BigInteger bd;
    		bd = BigInteger.valueOf(s);
    		return bd;
    	}
    	
    	for(int i = 0; i < length; i += 2) {
    		
    		int one = Character.getNumericValue(str.charAt(i));
    		int two = Character.getNumericValue(str.charAt(i+1));
    		
    		for(int j = 0; j < one; j++) {
    			q.append(two);
    		}
    	}
    	
    	
    	BigInteger bd = new BigInteger(q.toString());
    	return bd;
    }
    

    
    public static void main(String[] args)
    {
        long s = 1213200012171979L;
        long t = 54544666L;
        long u = 95L;
        long v = 1213141516171819L;
        long w = 120520L;
        long x = 231L;
        System.out.println(numberPair(s));
        System.out.println(numberPair(t));
        System.out.println(numberPair(u));
        System.out.println(numberPair(v));
        System.out.println(numberPair(w));
        System.out.println(numberPair(x));
        
    }
}
