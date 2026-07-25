class Solution {
    public int maxProduct(int num) {
        int greatest=0;
        int second_greatest=0;
        while(num>0)
        {
            int dig=num%10;
            if(dig>=greatest)
            {
                second_greatest=greatest;
                greatest=dig;
            }
            else if(second_greatest<dig )
            {
                second_greatest=dig;
            }
            num/=10;
        }
        return second_greatest*greatest;
    }
}