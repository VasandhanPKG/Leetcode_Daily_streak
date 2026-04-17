class Solution {
    public boolean checkRecord(String s) {
        int late_days=0;
        int leave_days=0;
        for(char ch:s.toCharArray())
        {
            switch(ch)
            {
                case 'A':
                    leave_days++;
                    if(leave_days>=2) return false;
                    late_days=0;
                    break;
                case 'L':
                    late_days++;
                    if(late_days>2) return false;
                    break;
                default:
                    late_days=0;
                    

            }
           
        }
        return true;
        
    }
}