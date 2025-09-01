<img width="848" height="375" alt="image" src="https://github.com/user-attachments/assets/b2b95d7e-a6a2-423a-9354-9f368c5f7c09" /># [level 0] 짝수의 합 - 120831 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120831?language=java) 

### 성능 요약

메모리: 85.7 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 09월 01일 15:49:45

### 나의 풀이

```java
class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        for(int num : numbers){
            sum += num;
            }
        return sum / numbers.length;
    }
}

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
