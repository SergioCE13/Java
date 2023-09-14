public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("0 ");
        System.out.print("1 ");
        System.out.print("2 ");

        int prev1 = 0, prev2 = 1, prev3 = 2;

        for(int i = 0; i < 17; i++){
            System.out.print((prev1 + prev2 + prev3) + " ");
            int helper = prev1 + prev2 + prev3;

            prev1 = prev2;
            prev2 = prev3;
            prev3 = helper;
        }

        System.out.println("");
    }
    
}
