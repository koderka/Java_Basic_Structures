package pl.koderka.methods;

import java.util.Arrays;

public class Main3 {
    
	public static void main(String[] args) {
    	int[][] tab = { {1, 2, 3, 8}, 
						{4, 5, 6}, 
						{7, 8, 9} };
    	System.out.println(Arrays.toString(lessMore(tab)));

    }
    static int[] lessMore(int[][] arr) {
    	double average = 0;
    	int count = 0;
    	int[] lessMore = {0, 0};
    	for(int[] tab: arr) {
    		for(int element: tab) {
    			average += element;
    		}
    		count += tab.length;
    	}
    	average /= count; 
    	
    	for(int[] tab: arr) {
    		for(int element: tab) {
    			lessMore[0] += element < average ? 1 : 0;
    			lessMore[1] += element > average ? 1 : 0;
    		}
    	}
    	return lessMore;
    }
}