package chapter14;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in); //키보드에서 읽으 스캐너 객체 생성
		try {
			socket = new Socket("localhost", 9999); //클라이언트 소켓 설정, 서버에 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //서버로부터 데이터를 읽기 위한 입력 스트림 생성
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //서버로 데이터를 전송하기 위한 출력 스트림 생성
			while (true) {
				System.out.print("보내기 >>"); //프롬프트
				String outputMessage = scanner.nextLine(); //키보드에서 한 행 읽기
				if (outputMessage.equalsIgnoreCase("bye")) { //bye가 입력되면 메시지 전송 후 연결 종료
					out.write(outputMessage+"\n"); //"bye" 문자열 전송
					out.flush();
					break; //사용자가 "bye"를 입력한 경우 서버로 전송 후 연결 종료
				}
				out.write(outputMessage + "\n"); //키보드에서 읽은 문자열 전송
				out.flush();				//out의 스트림 버퍼에 있는 모든 문자열 전송
				String inputMessage = in.readLine(); //서버로부터 한 행 읽기
				System.out.println("" + inputMessage); //서버로부터 받은 메세지를 화면에 출력
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close(); //클라이언트 소켓 닫기
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("서버와 채팅중 오류가 발생하였습니다.");
			}
		}
	}
}