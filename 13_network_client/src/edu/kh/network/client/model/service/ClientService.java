package edu.kh.network.client.model.service; // 패키지 선언: 클래스의 소속 디렉토리를 지정

import java.io.BufferedReader; // BufferedReader 클래스 import: 문자 기반 입력 스트림에서 텍스트를 효율적으로 읽기 위한 클래스
import java.io.InputStream; // InputStream 클래스 import: 바이트 기반 입력 스트림의 최상위 클래스
import java.io.InputStreamReader; // InputStreamReader 클래스 import: 바이트 스트림을 문자 스트림으로 변환하는 클래스
import java.io.OutputStream; // OutputStream 클래스 import: 바이트 기반 출력 스트림의 최상위 클래스
import java.io.PrintWriter; // PrintWriter 클래스 import: 문자 기반 출력 스트림, 자동 flush 기능 지원
import java.net.Socket; // Socket 클래스 import: 클라이언트-서버 간의 통신을 위한 소켓 클래스
import java.util.Scanner; // Scanner 클래스 import: 사용자 입력을 받기 위한 클래스

public class ClientService { // ClientService 클래스 선언

	public void clientStart() { // clientStart() 메서드 선언: 클라이언트 시작 로직 구현
		int port = 8500; // port 변수 선언 및 초기화: 서버의 포트 번호

		Socket clientSocket = null; // clientSocket 변수 선언: 클라이언트 소켓

		// 클라이언트 입/출력 내용
		InputStream is = null; // InputStream 변수 선언: 입력 스트림
		OutputStream os = null; // OutputStream 변수 선언: 출력 스트림

		// 클라이언트 소켓에서 입력을 문자 단위로 읽기 위해 BufferedReader 생성
		BufferedReader br = null; // BufferedReader 변수 선언: 문자 기반 입력 스트림
		// 클라이언트 소켓으로 문자열을 보내기 위해 PrintWriter 생성
		PrintWriter pw = null; // PrintWriter 변수 선언: 문자 기반 출력 스트림

		try { // 예외 처리: try 블록 시작
			clientSocket = new Socket("localhost", port); // 클라이언트 소켓 생성: "localhost" 주소의 8500 포트로 연결

			// 서버에 접속한 경우
			if (clientSocket != null) { // 클라이언트 소켓이 null이 아닌 경우 (서버 접속 성공)
				is = clientSocket.getInputStream(); // 클라이언트 소켓에서 입력 스트림 얻어오기
				os = clientSocket.getOutputStream(); // 클라이언트 소켓에서 출력 스트림 얻어오기

				br = new BufferedReader(new InputStreamReader(is)); // BufferedReader 객체 생성: 입력 스트림을 문자 기반으로 읽기
				pw = new PrintWriter(clientSocket.getOutputStream(), true); // PrintWriter 객체 생성: 출력 스트림을 문자 기반으로 쓰기, autoflush 활성화

				String serverMessage = br.readLine(); // 서버로부터 메시지 한 줄 읽어오기
				System.out.println(serverMessage); // 서버 메시지 콘솔에 출력

				Scanner sc = new Scanner(System.in); // Scanner 객체 생성: 사용자 입력 받기
				System.out.print("서버로 전달할 메세지 : "); // 사용자에게 메시지 입력 요청
				String message = sc.nextLine(); // 사용자로부터 메시지 한 줄 입력받기

				pw.println(message); // 서버로 메시지 전송
			}

		} catch (Exception e) { // 예외 처리: 예외 발생 시
			e.printStackTrace(); // 예외 정보 출력
		} finally { // 예외 처리: try 블록 실행 후 항상 실행
			try { // 예외 처리: try 블록 시작
				if (br != null)
					br.close(); // BufferedReader 닫기
				if (pw != null)
					pw.close(); // PrintWriter 닫기
				clientSocket.close(); // 클라이언트 소켓 닫기
			} catch (Exception e) { // 예외 처리: 예외 발생 시
				e.printStackTrace(); // 예외 정보 출력
			}
		}
	}
}
