package com.stuart.kruze;

public class LCM {
	     
	    public static long lcmArray(int[] arr)
	    {
	        long elements = 1;
	        int divisor = 2;
	         
	        while (true) {
	            int counter = 0;
	            boolean divisible = false;
	             
	            for (int i = 0; i < arr.length; i++) {
	 
	                if (arr[i] == 0) {
	                    return 0;
	                }
	                else if (arr[i] < 0) {
	                    arr[i] = arr[i] * (-1);
	                }
	                if (arr[i] == 1) {
	                    counter++;
	                }
	 

	                if (arr[i] % divisor == 0) {
	                    divisible = true;
	                    arr[i] = arr[i] / divisor;
	                }
	            }
	 
	            if (divisible) {
	                elements = elements * divisor;
	            }
	            else {
	                divisor++;
	            }

	            if (counter == arr.length) {
	                return elements;
	            }
	        }
	    }

	    public static void main(String[] args)
	    {
	        int[] arr = {5, 4, 6, 46, 54, 12, 13, 17};
	        int[] arr2 = {46, 54, 466, 544};
	        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int[] arr4 = {13, 6, 17, 18, 19, 20, 37};
	        
	        System.out.println(lcmArray(arr));
	        System.out.println(lcmArray(arr2));
	        System.out.println(lcmArray(arr3));
	        System.out.println(lcmArray(arr4));
	    }
	
	
	
	
	
}
