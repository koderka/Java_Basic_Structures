package pl.koderka.methods;

public class Main5 {

    public static void main(String[] args) {
    	int[][]tab = {
    				 {1, 2, 3},
    				 {4, 5, 6},
    				 {7, 8, 9}
    				 };
    	System.out.println(evenSum(tab));

    }
    
    static int evenSum(int[][] arr) {
    	int sum = 0;
	    for(int i = 0; i < arr.length; i++) {
	    	for(int j = 0; j < arr.length; j++) {
    			if(j % 2 != 0) {
    				sum += arr[i][j];
				}
			}
	    }
	    return sum;
    }
}
