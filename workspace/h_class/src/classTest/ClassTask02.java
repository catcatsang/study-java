package classTest;

//   화면
//   학생의 점수를 입력받은 뒤 총점과 평균을 출력한다.
//   학생의 점수는 생성자로 초기화한다.
//   모든 학생은 공통적으로 총점과 평균을 가지고 있다.

// 	학생 = 총점,평균
// 	기능 = 총점과 평균을 출력
//  
public class ClassTask02 {

	public static void main(String[] args) {
		Subject[] arSubject = { new Subject("국어", 30), new Subject("영어", 100), new Subject("수학", 70) };
		
		

		Student ted = new Student(1, arSubject);

		System.out.println(ted.total);
		System.out.println(ted.average);
	}
}