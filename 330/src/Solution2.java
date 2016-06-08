/**
 * Created by yunxiaozou on 6/8/16.
 */
public class Solution2 {
    int minPatches(int[] nums, int n) {
        long miss = 1, added = 0;
        int i = 0;
        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i++];
            } else {
                miss += miss;
                added++;
            }
        }
        return (int)added;
    }
}
