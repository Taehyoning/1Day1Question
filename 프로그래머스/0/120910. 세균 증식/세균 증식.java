class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int sum = n;
        for(int i=1; i<=t; i++){
            sum *= 2 ;  
        }
        
        return sum;
    }
}