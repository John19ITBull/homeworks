package by.overone.lesson15;

public class Task6 {
    public static void main(String[] args) {
        String str = "jjjjeebbb";
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == str.length() - 1) {
                str2.append(str.charAt(i));
                break;
            }
            if (ch != str.charAt(i + 1)) {
                str2.append(ch);
            }
        }
        System.out.println(str2);
    }
}
