package chapter6.app;

import java.util.StringTokenizer;

//ex6-7
public class StringTokenizerEx03 {
    public static void main(String[] args) {
        String query = "name = kitae &&addr = seoul&age =21";
        StringTokenizer st = new StringTokenizer(query, "&");

        int n = st.countTokens(); // 분리된 토큰 개수
        System.out.println("토큰 개수 = " + n);
        while (st.hasMoreElements()) { //for(int i=0;i<n;i++) 와 동일
            String token = st.nextToken(); //토큰 얻기
            System.out.println(token); //토큰 출력
        }
    }
}
