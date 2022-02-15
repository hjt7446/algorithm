package String.e03;

import java.util.Scanner;

public class Main {

    public static String solution(String input1) {
        String a ="";
        int max = Integer.MIN_VALUE;

        String[] s = input1.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len>max) {
                max = len;
                a = x;
            }
        }

        /*int pos = 0;
        while ((pos=input1.indexOf(" ")) != -1) {
            String tmp = input1.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                a = tmp;
            }
            input1 = input1.substring(pos+1);
        }
        if (input1.length()>max) a = input1;*/
        return a;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }
}


//설명
//
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//
//문장속의 각 단어는 공백으로 구분됩니다.
//
//
//입력
//첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.

