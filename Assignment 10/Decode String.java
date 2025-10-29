class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        String ans = "";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                temp += ch;
            } else if (ch == '[') {
                st.push(temp);
                st.push(ans);
                temp = "";
                ans = "";
            } else if (ch == ']') {
                String inner = ans;
                ans = st.pop();
                int k = Integer.parseInt(st.pop());
                String temp1 = "";
                while (k-- > 0) {
                    temp1 += inner;
                }
                ans += temp1;
            } else {
                ans += ch;
            }
        }

        return ans;
    }
}
