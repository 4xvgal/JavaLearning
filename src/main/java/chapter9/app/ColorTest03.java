package chapter9.app;

import chapter8.app.GridLayoutPr03;

import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.Random;

public class ColorTest03 extends JFrame {
    public ColorTest03() {
        setTitle("3x4 컬러 프레임");  // 프레임의 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 프레임을 닫을 때 프로그램 종료

        // 컨텐트 팬을 가져옵니다.
        Container c = getContentPane();

        // 3x4 그리드 레이아웃 배치 관리자를 설정합니다.
        c.setLayout(new GridLayout(3, 4));

        for (int i = 0; i < 12; i++) {
            String text = Integer.toString(i);
            JLabel la = new JLabel(text);
            la.setBackground(Color.WHITE);  // 라벨의 배경색을 초기화하고 투명으로 설정
            la.setOpaque(true);

            la.addMouseListener(new RandomColorMouseListener());  // 랜덤 색상을 설정할 마우스 리스너를 추가
            c.add(la);
        }
        // 프레임 설정
        setSize(400, 200);  // 프레임의 크기 설정
        setVisible(true);  // 프레임을 화면에 표시

        c.setFocusable(true);
        c.requestFocus(); // 컨텐트팬이 키 입력을 받을 수 있도록 포커스를 강제 지정합니다.
    }

    class RandomColorMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            Random random = new Random();
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            JLabel la = (JLabel) e.getSource();

            la.setBackground(randomColor);  // 랜덤 색상으로 라벨의 배경색 설정
            la.setOpaque(true);

            System.out.println("마우스 누름");
        }
    }

    public static void main(String[] args) {
        new ColorTest03();  // ColorTest03 클래스의 객체를 생성하여 프로그램 실행
    }
}
