import java.util.HashSet;
import java.util.Set;

public class Day1 {

    public int solution(int[] nums) {
        int answer = 0;
        int numsLen = (nums.length)/2;

        Set<Integer> setNums = new HashSet<>();
        for(int num : nums)
        {
            setNums.add(num);
        }

        int setNumsLen = setNums.size();

        if(setNumsLen >= numsLen)
            answer = numsLen;
        else
            answer = setNumsLen;

        return answer;
    }





}
