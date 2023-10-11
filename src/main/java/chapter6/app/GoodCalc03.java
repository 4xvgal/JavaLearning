package chapter6.app;
import chapter6.lib.Calculator03;
//chapter6.app.Calculator03
public class GoodCalc03 extends Calculator03 {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }
    public double average(int [] a) {
        double sum = 0;
        for(int i=0;i<a.length;i++) {
            sum+= a[i];
        }
        return sum/a.length;
    }
    //main
    public static void main(String [] args) {
        Calculator03 c = new GoodCalc03();
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int [] {2,3,4}));
    }
}
