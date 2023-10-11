package org.example;
import java.util.Scanner;

//ch5-6
abstract class Shape {
    private Shape next;

    public Shape() {
        next = null;
    }

    public void setNext(Shape obj) {
        next = obj;
    }

    public Shape getNext() {
        return next;
    }

    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

public class ShapeEditor03 {
    public static void main(String[] args) {
        //입출력 관련
        Scanner scanner = new Scanner(System.in);
        int input;
        //반복문 제어 변수
        boolean loop = true;
        //추상 클래스 배열 선언 및 할당
        Shape[] array = new Shape[100];

        int i = 0;  // 반복문 초기화 변수

        while (loop) {
            System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)");
            input = scanner.nextInt();   //메뉴 입력

            switch (input) {
                case 1: // 삽입
                    System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >>");
                    int shapeInput = scanner.nextInt(); //도형 종류 입력

                    if (i < array.length) { //배열이 가득차지 않았는지 확인
                        if (shapeInput == 1) { // Line
                            Line tmp = new Line();
                            array[i] = tmp; //Line 을 Shape array 에 할당
                        } else if (shapeInput == 2) { // Rect
                            Rect tmp = new Rect();
                            array[i] = tmp; //Rect 을 Shape array 에 할당
                        } else if (shapeInput == 3) { // Circle
                            Circle tmp = new Circle();
                            array[i] = tmp; // Circle 을 Shape array 에 할당
                        }
                        i++;
                    } else { // 위에서 배열이 가득 찼다면 해당 else 문 실행
                        System.out.println("배열이 가득 찼습니다.");
                    }
                    break;
                case 2: // 삭제
                    System.out.print("삭제할 도형의 위치 >>");
                    int deleteInput = scanner.nextInt();

                    if (deleteInput >= 0 && deleteInput < i) { // 입력된 인덱스가 0 보다는 크고 현재 배열의 크기인 i 보다는 작은지 확인
                        array[deleteInput] = null; // Null을 할당하여 객체 삭제
                    } else { //인덱스가 잘못되면 출력
                        System.out.println("삭제할 수 없습니다.");
                    }
                    break;
                case 3: // 보기
                    for (int j = 0; j < i; j++) {
                        if (array[j] != null) { // 배열의 객체가 null 이 아니면 객체를 출력
                            array[j].draw(); //각 클래스의 draw 함수 실행
                        }
                    }
                    break;
                case 4: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    loop = false; //종료시에 반복제어문을 false로 설정
                    break;
                default:
                    System.out.println("잘못된 입력입니다."); //메뉴의 잘못된 입력 예외처리
                    break;
            }
        }
    }
}
