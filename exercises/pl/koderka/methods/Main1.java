package pl.koderka.methods;

public class Main1 {

    public static void main(String[] args) {
    	double buldogAge = 5.9;
    	double result = dogAge(buldogAge);
    	System.out.println(result);

    }
    static double dogAge(double dogAge) {	
    	if(dogAge < 2) {
    		return 10.5 * dogAge;
    	}
    	return 21 + 4 * (dogAge - 2);
    }
}
