package chapter13;

import java.io.*;

public class FileOutputStreamLJM03 {
    public static void main(String[] args) {
        //int b[] = {71, 72, 73, 74, 75};
        byte b[] = {38, 51, 3, 4, -1, 24};
        String filename = "bin/"+ args[0]+".txt";
        try {
            FileOutputStream fout = new FileOutputStream(filename);
            OutputStreamWriter writer = new OutputStreamWriter(fout, "UTF-8");

            for (int i = 0; i < b.length; i++)
                writer.write(b[i]); // 배열 b의 바이너리를 그대로 기록

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(filename+ " 을 저장하였습니다.");
    }
}
