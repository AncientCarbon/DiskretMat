public class prime {
    public static boolean check(int max){
        boolean prime = true;
        for(int i = 1; i <= (max/2); i++){
            if (greatestCommonDenom.gcd(max, i) != 1){
            prime = false;
            break;
            }
        }
        return prime;
    }
}
