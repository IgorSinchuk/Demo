/**
 * Created by Igor.
 */
public class Demo {
    public static void main (String[]args) {
        int q = 5;
        int w = 9;

        q = count(q);
        w = count(w);
        System.out.println(q);
        System.out.println(w);
    }

    private static int count(int x) {
        x = x*2;
        return x;
    }
}
