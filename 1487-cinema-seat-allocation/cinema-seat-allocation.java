class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> map= new HashMap<>();
        int count=0;
        for(int[] seats:reservedSeats)
        {
            int row=seats[0];
            if(!map.containsKey(row))
            {
                map.put(row,new HashSet<>());
            }
            map.get(row).add(seats[1]);
        }
        count+=(n-map.size())*2;
        for(Set<Integer> booked:map.values())
        {
            boolean left=!(booked.contains(2)||booked.contains(3)||booked.contains(4)||booked.contains(5));  
            boolean right=!(booked.contains(6)||booked.contains(7)||booked.contains(8)||booked.contains(9));  
            boolean middle=!(booked.contains(4)||booked.contains(5)||booked.contains(6)||booked.contains(7));

            if(left&&right) count+=2;
            else if(left||right||middle)count+=1;
        }
        return count;
    }
}