public class greatestCommonDenom {
    public static int gcd (int a, int b){
        int r = 1;
        for (int i = 1; i <= a && i <= b; i++){
            if (a % i == 0 && b % i == 0){
                r = i;
            }
        }
        return r;
    }
}
