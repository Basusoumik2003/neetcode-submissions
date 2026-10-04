class Solution {
    public boolean checkValidString(String s) {
        int high = 0;
        int low = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                high++;
                low++;
            }
            else if(c == ')'){
                high--;
                low--;
            }
            else if(c == '*'){
                low--;
                high++;
            }

            if(high < 0){
                return false;
            }
            if(low < 0){
                low = 0;
            }
        }
        return low == 0;
    }
}