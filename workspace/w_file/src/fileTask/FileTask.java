package fileTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
   public static void main(String[] args) throws IOException {
//      생선 종류를 파일에 출력한 뒤
//      입력받은 내용을 모두 콘솔에 출력한다.
//      생선은 3마리다.
      final String PATH = "fish.txt";
//      파일의 경로이기때문에 상수로 선언 후 저장,

      String[] fishes = { "고등어", "삼치", "연어" };
//     문자열 배열에 fishes 3개의 배열값을 넣음.
      
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH));
//      출력에 해당하는 클래스를 객체화 시킴 과 동시에, 내부적으로 
//      내부적으로 버퍼를 사용하여 데이터를 효율적으로 쓸 수 있도록 도와줍니다.
//      FileWriter() 는 파일에 쓰기 모드로 여는 클래스입니다.
      BufferedReader bufferedReader = null; 
//      예외처리를 하기위해서 초기화하는거임.
      
      String line = null;
//      문자열 line 을 초기화

      for (int i = 0; i < fishes.length; i++) {
         bufferedWriter.write(fishes[i] + "\n");
//         반복문을 돌려서 bufferedWriter 안에 생선 삽입.
      }
      
      bufferedWriter.close();
//      버퍼에있는 데이터들을 모두 파일에 flush 하고 닫음.
      
      
      try {
         bufferedReader = new BufferedReader(new FileReader(PATH));
//         
         while((line = bufferedReader.readLine()) != null) {
//        	 line 이 bufferedReader 에서 Line			한지수: 눌 이라喊
//        	 line 에 bufferedReader 담긴 값들을 한줄씩 null 이 될때까지 담는다
            System.out.println(line);
            
         }	
         
      } catch (FileNotFoundException e) {
         System.out.println("경로를 다시 확인하십시오.");
//           bufferedReader Filed Reader (PATH) 경로를 찾지못하면 예외처리됨
      } finally {
         bufferedReader.close();
//          항상 실행됨
      }
      

//      고등어를 감성돔로 변경
      String temp = "";
      
//      3. 고등어가 아니면 그대로 넣기
//      4. 완성된 문자열로 덮어쓰기
      
      try {
         bufferedReader = new BufferedReader(new FileReader(PATH));
//         PATH 를 bufferedReader 에 담음 
         
         while((line = bufferedReader.readLine()) != null) {
//            line 에 bufferedReader 데이터들을 하나씩 줄바꿈 까지 해서 반복함 null이 될때까지
//            1. 고등어 찾기
            if(line.equals("고등어")) {
//            	line 에 고등어가 있니? 를 묻는 코드
//               2. 고등어 대신 감성돔 넣기
               temp += "감성돔\n";
//             temp 에 고등어를 찾으면 감성돔을 넣음 
             
//               
               continue;
            }
            	
            temp += line + "\n"; 
//            temp 에 line의 값을 넣음.
         }
         
      } catch (FileNotFoundException e) {
    	  
         System.out.println("경로를 다시 확인하십시오.");
         
      } finally {
         bufferedReader.close();
//         bufferedReader Filed Reader (PATH) 경로를 찾지못하면 예외처리됨
      }
      
      bufferedWriter = new BufferedWriter(new FileWriter(PATH));
      bufferedWriter.write(temp);
      bufferedWriter.close();
      
//      감성돔 삭제하기
//      감성돔 마시쪙
      
   }
   
}




















