package pl.koderka.methods;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
    	int[][] tab = { {1, 2, 3, 8}, 
    					{4, 5, 6}, 
    					{7, 8, 9}
    				  };
    	System.out.println(Arrays.toString(minimum(tab)));
    }
    
    static int[] minimum(int[][] arr) {
    	int[] minimums = new int[arr.length];
    	for(int i = 0; i < arr.length; i++) {
    		int tempMin = arr[i][0];
    		for(int j = 0; j < arr.length; j++) {
    			tempMin = arr[i][j] < arr[i][0] ? arr[i][j] : tempMin;
    		}
    		minimums[i] = tempMin; 
    	}
    	return minimums;
    }
}