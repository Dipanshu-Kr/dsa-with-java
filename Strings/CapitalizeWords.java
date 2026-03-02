public class CapitalizeWords {

    public static String capitalize(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i == 0)
                sb.append(Character.toUpperCase(str.charAt(i)));

            else if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' ');
                sb.append(Character.toUpperCase(str.charAt(i + 1)));
                i++;
            }
            else
                sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(capitalize("hi, i am dipanshu"));
    }
}
