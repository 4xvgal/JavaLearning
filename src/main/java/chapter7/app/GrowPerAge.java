package chapter7.app;
import java.util.Vector;
import java.util.Scanner;

//어린이의 키를 2000년부터 2009 사이에 1년 단위로 입력받아 벡터에 저장하라. 그리고 가장 키가 많이 자란 연도를 출력하라 .
public class GrowPerAge {
    public static void main(String[] args) {
        Vector<Integer> height = new Vector<>(); //Integer 스택 생성
        int max = 0;
        int maxYear = 0;

        System.out.println("2000 ~ 2009 년 까지 1년단위로 키 입력");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            //벡터에 입력받기
            height.add(scanner.nextInt());
            if (i > 0 && (height.get(i) - height.get(i - 1)) > max) {
                //System.out.println("i : " + height.get(i) +  "     i-1 : "+height.get(i-1));
                max = height.get(i) - height.get(i-1); //전년대비 키 차이가 max 보다 크면 max 로 교체
                maxYear = i + 1999;
            }
        }

        System.out.println("가장 키가 많이 자란 년도는 " + maxYear + " " + max + "cm");
    }
}
//120 122 125 130 139 160 169 173 175 179