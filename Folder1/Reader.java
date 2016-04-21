import java.util.Scanner;

/**
 * Created by Igor.
 */
public class Reader {
    int q;
    int w;

    public void Scan() {
        System.out.println("Input first number");
        Scanner scanner = new Scanner(System.in);
        q  = scanner.nextInt();
        System.out.println("Input second number");
        w = scanner.nextInt();

    }
}
