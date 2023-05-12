package day15.api.io.file;

import java.io.*;

public class CreateFileEx {

	public static void main(String[] args) {
		
		/*
		 * File클래스
		 * 외부경로에 폴더 or 단순한 파일 생성이나 삭제를 할 수 있습니다
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\Java\\file\\20230504";
		
		try {
			
			File file = new File(path);
			
			if(file.exists()==false) { //존재하면 true, 존재하지 않으면 false
				file.mkdir(); //makedirectory
				System.out.println("폴더생성완료");
			} else {
				System.out.println("이미 폴더가 존재합니다");
			}
			
			//삭제
			if(file.exists()==true) {
				file.delete();
				System.out.println("폴더 삭제");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} {
			
		}
		

	}

}
