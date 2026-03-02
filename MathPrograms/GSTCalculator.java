import java.util.*;

public class GSTCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float pencil = sc.nextFloat();

        float gst = (pen + eraser + pencil) * 0.18f;
        float total = pen + eraser + pencil + gst;

        System.out.println(gst);
        System.out.println(total);
    }
}
