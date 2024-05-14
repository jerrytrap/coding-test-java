package 문자열;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

//백준 10809
public class String2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        int[] count = new int[26];
        Arrays.fill(count, -1);

        for (int i = 0; i < s.length; i++) {
            int order = s[i] - 'a';

            if (count[order] == -1) {
                count[order] = i;
            }
        }

        String answer = Arrays.stream(count)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(answer);
    }
}
