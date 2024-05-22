import java.util.*;
public class Day3 {

    public int[] solution(int []arr) {
        //동적으로 리스트 할당하기 위해 ArrayList 사용
        ArrayList<Integer> list = new ArrayList<>();
        //첫번째 값은 조건 상관 없이 무조건 들어간다.
        list.add(arr[0]);

        //arr 배열을 순회 한다. 첫번째 값은 넣었으므로 1부터 시작
        for(int i=1; i<arr.length; i++)
        {
            //이전 값과 비교를 한다(스택 개념)
            if(arr[i] !=arr[i-1])
            {
                //비교 후 같지 않으면 리스트에 추가
                list.add(arr[i]);
            }
        }
        //배열은 동적할당이 안되므로 리스트의 size로 배열을 선언
        int[] answer = new int[list.size()];
        //리스트 사이즈만큼 for문 돌려서 배열에 넣어준다
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
