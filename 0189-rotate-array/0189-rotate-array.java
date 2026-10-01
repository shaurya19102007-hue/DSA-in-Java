class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;                 // handle k > n
        if (k == 0) return;     // no rotation needed
        
        reverse(nums, 0, n - 1);   // reverse whole
        reverse(nums, 0, k - 1);   // reverse first k
        reverse(nums, k, n - 1);   // reverse rest
    }
    
    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}