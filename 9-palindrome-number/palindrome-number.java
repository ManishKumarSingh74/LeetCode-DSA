class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;
        int num = x;
        int n = 0;
        while(num!=0){
            int rem = num%10;
            n = n*10+rem;
            num = num/10;
        }
        
        if(n==x){
            return true;
        }
        return false;
    }
}