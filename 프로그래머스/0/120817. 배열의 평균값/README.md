# [level 0] 배열의 평균값 - 120817 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120817?language=java) 

### 성능 요약

메모리: 86.5 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 08월 30일 21:28:53

### 나의 풀이 코드블록

``` java
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
