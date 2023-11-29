package chapter13;
import java.io.*;
public class BinaryCopyLJM03 {
    public static void main(String[] args) {
        String filename = "bin/"+ args[0]+".jpg";
        File src = new File( "bin/example.jpg");
        File dest = new File(filename);
        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            while((c = fi.read()) != -1) {
                fo.write((byte)c);
            }
            fi.close();
            fo.close();
            System.out.println( src.getPath()+ "를 " + dest.getPath()+
                    "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }

}
