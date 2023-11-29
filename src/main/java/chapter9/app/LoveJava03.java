package chapter9.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoveJava03 extends JFrame {
    JLabel la = new JLabel("Love Java"); //라벨 생성
    public LoveJava03(){
        setTitle("+,-키로 폰트 크기 조정");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); //컨텐트팬 알아 내기
        contentPane.setLayout(null); //레이아웃 삭제
        contentPane.addKeyListener(new MyKeyListener()); //키 리스너 추가하기
        //label 객체 설정
        la.setFont(new Font("Consolas",Font.PLAIN, 10));
        la.setSize(100,30);
        la.setLocation(50,50);
        //la를 컨텐트팬에 등록
        contentPane.add(la);
        setSize(200,200);
        setVisible(true);

        contentPane.setFocusable(true);
        contentPane.requestFocus(); //컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정


    }
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            Font f = la.getFont(); //현재 la 폰트 객체 얻기
            int size = f.getSize(); //폰트 크기 알아내기
            int keyCode = e.getKeyCode();
            System.out.println(keyCode);
            switch (keyCode){
                case 61: //VK_PLUS 대체
                    la.setFont(new Font("Consolas",Font.PLAIN, size+5));

                    break;
                case KeyEvent.VK_MINUS:
                    la.setFont(new Font("Consolas",Font.PLAIN, size-5));
                    //System.out.println(keyCode);
                    break;
            }

        }
    }
    public static void main(String[] Args){
        new LoveJava03();
    }
}


