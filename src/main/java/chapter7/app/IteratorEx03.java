package chapter7.app;
import java.util.*;
public class IteratorEx03 {

    public static void main(String[] args) {
        //정수 값만 다루는 제네릭 벡터 생성
        Vector<Integer> v = new Vector<Integer>();

        for(int i=200;i<=1000;i+=100){ //벡터 객체 v 에 200 부터 100단위로 1000까지 삽입
            v.add(i);
        }
        //Iterator를 이용한 모든 정수 출력하기
        Iterator<Integer> it = v.iterator(); //Iterator 객체 얻기
        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }

        //Iterator를 이용하여 모든 정수 더하기
        int sum =0;
        it = v.iterator(); //Iterator 객체 얻기
        while(it.hasNext()){
            int n = it.next();
            sum+=n;
        }
        System.out.println("벡터에 있는 정수 합 : "+sum);
    }
}