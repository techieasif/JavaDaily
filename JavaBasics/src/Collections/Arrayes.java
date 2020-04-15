package Collections;

/**
 * Created by @techieasif on March, 2020
 */

public class Arrayes {
    public static void main(String[] args) {
        int[] a = {14, 27, 1, 4, 2, 50, 3, 1};
        int[] b = {2, 4, -4, 3, 1, 1, 14, 27, 50};
        int result = Arrayes.solution(a, b);
        System.out.println(result);
    }

    //foo bar challenge 1 :  solution 13th april 2020
    //find elements which are different in 2 arrays.

    public static int solution(int[] x, int[] y) {
        int[] a;
        int[] b;
        if (x.length > y.length) {
            a = x;
            b = y;
        } else {
            a = y;
            b = x;
        }

        for (int l : a) {
            boolean contain = false;
            for (int j : b) {
                if (l == j) {
                    contain = true;
                    break;
                }
            }
            if (!contain) {
                return l;
            }
        }
        return -1;
    }
}