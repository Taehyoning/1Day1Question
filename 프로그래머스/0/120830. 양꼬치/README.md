# [level 0] 양꼬치 - 120830 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120830) 

### 성능 요약

메모리: 82 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 08월 31일 22:53:44

### 내가 푼 코드 블록

``` java
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer = n * 12000 + k * 2000 - (n / 10) * 2000;
        return answer;
    }
}



> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
