/*
Invariants:
- All methods & data must be static
 */
public class Math2 {
    public static final double PI = Math.PI;
    public static final double E = Math.E;

    public static int max(int a, int b){
        if (a >= b){
            return a;
        }
        return b;
    }
    public static double max(double a, double b){
        if (a >= b){
            return a;
        }
        return b;
    }
    public static int pow(int base, int exp){
        int val = base;

        for (int i = 1; i < exp ; i++){
            val *= base;
        }
        return val;
    }

}
