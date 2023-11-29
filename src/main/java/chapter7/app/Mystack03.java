package chapter7.app;

//제네릭으로 스택 클래스 만들고 point 클래스를 매개변수로 사용하는 스택만들기

//x,y 점 클래스
class Point {
    private int x,y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "(" + x + "," + y +")";
    }

}
//제네릭 스택 선언. 제네릭 타입 T
class GStack<T> {
    int tos;
    Object [] stck; //스택에 저장된 요소의 개수
    public GStack(){
        tos = 0;
        stck = new Object [10];
    }
    public void push(T item) { //삽입함수
        if (tos == 10) //스택이 꽉 차면 더이상 요소를 삽입할수없다.
            return;
        stck[tos] = item;
        tos++;
    }

    public T pop() {
        if (tos == 0)
            return null;
        tos--;
        return (T)stck[tos]; //타입 매개변수 타입으로 캐스팅
    }
}
public class Mystack03 {
    public static void main(String [] args){
        GStack<Point> pointStack = new GStack<Point>(); //String 타입의 GStack 생성
        //(2,3), (-5,20), (30, -8) 푸쉬
        pointStack.push(new Point(2,3) ); //매개변수로 바로 점을 삽입할수없기때문에 객체 생성후 삽입한다.
        pointStack.push(new Point(-5,20));
        pointStack.push(new Point(30,-8));

        for(int n=0;n<3; n++)
            System.out.println(pointStack.pop()); //stringStack에 있는 3개의 문자열 팝
    }
}
