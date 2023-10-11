package org.example;


//ex5-7
interface PhoneInterface { //인터페이스 선언
    final int TIMEOUT =1000; // 상수필드 선언
    void sendCall();    //추상 메소드
    void receiveCall();     //추상 메소드
    default void printLogo() {  //default 메소드
        System.out.println("** Phone **");
    }

}
class Calc { //클래스 작성
    public int calculate(int x, int y) { return x + y;}
}
//Smartphone 클래스는 Calc를 상속받고, PhoneInterface 인터페이스의 추상 메소드 모두 구현
class SmartPhone03 extends Calc implements PhoneInterface{
    //PhoneInterface 의 추상 메소드 구현
    @Override
    public void sendCall() { System.out.println("따르릉따르릉 ~~");}
    @Override
    public void receiveCall() {System.out.println("전화 왔어요.");}
    //추가 작성한 메소드
    public void schedule() { System.out.println("일정 관리 합니다. ");}
}

public class InterfaceEx03 {        // Calc 클래스를 상속받고 PhoneInterface의 추상메소드가 구현된 Smartphone03 클래스를 실행함
    public static void main(String[] args) {
        SmartPhone03 phone03 = new SmartPhone03();
        phone03.printLogo();
        phone03.sendCall();
        System.out.println("3과 5를 더하면 " + phone03.calculate(3,5));
        phone03.schedule();
    }
}