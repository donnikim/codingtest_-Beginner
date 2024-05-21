import java.util.*;

public class Day2 {

    class Solution {
        public String solution(String[] participants, String[] completions) {
            String answer = "";

            HashMap<String, Integer> hmMap = new HashMap<>();

            // 참가자를 해시맵안에 넣는다. 해시맵의 키는 중복이 되지 않으므로 비교 후 중복 시 값을 +1증가 시킨다.
            for(String participant : participants )
            {
                if(hmMap.containsKey(participant))
                    hmMap.put(participant,hmMap.get(participant)+1);
                else
                    hmMap.put(participant,1);
            }

            //완주자는 무조건 참가자안에 있으므로 참가자 안에 없는 완주자는 없다.
            for(String completion:completions)
            {
                if(hmMap.containsKey(completion))
                    hmMap.put(completion,hmMap.get(completion)-1);
            }

            //여기서 값이 0이 아닌 키는 완주하지 못한 참가자이다.
            for(Map.Entry<String,Integer> entry : hmMap.entrySet())
            {
                String key = entry.getKey();
                int value =entry.getValue();

                if(value==1)
                    answer = key;
            }
            return answer;
        }
    }
}