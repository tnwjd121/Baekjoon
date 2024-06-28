class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean [n+1];
        for(int i=2; i<=n; i++){
            isPrime[i] = true;
        }
        
        for(int i=2; i*i<=n; i++)  {
            if(isPrime[i]){
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(isPrime[i]){
                answer++;
            }
        }
        
        return answer;
    }
}