package com.ivar.dsalgo.arrays;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int arr[] = {9,9,9,9,9,9,9,9,9,9,9,9};
		PlusOne one = new PlusOne();
		System.out.println(Arrays.toString(one.plusOne(arr)));

	}
	
	public int[] plusOne(int[] digits) {
		int rem = 1;
		int len = digits.length;
		    int i = 0;
		    while(i<len && digits[i] ==9) {
		        i++;
		    }
		    int[] result;
		    if( i == len) 
		       result = new int[len + 1];
		    else
		        result = new int[len];
		    
		    for(i = len - 1; i >=0 ; i--) {
		        int sum = digits[i] + rem;
		        result[i] = sum % 10;
		        rem = sum / 10;
		    }
		    
		    if(result.length > len)
		        result[0] = rem;
		    
		    return result;
	}

}
