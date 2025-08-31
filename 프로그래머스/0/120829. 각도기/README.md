# [level 0] 각도기 - 120829 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120829) 

### 성능 요약

메모리: 81.7 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 08월 29일 00:16:06


### 내가 푼 코드 블록
```java
class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle > 0 && angle < 90) answer = 1;
        else if (angle == 90) answer = 2;
        else if (angle > 90 && angle < 180) answer = 3;
        else if (angle == 180) answer = 4;
        return answer;
    }
}


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
