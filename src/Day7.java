public class Day7 {
    public int[] solution(int[] array, int[][] commands) {

        // 2차원 배열 commands의 length가 어떻게 출력되는지 확인
        // i,j일 때 i기준으로 갯수 출력
        int check = commands.length;
        System.out.println(check);
        // answer의 길이는 command의 i기준으로 선언
        int[] answer = new int[check];

        for(int i=0; i<check; i++)
        {
            //command 안에 있는 j값은 3개로 고정이므로 i기준으로 하드코딩
            int startIndex = commands[i][0]-1;
            int endIndex = commands[i][1];
            int checkNum = commands[i][2]-1;
            //tempArray를 이용하여 checkNum조건에 맞는 숫자를 뽑아야 함
            int[] tempArray = new int[endIndex-startIndex];

            for(int j=0; j<tempArray.length;j++)
                tempArray[j]=array[j+startIndex];

            //tempArray한 배열을 sort하고 이후에 조건에 맞게 값을 answer배열에 넣어준다.
            java.util.Arrays.sort(tempArray);
            answer[i] = tempArray[checkNum];
        }
        return answer;
    }
}