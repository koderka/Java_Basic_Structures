package pl.koderka.methods;

import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
    	int[] arr = {1,2,3};
    	System.out.println(Arrays.toString(append(arr)));

    }
    static int[] append(int[] arr) {
    	int[] tmpArr = new int[arr.length * 2];
    		for(int i = 0; i < arr.length; i++) {
    			tmpArr[i] = arr[i];
    			tmpArr[arr.length + i] = arr[arr.length - i - 1];
    		}
    		return tmpArr;
    }
}
