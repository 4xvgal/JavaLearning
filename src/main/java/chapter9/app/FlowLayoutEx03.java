package chapter9.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutEx03 extends JFrame {
    public FlowLayoutEx03() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        // 왼쪽 정렬, 수평 간격 30, 수직 간격 40 픽셀로 배치하는 FlowLayout 생성
        contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 40));
        for(int i=1;i<=15;i++){
            JButton btn =new JButton("버튼" + i);
            btn.addActionListener(new MyActionListener());
            contentPane.add(btn);
        }

        setSize(800, 400); // 프레임 크기 800*400 설정
        setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new FlowLayoutEx03();
    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource(); //이벤트 소스 버튼 알아내기
        System.out.println(b.getText()); //텍스트를 받아와 콘솔로 출력
    }
}