package chapter14;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcClientLJM {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 서버로부터 읽기 위한 Reader
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //	서버로 보내기 위한 Writer
			while (true) {
				System.out.print("계산식을 입력하세요 (빈칸으로 띄어 입력, 예 24 + 42) >>");
				String outputMessage = scanner.nextLine();
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("계산결과 : " + inputMessage);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("에러");
			}
		}
	}
}