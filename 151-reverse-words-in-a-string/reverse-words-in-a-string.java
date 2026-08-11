class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        
        int i =s.length()-1;

        while(i>=0 ){
            char ch = s.charAt(i);

            if(ch != ' '){
                sb.append(ch);
            }

            if (ch ==' ' && sb.length() > 0 || sb.length() > 0 && i ==0){
                
                sb.reverse();
                
                ans.append(sb);
                ans.append(" ");
                
                sb.setLength(0);


            }

            i--;
        }
        if(ans.length() > 0 && ans.charAt(ans.length()-1) == ' '){
            ans.deleteCharAt(ans.length()-1);
        }


        return ans.toString();
    }
}