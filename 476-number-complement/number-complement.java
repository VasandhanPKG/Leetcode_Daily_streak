class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;
        int bits = 32 - Integer.numberOfLeadingZeros(num);
        int mask = (1 << bits) - 1;
        return num^mask;
    }
}