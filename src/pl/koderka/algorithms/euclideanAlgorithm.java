package pl.koderka.algorithms;

public class euclideanAlgorithm {

    public static void main(String[] args) {
		
        int x = 496;
        int y = 186;
        int a = x;
        int b = y;
        
        int gdc;
        int z;
    
        for (int i = 0; i <= y; i++)
        {    
            z = x % y;
            x = y; 
            y = z;
    
            if (y == 0){
            gdc = x;
            System.out.println("Dla liczb " + a + " i "+ b + " GDC to: " + gdc);
			}
        }
   }
}
