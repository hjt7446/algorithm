package String.ex08;

import java.util.Scanner;

public class Main {
    public static String solution(String input1) {
        String answer = "NO";
        input1 = input1.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(input1).reverse().toString();

        if (input1.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }
}
