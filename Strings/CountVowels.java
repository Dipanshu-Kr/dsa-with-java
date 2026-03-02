public class CountVowels {

    public static int lowerCaseVowels(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            switch (ch) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(lowerCaseVowels("Dipanshu"));
    }
}
