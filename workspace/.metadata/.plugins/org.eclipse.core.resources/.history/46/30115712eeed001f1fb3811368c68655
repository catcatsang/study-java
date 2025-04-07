package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
//   주어진 숫자에 1을 더하는 메소드
   public int plus1(int data) {
      return data + 1;
   }
   
//   주어진 숫자를 두배로 곱하는 메소드
   public int getDoubleTime(int data) {
      return data * 2;
   }

//   주어진 숫자가 짝수인지 확인하는 메소드
   public boolean checkEven(int data) {
      return data % 2 == 0;
   }


   public static void main(String[] args) {

//      배열을 ArrayList로 변경하는 방법
//      Arrays.asList()를 사용하여 배열을 리스트로 변환할 수 있다.
//      배열을 리스트로 변환하면 컬렉션 프레임워크의 기능을 사용할 수 있음
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
      
//      Integer[] arData = {10, 20, 30, 40, 50};
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
      
//      Integer[] arData = new Integer[5];
//      ArrayList<Integer> datas = null;
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (i + 1) * 10;   // 10, 20, 30, 40, 50으로 초기화
//      }
//      
//      datas = new ArrayList<Integer>(Arrays.asList(arData));
//      System.out.println(datas);   // 변환된 ArrayList 출력


//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      Object[] arNumber = null;
//      
//      for (int i = 0; i < 5; i++) {
//         datas.add((i + 1) * 10);   // 10, 20, 30, 40, 50 추가
//      }
//      
//      arNumber = datas.toArray();   // ArrayList를 배열로 변환
//      for (int i = 0; i < arNumber.length; i++) {
//         System.out.println(arNumber[i]);   // 변환된 배열 출력
//      }
      
//      IntStream: 정수를 다루는 Stream API
//      IntStream.range(1, 11).forEach((data) -> {System.out.println(data);});   // 1부터 10까지 출력
//      IntStream.rangeClosed(1, 10).forEach((data) -> {System.out.println(data);});   // 위와 동일
      
//      forEach(): 컬렉션 또는 스트림의 요소를 반복 실행
//      여러 값을 가지고 있는 컬렉션 객체 또는 Stream API에서 forEach 메소드를 사용할 수 있다.
//      ArrayList<String> colors = new ArrayList<String>(Arrays.asList("검은색", "빨간색", "녹색"));
//      colors.forEach((color) -> {System.out.println(color);});   // 람다식을 사용한 반복 출력
//      colors.forEach(System.out::println);   // 메소드 참조 사용한 반복 출력
      
//      map(): 기존 값 변경 (각 요소에 특정 연산을 적용)
      StreamTest streamTest = new StreamTest();
      ArrayList<Integer> datas = new ArrayList<Integer>();
//      
      IntStream.rangeClosed(1, 10).forEach(datas::add);   // 1 ~ 10까지 리스트에 추가
      
//      System.out.println(datas);
//      System.out.println(datas.toString());
      System.out.println(datas.stream());
//      System.out.println(datas.stream().map((data) -> data * 2));
//      System.out.println(datas.stream().map((data) -> data * 2).forEach(System.out::println)));
      
//      datas.stream().map((data) -> data * 2).forEach(System.out::println);   // 각 요소를 2배로 변환해 출력
//      datas.stream().map(streamTest::getDoubleTime).forEach(System.out::println);   // 메소드 참조 사용
      
//      User 클래스의 배열을 ArrayList로 변환 후 Stream API를 활용한 처리
//      User[] arUser = {
//         new User(1, "한동석", 20),
//         new User(2, "허세웅", 15)
//      };
      
//      배열을 ArrayList로 변환
//      ArrayList<User> users = new ArrayList<User>(Arrays.asList(arUser));
//      
//      각 사용자들의 나이를 반으로 줄여 출력
//      users.stream().map((user) -> user.getAge() / 2).forEach(System.out::println);
      
//      위와 동일하지만, 나이를 먼저 추출하고 나누는 방식
//      users.stream().map((user) -> user.getAge()).map((age) -> age / 2).forEach(System.out::println);
      
//      객체의 toString() 구현되어 있어야 정상출력
//      System.out.println(users);
   
//      filter(): 리턴값이 true일 경우만 추출
//      StreamTest streamTest = new StreamTest();
      
//      IntStream.range(1, 11).filter((data) -> data % 2 == 0).forEach(System.out::println);   // 짝수만 출력
//      IntStream.range(1, 11).filter(streamTest::checkEven).forEach(System.out::println);   // 위와 동일
      
//      chars(): 문자열을 IntStream으로 변경
//      "ABC".chars().forEach((data) -> System.out.println((char)data));   // A, B, C 출력
      
//      sorted(): 정렬
//      StreamTest streamTest = new StreamTest();
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.range(0, 10).map(streamTest::plus1).forEach(datas::add);
//      
//      Collections.shuffle(datas);
//      
//      System.out.println(datas);
//      
//      datas.stream().sorted().forEach(System.out::println);   // 오름차순 정렬 후 출력
//      datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);   // 내림차순 정렬 후 출력
      
//      collect(): 결과를 다양한 타입으로 리턴해준다.
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(30, 20, 90, 40, 80));
      
//      List<Integer> sortedDatas = datas.stream().sorted().collect(Collectors.toList());   // 정렬 후 리스트로 저장
//      System.out.println(sortedDatas);   // 정렬된 리스트 출력
//      
//      if(sortedDatas.contains(90)) {
//         System.out.println("90은 존재한다.");
//      }
      
   }
}















