# 📘 Java 기본 개념 정리

> 프로그래밍 언어는 개발자와 운영체제가 소통하기 위한 언어이다.

---

## 🧾 용어 정리

### 소스코드

-   명령어를 작성해 놓은 것
-   개발자와 운영체제가 소통할 것을 글로 표현한 것

### 소스파일 (.java)

-   소스코드를 작성해 놓은 파일

### 컴파일 & 컴파일러

-   **컴파일**: 사람의 언어 → 컴퓨터 언어로 바꿔주는 작업
-   **컴파일러**: 컴파일을 해주는 프로그램 (위에서 아래, 좌에서 우로 번역)

### 프로그램

-   소스코드로 잘 짜여진 틀

### 콘솔

-   개발자와 운영체제가 소통한 결과를 보여주는 창

---

## ⚙️ JAVA 프로그램 구조

```txt
JAVA 프로그램
    ↓
  JVM
    ↓
  OS (운영체제)
    ↓
  하드웨어
```

-   **JVM이 OS에 맞게 Java 프로그램을 변환해 줌**

-   **이식성이 좋다**

---

## 🔧 Java 개발 도구 구성

### 🧩 JVM (Java Virtual Machine)

-   Java 프로그램을 실행

### 🧰 JRE (Java Runtime Environment)

-   JVM을 생성하고 실행에 필요한 라이브러리 포함

### 🛠️ JDK (Java Development Kit)

-   JRE + 개발에 필요한 도구 + 컴파일/실행 명령어 포함

---

## 💻 설치 링크

-   [ JDK 설치](https://drive.google.com/file/d/1bsLuMXWQ-yg50m4SNToucnhEBMLSg6He/view?usp=drive_link)
-   [ 이클립스 IDE](https://drive.google.com/file/d/18qYUbfdkXWrX0hbSnvFOuihh9MXI_k7j/view?usp=drive_link)
-   인텔리제이도 사용 가능

---

## 📂 기본 구조

프로젝트 <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ 패키지 <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ 클래스 <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; └─ 메소드 <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ 소스코드

---

## 📤 출력 메소드

| 메소드      | 설명             |
| ----------- | ---------------- |
| `print()`   | 줄바꿈 없이 출력 |
| `println()` | 줄바꿈 포함 출력 |
| `printf()`  | 포맷 지정 출력   |

### 출력 메소드는 왜 쓸까?

-   데이터를 확인하거나 오류를 구체화할 때 사용
-   개발자를 위한 도구

### 예시

```java
System.out.println("A");
System.out.println("B");
System.out.println("C");
System.out.println("D");
```

---

## 📦 변수

---

-   데이터를 저장하는

```
int x = 10;
```

| 종류   | 자료형 | 크기(Byte) | 예시            |
| ------ | ------ | ---------- | --------------- |
| 정수형 | byte   | 1          | 4, -12          |
|        | short  | 2          | 150             |
|        | int    | 4          | 1235            |
|        | long   | 8          | 15161848964L    |
| 실수형 | float  | 4          | 32.12F          |
|        | double | 8          | 182.2341        |
| 문자형 | char   | 2          | 'A', '안'       |
| 문자열 | String | -          | "Hello", "안녕" |

---

## 🕦변수의 초기값

| 자료형 | 기본값   |
| ------ | -------- |
| 정수   | 0        |
| 실수   | 0.0      |
| 문자   | ' '      |
| 문자열 | "", null |

---

## ⚠️ 변수 선언 시 주의사항

1. 같은 이름의 변수로 재선언 불가

2. 초기화 필수

3. 선언부를 모아 작성

4. 변수명은 문자로 시작

5. 특수문자 사용 X (단, 는 허용)

6. 공백 사용 X (ex. good_boy or goodBoy)

7. 한글 사용 지양

8. 명사 형태의 의미 있는 단어 사용

---

## 🔒 상수

```
final int MAX_VALUE = 100;
```

-   변경 불가능한 값

-   의미를 부여하기 위한 용도로 사용

---

## 🔁 형변환

### 자동 형변환

```

3 + 0.0 = 3.0

10 / 3 = 3 (몫이 값)

10 % 3 = 1 (나머지가 값)

'A' + 3 = 68 ('A'는 문자지만, 내부적으로는 아스키 코드값 65로 저장됨)
```

### 자동 형변환

```
(double) 3
```

### 문자열 ↔ 숫자

```
Integer.parseInt("123")
double.parseInt("3.14)
```

# 🧾 입력

-   커서가 깜빡이는 상태 = 입력 가능상태

-   출력을 통해 어떤 값을 입력할지 알려주는 것이 좋다

```
Scanner sc = new Scanner(System.in);
```
