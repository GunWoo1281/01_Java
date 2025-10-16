package edu.kh.network.client.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientService {

	public void clientStart() {
		int port = 8500;
		
		Socket clientSocket = null;
		
		//클라이언트 입/출력 내용
		InputStream is = null;
		OutputStream os = null;
		
		// 클라이언트 소켓에서 입력을 문자 단위로 읽기 위해 BufferedReader 생성
		BufferedReader br = null;
		// 클라이언트 소켓으로 문자열을 보내기 위해 PrintWriter 생성
		PrintWriter pw = null;
		
		try {
			clientSocket = new Socket("localhost", port);
			
			//서버에 접속한 경우
			if(clientSocket != null) {
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
				br = new BufferedReader(new InputStreamReader(is));
				pw = new PrintWriter(clientSocket.getOutputStream(), true);
				
				String serverMessage = br.readLine();
				System.out.println(serverMessage);
				
				Scanner sc = new Scanner(System.in);
				System.out.print("서버로 전달할 메세지 : ");
				String message=sc.nextLine();
				
				pw.println(message);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
				try {
					if(br != null) br.close();
	            		if(pw != null) pw.close();
	                clientSocket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}
