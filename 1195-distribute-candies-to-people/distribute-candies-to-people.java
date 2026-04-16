class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 0;
        int give = 1;

        while (candies > 0) {
            res[i] += Math.min(candies, give);
            candies -= give;
            give++;
            i = (i + 1) % num_people;
        }

        return res;
    }
}