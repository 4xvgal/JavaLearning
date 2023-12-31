package org.example;
//ex 5-5

abstract class  Calculator {
    public abstract int add(int a, int b); // 두 정수의 합을 구하여 리턴
    public abstract int subtract(int a,int b); // 두 정수의 차를 구하여 리턴
    public abstract double average(int[] a); //정수 배열의 평균 리턴

}
public class GoodCalc03 extends Calculator{ // add 메소드 구현
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b){      // subtract 메소드 구현
        return a-b;
    }

    @Override
    public double average(int[] a){         //average 메소드 구현
        double sum =0;
        for ( int i=0;i<a.length;i++)
            sum+= a[i];
        return sum/a.length;
    }
    public static void main(String [] agrs){
        GoodCalc03 c = new GoodCalc03();
        System.out.println(c.add(2,3));
        System.out.println(c.subtract(2,3));
        System.out.println(c.average(new int [] { 2,3,4} ));
    }
}
