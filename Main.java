package Daily_Problem;
public class Main {
    public static void main(String[] args) {        
        int test1 = 11; 
        int test2 = 128; 
        int test3 = -3; 
        System.out.println("Hamming weight of " + test1 + " (" + Integer.toBinaryString(test1) + "): " + hammingWeight(test1));
        System.out.println("Hamming weight of " + test2 + " (" + Integer.toBinaryString(test2) + "): " + hammingWeight(test2));
        System.out.println("Hamming weight of " + test3 + " (" + Integer.toBinaryString(test3) + "): " + hammingWeight(test3));
    }
    public static int hammingWeight(int n) {
        String a = Integer.toBinaryString(n);
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1')
                c++;
        }
        return c;
    }
}