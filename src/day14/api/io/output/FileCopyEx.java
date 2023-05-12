package day14.api.io.output;

import java.io.*;
import java.util.Arrays;

public class FileCopyEx {

	public static void main(String[] args) {

		/*
		 * FileInputStream, FileOutputStream은
		 * 동영상, 이미지 파일을 읽거나 쓸 때 사용합니다
		 * 
		 */


		String readPath = "C:\\Users\\user\\Desktop\\course\\Java\\file\\메서드1.mp4";
		String writePath = "C:\\Users\\user\\Desktop\\course\\Java\\filecopy\\메서드1_copy.mp4";

		//향상된 try ~ catch문 
		//Closeable 인터페이스를 상속받는 클래스만 사용 가능
		//close 작업을 대신 함



		//여러값이면 ;으로 구분, 마지막은 빼기
		try(InputStream is = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath)) {



			//읽음
			byte[] arr = new byte[2048]; //2kb

			int result;
			while((result = is.read(arr)) != -1) { //읽은 값이 -1이 아닐때까지

				//쓰기
				out.write(arr, 0, result); //arr데이터를 0에서 바이트배열의 result까지만 씀

			}

		} catch(Exception e) {
			e.printStackTrace();

		} 
//		finally { 생략 가능
//			try {
//				is.close();
//				out.close();
//			} catch(Exception e2) {
//				System.out.println("파일close에러");
//			}
//		}

		System.out.println("프로그램 정상 종료");

	}

}
