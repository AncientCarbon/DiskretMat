public class Euclid {
    public static int[] extend(int s, int t, int r) {
        int i = 0;
        int max;
        int min;
        if (s<t){
            max = t;
            min = s;
        }
        else {
            max = s;
            min = t;
        }
        while ((min*i) % max != r){
            if (min == max){
                break;
            }
            i++;
        }
        t = i;
        s = (min*i - r) / max;
        int[] svar = new int[2];
        svar[0] = t;
        svar[1] = s;
        return svar;
    }
}
