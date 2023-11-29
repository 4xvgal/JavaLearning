package chapter12;
import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
    private JLabel timerLabel;
    private Color[] colors = {Color.RED, Color.YELLOW, Color.BLUE,Color.green, new Color(128,0,128)};
    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    // 스레드 코드. run()이 종료하면 스레드 종료
    @Override
    public void run() {
        int n=0; // 타이머 카운트 값
        while(true) { // 무한 루프
            timerLabel.setText(Integer.toString(n));
            n++;
             //
            try {
                timerLabel.setForeground(colors[n%colors.length]);
                Thread.sleep(1000); // 1초동안 잠을 잔다.
            }
            catch(InterruptedException e) {    return; }
        }
    }
}

public class RunnableTimerLJM03 extends JFrame {
    public RunnableTimerLJM03() {
        setTitle("Runnable을 구현한 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 타이머 값을 출력할 레이블 생성
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel); // 레이블을 컨텐트팬에 부착

        TimerRunnable runnable = new TimerRunnable(timerLabel);
        Thread th = new Thread(runnable); // 스레드 객체 생성
        setSize(250,150);
        setVisible(true);
        th.start(); // 타이머 스레드가 실행을 시작하게 한다.
    }
    public static void main(String[] args) {
        new RunnableTimerLJM03();
    }
}
