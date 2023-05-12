package day16.api.io.buffered;

import java.io.*;
import java.util.*;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		/*
		 * BufferedReader는 입력에 대한 성능향샹 보조스트림 입니다
		 * 
		 * Reader클래스와 같이 사용됩니다
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\Java\\file\\test.txt";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {						
			//String result = br.readLine(); //한줄씩 읽음
			//System.out.println(result);
			
			String result;
			while((result=br.readLine())!=null) {
				System.out.println(result);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
