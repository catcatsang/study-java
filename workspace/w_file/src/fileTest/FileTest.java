package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
   public static void main(String[] args) throws IOException{
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
//      bufferedWriter.write("라멘\n");
////      bufferedWriter.newLine();
//      bufferedWriter.close();
      
      BufferedReader bufferedReader = null;
//    예외처리 밖에서 사용하기위해 초기화.
      String line = null;
      
      try {
         bufferedReader = new BufferedReader(new FileReader("test.txt"));
//         BufferedReader 객체화  해서 bufferedReader 안에 담음
//         new FileReader("test.txt") 를 new BufferedReader 로 감싸서 효율적이게 읽을수있게함
         while((line = bufferedReader.readLine()) != null) {
//        	 line 에 bufferedReader 저장된 데이터들을 저장.
            System.out.println(line);
         }
      } catch (FileNotFoundException e) {
         System.out.println("경로를 다시 확인바랍니다.");
      }
      
      bufferedReader.close();
   }
}


















