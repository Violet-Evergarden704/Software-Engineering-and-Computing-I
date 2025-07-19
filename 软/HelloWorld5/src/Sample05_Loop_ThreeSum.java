import java.util.Arrays;

public class Sample05_Loop_ThreeSum {

    public static int[] threeSum(int[] nums, int target) {
        int[] origin = new int[nums.length];
        System.arraycopy(nums,0,origin,0,nums.length);
        Arrays.sort(nums);
        int[] ans = new int[3];
        int[] ansIndex = new int[3];
        L1:for(int k = 0; k < nums.length - 2; k++){
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;
            while(i < j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < target){
                    while(i < j && nums[i] == nums[++i]);
                } else if (sum > target) {
                    while(i < j && nums[j] == nums[--j]);
                } else {
                    ans[0]=nums[k];
                    ans[1]=nums[i];
                    ans[2]=nums[j];
                    break L1;
                }
            }
        }

        for(int n =0;n<3;n++)
            for(int i = 0; i<origin.length;i++)
                if(origin[i]==ans[n])
                    ansIndex[n]=i;
        Arrays.sort(ansIndex);
        return ansIndex;
    }

    public static void main(String[] args){
        int[] ans= new int[3];
        ans= Sample05_Loop_ThreeSum.threeSum(new int[]{9, 8, 5, 1}, 14);
        for(int i : ans)
            System.out.println(i);
    }
}