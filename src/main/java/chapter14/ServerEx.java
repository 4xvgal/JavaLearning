package chapter14;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999); //서버 소켓 생성
			System.out.println("연결을 기다리고 있습니다.");
			socket = listener.accept(); //클라이언트로부터 연결 요청 대기
			System.out.println("연결되었습니다."); //연결됨
			in = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
			while (true) {
				String inputMessage = in.readLine(); //클라이언트로부터 한 행 읽기
				if (inputMessage.equalsIgnoreCase("bye")) { //키보드 입력이 bye이면 연결 종료
					System.out.println("클라이언트에서 bye 로 연결을 종료하였습니다.");
					break; //bye를 받으면 연결종료
				}
				System.out.println("" + inputMessage);
				System.out.print(""); //프롬프트
				String outputMessage = scanner.nextLine(); //키보드에서 한 행 읽기
				out.write(outputMessage + "\n"); //키보드에서 읽은 문자열 전송
				out.flush(); //out의 스트림 버퍼에 있는 모든 문자열 전송
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close(); //scanner 닫기
				socket.close(); //통신용 소켓 닫기
				listener.close(); //서버 소켓 닫기
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅중 오류가 발생하였습니다.");
			}
		}
	}
}