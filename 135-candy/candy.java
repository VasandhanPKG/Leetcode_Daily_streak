class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int sum=1;
        int peak=0;
        int down=0;
        int i=1;
        while(i<n)
        {
           if(i<n &&ratings[i]==ratings[i-1])
           { 
             sum+=1;
             i++;
             continue;
           }
           peak=1;
           while(i<n &&ratings[i]>ratings[i-1])
           {
             
             peak++;
             sum+=peak;
             i++;
           }
           down=0;
           while(i<n &&ratings[i]<ratings[i-1])
           {
            
             down++;
            sum+=down;
             i++;
           }
           down++;
           if(down>peak) sum+=(down-peak);

        }
        
        
        return sum;

    }
}