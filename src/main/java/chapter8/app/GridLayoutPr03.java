package chapter8.app;

import java.awt.*;
import javax.swing.*;

public class GridLayoutPr03 extends JFrame {
    public void GirdLayoutPr03() {

        setTitle("GridLayoutPr03");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //컨텐트 팬 get
        Container contentPane = getContentPane();
        //1x10 의 GridLayout 배치 관리자
        contentPane.setLayout(new GridLayout(1,10));


        //for

        for(int i=0;i<10;i++) {
            String text = Integer.toString(i); // 정수  i 를 문자열로 변
            JButton button = new JButton(text); // 버튼 컴포넌트 설
             contentPane.add(button);
        }

        //프레임 설정

        setSize(400,200);
        setVisible(true);
    }

    public static void main(String [] args) {
        new GridLayoutPr03();
    }
}
