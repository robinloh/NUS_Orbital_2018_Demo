public class Main {
    
    public static int boundary(int i, int lower, int upper) {

        if (i > upper) {
            i = upper;
        }
        
        if (i < lower) {
            i = lower;
        }
        
        return i;
    }


    public static int maximum(int x, int y, int z) {

        if (x >= y) {

            if (x >= z) {
                return x;
            } else {
                return y;
            }

        } else {

            if (x >= y) {
                return y;
            } else {
                return z;
            }

        }

    }

}
