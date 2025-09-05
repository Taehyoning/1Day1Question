# [level 0] 대소문자 바꿔서 출력하기 - 181949 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181949?language=java) 

### 성능 요약

메모리: 73.9 MB, 시간: 164.93 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 09월 05일 00:13:50

### 내 풀이 코드


``` java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        
        for(int i=0; i < a.length(); i++){
                char c = a.charAt(i);
            if(Character.isLowerCase(c)){
                b+=Character.toUpperCase(c);
            }else{
                b+=Character.toLowerCase(c);
            } 
        }
        System.out.println(b);
}     
}```



``` python

str = input()
str = str.swapcase()
print(str)

```




> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
