package edu.kh.network.server.model.service; // 패키지 선언: 클래스의 소속 디렉토리를 지정

import java.io.BufferedReader; // BufferedReader 클래스 import: 문자 기반 입력 스트림에서 텍스트를 효율적으로 읽기 위한 클래스
import java.io.InputStream; // InputStream 클래스 import: 바이트 기반 입력 스트림의 최상위 클래스
import java.io.InputStreamReader; // InputStreamReader 클래스 import: 바이트 스트림을 문자 스트림으로 변환하는 클래스
import java.io.OutputStream; // OutputStream 클래스 import: 바이트 기반 출력 스트림의 최상위 클래스
import java.io.PrintWriter; // PrintWriter 클래스 import: 문자 기반 출력 스트림, 자동 flush 기능 지원
import java.net.ServerSocket; // ServerSocket 클래스 import: 서버 소켓 클래스, 클라이언트의 연결 요청을 수락
import java.net.Socket; // Socket 클래스 import: 클라이언트와 서버 간의 통신을 위한 소켓 클래스
import java.text.SimpleDateFormat; // SimpleDateFormat 클래스 import: 날짜 포맷을 지정하는 클래스
import java.util.Date; // Date 클래스 import: 날짜 및 시간 정보를 나타내는 클래스

public class ServerService { // ServerService 클래스 선언
	/*TCP
	 * - 서버, 클라이언트간 1:1 소켓통신 (연결 지향적 프로토콜)
	 *  
	 * - 데이터 전송 순서가 보장되고,
	 *   수신 여부를 판단하여 오류 발생 시 재전송함.  
	 *  
	 * * java.net 패키지에서 제공하는
	 *   Socket, ServerSocket 클래스를 사용해야함.
	 *  
	 *   Socket
	 * - 프로세스의 양 끝단(프로세스간의 통신을 담당)
	 * - Input/OutputStream 보유하고 있음.
	 *
	 *   ServerSocket
	 * - 포트와 연결되어 외부 요청을 기다리는 객체
	 * - 클라이언트의 연결 요청이 들어오면
	 *   클라이언트의 소켓을 얻어와 연결하게 된다.
	 *
	 * - 하나의 포트에는 하나의 ServerSocket만 연결 가능
	 * */
	public void serverStrat() { // serverStart() 메서드 선언: 서버 시작 로직 구현

		int port = 8500; // port 변수 선언 및 초기화: 서버의 포트 번호

		ServerSocket serverSocket = null; // serverSocket 변수 선언: 서버 소켓
		Socket clientSocket = null; // clientSocket 변수 선언: 클라이언트 소켓

		// 클라이언트 입/출력 내용
		InputStream is = null; // InputStream 변수 선언: 입력 스트림
		OutputStream os = null; // OutputStream 변수 선언: 출력 스트림

		// 클라이언트 소켓에서 입력을 문자 단위로 읽기 위해 BufferedReader 생성
		BufferedReader br = null; // BufferedReader 변수 선언: 문자 기반 입력 스트림
		// 클라이언트 소켓으로 문자열을 보내기 위해 PrintWriter 생성
		PrintWriter pw = null; // PrintWriter 변수 선언: 문자 기반 출력 스트림

		try { // 예외 처리: try 블록 시작
			serverSocket = new ServerSocket(port); // 서버 소켓 생성: 8500 포트에 바인딩
			System.out.println("[Server]"); // 서버 시작 메시지 출력
			System.out.println("클라이언트의 요청을 기다리고 있습니다..."); // 클라이언트 연결 대기 메시지 출력

			// serverSocket.accept()는 클라이언트 연결이 올 때까지 블로킹(대기)함.
			clientSocket = serverSocket.accept(); // 클라이언트 연결 수락: 연결 요청이 올 때까지 대기
			System.out.println("클라이언트가 연결되었습니다."); // 클라이언트 연결 성공 메시지 출력

			// 연결된 클라이언트의 입출력 스트림을 받아옴.
			is = clientSocket.getInputStream(); // 클라이언트 소켓에서 입력 스트림 얻어오기
			os = clientSocket.getOutputStream(); // 클라이언트 소켓에서 출력 스트림 얻어오기

			// 받아온 입출력 스트림을 - 보조 스트림에 담아 - 성능 개선
			br = new BufferedReader(new InputStreamReader(is)); // BufferedReader 객체 생성: 입력 스트림을 문자 기반으로 읽기
			// flush -> 스트림의 있는 내용을 밀어냄
			pw = new PrintWriter(clientSocket.getOutputStream(), true); // PrintWriter 객체 생성: 출력 스트림을 문자 기반으로 쓰기, autoflush 활성화

			Date now = new Date(); // 현재 날짜/시간 객체 생성
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss"); // 날짜 포맷 지정

			pw.println(sdf.format(now) + " [서버 접속 성공]"); // 서버 접속 성공 메시지 전송

			String clientMessage = br.readLine(); // 클라이언트로부터 메시지 한 줄 읽어오기

			System.out.print(clientSocket.getInetAddress().getHostAddress() + " 클라이언트로부터 전달받은 메세지 : "); // 클라이언트 IP 주소와 함께 메시지 출력
			System.out.println(clientMessage); // 클라이언트 메시지 콘솔에 출력

		} catch (Exception e) { // 예외 처리: 예외 발생 시
			// TODO: handle exception
			e.printStackTrace(); // 예외 정보 출력
		} finally { // 예외 처리: try 블록 실행 후 항상 실행
			// 클라이언트와의 통신을 마쳤으므로 소켓 닫기
			try { // 예외 처리: try 블록 시작
				if (br != null)
					br.close(); // BufferedReader 닫기
				if (pw != null)
					pw.close(); // PrintWriter 닫기
				clientSocket.close(); // 클라이언트 소켓 닫기
			} catch (Exception e) { // 예외 처리: 예외 발생 시
				// 소켓 닫기 실패 시 예외 처리(실무에서는 로깅)
				e.printStackTrace(); // 예외 정보 출력
			}
		}
	}
}
