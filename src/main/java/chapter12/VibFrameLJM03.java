package chapter12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class VibFrameLJM03 extends JFrame implements Runnable {
    private Thread th; // 진동하는 스레드
    private Color[] colors = {Color.RED, Color.YELLOW, Color.BLUE,Color.green, new Color(128,0,128), new Color(255,0,0), new Color(0,255,0), new Color(0,0,255)};
    public VibFrameLJM03() {
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);
        setLocation(300,300);
        setVisible(true);

        getContentPane().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if(!th.isAlive()) return;
                th.interrupt();
            }
        });
        th = new Thread(this); // 진동하는 스레드 객체 생성
        th.start(); // 진동 시작
    }
    @Override
    public void run() { // 프레임의 진동을 일으키기 위해
        // 20ms마다 프레임의 위치를 랜덤하게 이동
        Random r = new Random();

        while(true) {
            try {
                Thread.sleep(20); // 20ms 잠자기
            }
            catch(InterruptedException e){
                return; // 리턴하면 스레드 종료
            }
            this.setBackground(colors[r.nextInt(colors.length)]);
            int x = getX() + r.nextInt()%5; // 새 위치 x (-4~4)
            int y = getY() + r.nextInt()%5; // 새 위치 y (-4~4)
            setLocation(x, y); // 프레임의 위치 이동
        }
    }
    public static void main(String [] args) {
        new VibFrameLJM03();
    }
}
