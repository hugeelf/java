package Seminars.Seminar_02;

public class program {
    public static String compressor(String str) {
        StringBuilder sb = new StringBuilder("");
        int counter = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                counter++;
            } else {
                if (counter != 1) {
                    sb.append(counter + (Character.toString(str.charAt(i - 1))));
                    counter = 1;
                }
                else {
                    sb.append((Character.toString(str.charAt(i - 1))));
                }
            }
        }
        sb.append(counter + Character.toString(str.charAt(str.length() - 1)));

        return sb.toString();
    }

    public static void main(String[] args) {
        String startString = "aaaabbbcddd";
        System.out.println(compressor(startString));
    }
}
