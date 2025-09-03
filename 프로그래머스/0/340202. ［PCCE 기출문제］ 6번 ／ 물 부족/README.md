# [level 0] [PCCE 기출문제] 6번 / 물 부족 - 340202 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340202) 

### 성능 요약

메모리: 85.2 MB, 시간: 0.06 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 09월 03일 22:28:26

### 내 풀이 코드
``` java

class Solution {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
         //usage = total_usage * change[i] / 100; < 수정 (전) (후) >  //  usage += usage * change[i] / 100;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
