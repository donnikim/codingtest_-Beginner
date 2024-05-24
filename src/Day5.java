import java.util.*;

public class Day5 {
    public int[] numberGame(int[] nums) {

        // 배열 정렬
        Arrays.sort(nums);

        // 정렬 후 [0]-[1], [2]-[3], [3]-[4].... 짝을 이루어 서로의 값을 교환
        for(int i=0;i<(nums.length)/2;i++)
        {
            int temp = nums[2*i];
            nums[2*i] =nums[2*i+1];
            nums[2*i+1]=temp;
        }

        return nums;
    }
}
