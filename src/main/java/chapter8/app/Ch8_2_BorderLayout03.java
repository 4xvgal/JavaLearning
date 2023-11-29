package chapter8.app;
import javax.swing.*;
import java.awt.*;
public class Ch8_2_BorderLayout03 extends JFrame{
    public Ch8_2_BorderLayout03() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); //컨텐트팬알아내기

        //컨텐트팬에 BorderLayout 배치관리자 설정

        contentPane.setLayout(new BorderLayout(30,20));

        contentPane.add(new JButton("North"), BorderLayout.NORTH);
        contentPane.add(new JButton("West"), BorderLayout.WEST);
        contentPane.add(new JButton("Center"), BorderLayout.CENTER);
        contentPane.add(new JButton("East"), BorderLayout.EAST);
        contentPane.add(new JButton("South"), BorderLayout.SOUTH);

        //프레임 크기 지정
        setSize(400,400); //400x400
        setVisible(true); //프레임을 화면에 출력
    }
    public static void main(String[] args) {
        new Ch8_2_BorderLayout03();
    }
}
