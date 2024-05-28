import java.util.*;

public class Day8 {
    public int countPairs(List<Integer> nums, int target) {
        //target보다 적은 숫자를 카운트 하기 위한 변수
        int count = 0;
        //list sort를 한다
        Collections.sort(nums);
        //각 list요소들을 직접 접근한다
        for(int i =0; i<nums.size()-1;i++)
        {
            for(int j=i+1; j<nums.size();j++)
                //직접 접근한 두 조건을 더한값과 target값을 비교한다
                if(nums.get(i)+nums.get(j)<target){
                    //조건에 맞으면 Count숫자를 높인다.
                    count++;
                }
        }
        return count;
    }
}
