package String.e01;

import java.util.Scanner;

public class Main {
    public static int solution(String input1, char input2) {
        int answer = 0;
        input1 = input1.toUpperCase();
        input2 = Character.toUpperCase(input2);

        for (char x : input1.toCharArray()) {
            if (x == input2) {
                answer++;
            }
        }

        return answer;
    }

    public static int solution2(String input1, char input2) {
        int answer = 0;
        input1 = input1.toUpperCase();
        input2 = Character.toUpperCase(input2);

        for (int i = 0; i<input1.length(); i++) {
            if (input1.charAt(i) == input2) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println(solution(input1,input2));
    }
}

//설명
//
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//
//대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
//
//
//입력
//첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
//
//문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//첫 줄에 해당 문자의 개수를 출력한다.