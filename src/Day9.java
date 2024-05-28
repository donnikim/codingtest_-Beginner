import java.util.ArrayList;
import java.util.Collections;

public class Day9 {
    public int solution(int[][] sizes) {

        int answer = 0;

        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        for(int i=0; i<sizes.length; i++)
        {
            if(sizes[i][0] > sizes[i][1])
            {
                listA.add(sizes[i][0]);
                listB.add(sizes[i][1]);
            }
            else
            {
                listB.add(sizes[i][0]);
                listA.add(sizes[i][1]);
            }
        }

        Collections.sort(listA);
        Collections.sort(listB);

        int maxA=Collections.max(listA);
        int maxB=Collections.max(listB);
        answer = maxA* maxB;

        return answer;
    }
}
