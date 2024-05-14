package 큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

//백준 10845
public class Queue1 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Deque<String> queue = new LinkedList<>();

        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            String input = bufferedReader.readLine();
            String[] command = input.split(" ");

            switch (command[0]) {
                case "push": {
                    String num = command[1];
                    queue.add(num);
                    break;
                }
                case "pop": {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.remove());
                    }
                    break;
                }
                case "size": {
                    System.out.println(queue.size());
                    break;
                }
                case "empty": {
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                }
                case "front": {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.getFirst());
                    }
                    break;
                }
                case "back": {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.getLast());
                    }
                    break;
                }
            }
        }
    }
}
