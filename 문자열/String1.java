package 문자열;

import java.util.*;

//백준 2675
public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt();
            String s = scanner.next();

            System.out.println(makeString(r, s));
        }
    }

    public static String makeString(int r, String s) {
        StringBuffer answer = new StringBuffer();

        for (char c : s.toCharArray()) {
            for (int i = 0; i < r; i++) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}