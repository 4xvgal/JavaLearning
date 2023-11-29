package chapter8.app;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutEx03 extends JFrame {
    public FlowLayoutEx03() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        // 왼쪽 정렬, 수평 간격 30, 수직 간격 40 픽셀로 배치하는 FlowLayout 생성
        contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 40));
        for(int i=1;i<=15;i++){
            contentPane.add(new JButton("버튼" + i));
        }

        setSize(800, 400); // 프레임 크기 800*400 설정
        setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new FlowLayoutEx03();
    }
}