package chapter12;
import java.awt.*;
import javax.swing.*;
class TimerThread extends Thread {
    private JLabel timerLabel; // 타이머 값이 출력되는 레이블
    private Color[] colors = {Color.RED, Color.YELLOW, Color.BLUE,Color.green, new Color(128,0,128), new Color(255,0,0), new Color(0,255,0), new Color(0,0,255)};
    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }
    // 스레드 코드. run()이 종료하면 스레드 종료
    @Override
    public void run() {
        int n=0; // 타이머 카운트 값
        int colorIndex = 0; //글자색 인덱스
        int trcount=0; //스레드 sleep 카운트
        while(true) { // 무한 루프
            timerLabel.setText(Integer.toString(n));
            n++; // 카운트 증가
            try {
                Thread.sleep(100); // 1초동안 잠을 잔다.
                trcount+=100;
                if (trcount==2000){
                    trcount=0;
                    colorIndex++;
                    if (colorIndex==colors.length){
                        colorIndex=0;
                    }
                    timerLabel.setForeground(colors[colorIndex]);
                }
            }
            catch(InterruptedException e) {    return;}
        }
    }
}

public class ThreadTimerLJM03 extends JFrame {
    public ThreadTimerLJM03() {
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        // 타이머 값을 출력할 레이블 생성
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 120));
        c.add(timerLabel);

        TimerThread th = new TimerThread(timerLabel);
        setSize(500,300);
        setVisible(true);
        th.start(); // 타이머 스레드의 실행을 시작하게 한다.
    }

    public static void main(String[] args) {
        new ThreadTimerLJM03();
    }
}
