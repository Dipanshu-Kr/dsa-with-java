public class PrintCharacters {

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++)
            System.out.print(str.charAt(i) + " ");
    }

    public static void main(String[] args) {
        String fullName = "Dipanshu Kumar";
        printString(fullName);
    }
}
