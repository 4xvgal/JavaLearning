package chapter6.app;

//ex6-2
class Point {
    private int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point(" + x + "," +y +")";
    }
}

public class ToStringEx03 {
    public static void main(String []args) {
        Point a = new Point(2,3);
        System.out.println(a.toString());
        System.out.println(a); //a는 a.toString() 으로 자동변환됨
    }
}