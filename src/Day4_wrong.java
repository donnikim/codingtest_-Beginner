public class Day4_wrong {
    public boolean isValid(String s)
    {
        //[(){}]-> 이런 경우에도 true로 반환하므로
        //서로 쌍이 맞는 대중소 괄호들은 먼저 제거를 해준다.
        while (s.contains("()") || s.contains("[]") || s.contains("{}"))
        {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }

        //스트링 길이가 짝수인 경우는 유효성 검사를 해준다
        if(s.length()%2==0)
        {
            for(int i=0; i<(s.length())/2;i++){
                //짝수일 경우 유효성 검사를 시작한다.
                //0,2,4,6... 번째는 무조건 열린 괄호가 있어야 한다.
                boolean checChar = checkFirstString(s.charAt(2*i));

                if(!checChar)
                    return false;

                //첫번째 유효성 로직을 거쳤으면 무조건 열린 괄호 이다.
                //tempChar변수는 첫번째 열린 괄호의 짝인 닫힌 괄호를 담는 변수다
                char tempChar = checkSecondString(s.charAt(2*i));
                //1,3,5,7.....은 닫힌괄호 자리이다
                //열린괄호와 닫힌괄호의 짝이 맞지 않으면 false를 리턴해준다.
                if(tempChar != s.charAt(2*i+1))
                    return false;
            }
        }
        else //홀수인 경우는 무조건 false를 리턴해준다
        {
            return false;
        }

        return true;

    }
    //열린 괄호가 있는지 체크를 한다.
    //닫힌 괄호가 나오면 무조건 false로 리턴 해준다.
    public boolean checkFirstString(char ch )
    {
        switch(ch)
        {
            case ')':
                return false;
            case '}':
                return false;
            case ']' :
                return false;
            default:
                return true;
        }
    }
    //열린괄호의 짝을 찾아주는 메소드 이다.
    public char checkSecondString(char ch)
    {
        switch(ch)
        {
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                return '0';
        }
    }
}
