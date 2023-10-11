package org.example;

class Point{
    private int x,y; //한점을 구성하는 x,y 좌표
    public void set(int x,int y){
        this.x = x; this.y = y;
    }
    public void showPoint(){
        System.out.println("(" + x + "," + y + ")");
    }
}
class ColorPoint extends Point {
    private String color; //점의 색
    public void setColor(String color){
        this.color = color;
    }
    public void showColorPoint(){//컬러 점의 좌표 출력
        System.out.print(color);
        showPoint();
    }
}

public class ColorPointEx03 {
    public static void main(String[] args){
        Point p = new Point();
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("RED");
        cp.showColorPoint();
    }
}
