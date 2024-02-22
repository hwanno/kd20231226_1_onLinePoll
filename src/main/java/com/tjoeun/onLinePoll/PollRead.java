package com.tjoeun.onLinePoll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PollRead {

//	텍스트 파일의 이름을 넘겨받고 내용을 읽어서 Arraylist에 저장하고 리턴하는 메소드
	public static ArrayList<String> pollRead(String filepath){
		
	ArrayList<String> poll = null; // 텍스트 파일의 내용을 읽어서 리턴시킬 객체를 선언한다.
	Scanner scanner = null; // 텍스트 파일의 내용을 읽어들일 스캐너를 선언한다.
		
		try {
			scanner = new Scanner(new File(filepath));
			poll = new ArrayList<String>();
			
//			파일의 끝까지(더 이상 읽어들일 줄이 없을 때 까지) 반복하며 텍스트 파일의 내용을 읽어서 
//			ArrayList에 저장한다.
			while (scanner.hasNextLine()) {
//				System.out.println(scanner.nextLine().trim());
				String str = scanner.nextLine().trim();
//				줄이 빈 줄이 아닐 때 ArrayList에 저장한다.
				if (str.length() > 0) {
					poll.add(str);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("경로가 틀렸거나 디스크에 파일이 존재하지 않습니다.");
		}
		
		return poll;
		
		
		
	}
}
