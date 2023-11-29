package chapter6.app;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ch6_4_tokenizer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // 스캐너 선언
        String input = scanner.nextLine(); //스캐너로 문자열 입력
        input = input.replaceAll("//s","");

        StringTokenizer st = new StringTokenizer(input, "+"); //input 을 '+' 로 구분

        int sum = 0;

        while(st.hasMoreTokens()) {
            String token = st.nextToken(); //토큰 얻기
            token = token.trim(); //토큰 앞 뒤 공백 제거
            sum += Integer.parseInt(token);
        }

        System.out.println("합은 " + sum);
        }
    }

