package String.ex07;

import java.util.Scanner;

public class Main {
    public static String solution(String input1) {
        String answer = "YES";
        char[] s = input1.toUpperCase().toCharArray();
        int lt = 0;
        int rt = input1.length()-1;
        while (lt < rt) {
            if (s[lt] != s[rt]) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;

        }

        return answer;
    }

    public static String solution2(String input1){
        String answer="YES";
        input1=input1.toUpperCase();
        int len=input1.length();
        for(int i=0; i<len/2; i++){
            if(input1.charAt(i)!=input1.charAt(len-i-1)) answer="NO";
        }
        return answer;
    }

    public static String solution3(String input1){
        String answer="NO";
        String tmp=new StringBuilder(input1).reverse().toString();
        if(input1.equalsIgnoreCase(tmp)) answer="YES";
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

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.*/
