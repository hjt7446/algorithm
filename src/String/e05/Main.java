package String.e05;

import java.util.Scanner;

public class Main {
    public static String solution(String input1) {
        String answer;
        char[] s = input1.toCharArray();
        int lt = 0;
        int rt = input1.length()-1;

        /*while (lt < rt) {
            if (!String.valueOf(input1.charAt(lt)).matches("^[a-zA-Z]*$")) {
                System.out.println("lt : " + lt);
                lt++;
            }else if (!String.valueOf(input1.charAt(lt)).matches("^[a-zA-Z]*$")) {
                System.out.println("rt : " + rt);
                rt--;
            }else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }*/
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));
    }
}



/*
설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
*/