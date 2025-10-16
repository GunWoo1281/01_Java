package edu.kh.network.server.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService {
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

	public void serverStrat() {
		
	int port = 8500;
	
	ServerSocket serverSocket = null;
	Socket clientSocket = null;
	
	//클라이언트 입/출력 내용
	InputStream is = null;
	OutputStream os = null;
	
	// 클라이언트 소켓에서 입력을 문자 단위로 읽기 위해 BufferedReader 생성
	BufferedReader br = null;
	// 클라이언트 소켓으로 문자열을 보내기 위해 PrintWriter 생성
	PrintWriter pw = null;
	
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
		
			// serverSocket.accept()는 클라이언트 연결이 올 때까지 블로킹(대기)함.
			clientSocket = serverSocket.accept();
			System.out.println("클라이언트가 연결되었습니다.");
            
			//연결된 클라이언트의 입출력 스트림을 받아옴.
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			//받아온 입출력 스트림을 - 보조에 담아 - 성능 개선
			br = new BufferedReader(new InputStreamReader(is));
			//flush -> 스트림의 있는 내용을 밀어냄
			pw = new PrintWriter(clientSocket.getOutputStream(), true);
			
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			
			pw.println(sdf.format(now) + " [서버 접속 성공]");
			
			String clientMessage = br.readLine();

			System.out.print(clientSocket.getInetAddress().getHostAddress() + " 클라이언트로부터 전달받은 메세지 : ");
			System.out.println(clientMessage);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			 // 클라이언트와의 통신을 마쳤으므로 소켓 닫기
            try {
            		if(br != null) br.close();
            		if(pw != null) pw.close();
                clientSocket.close();
            } catch (Exception e) {
                // 소켓 닫기 실패 시 예외 처리(실무에서는 로깅)
                e.printStackTrace();
            }
		}
	}
}
