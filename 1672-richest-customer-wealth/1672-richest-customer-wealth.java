class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for( int[] customer : accounts)
        {
        int rowsum = 0;
        for (int value : customer)
        {
        rowsum = rowsum + value;
        }
        maxwealth = Math.max(maxwealth,rowsum);
        }
        return maxwealth;
    }
}
