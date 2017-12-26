package pl.koderka.arrays;

public class Main3 {

    public static void main(String[] args) {
        
    	int[] numbers = {33, 21, 89, 54, 71, 90, 48, 66, 1, 15};
    	
    	int[] reverse = new int[10];
    	
    	for(int i = 0; i < reverse.length; i++) {
    		reverse[i] = numbers[(numbers.length-1)-i];
    		System.out.println(reverse[i]);
    	}
    }
}