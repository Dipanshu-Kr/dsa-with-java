import java.util.*;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[3];

        for (int i = 0; i < marks.length; i++)
            marks[i] = sc.nextInt();

        for (int i = 0; i < marks.length; i++)
            System.out.print(marks[i] + " ");
    }
}
