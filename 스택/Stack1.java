package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

//백준 10828
public class Stack1 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Stack<String> stack = new Stack<>();

        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            String input = bufferedReader.readLine();
            String[] command = input.split(" ");

            switch (command[0]) {
                case "push": {
                    String num = command[1];
                    stack.push(num);
                    break;
                }
                case "pop": {
                    if (stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                }
                case "size": {
                    System.out.println(stack.size());
                    break;
                }
                case "empty": {
                    System.out.println(stack.empty() ? 1 : 0);
                    break;
                }
                case "top": {
                    if (stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
                }
            }
        }
    }
}
