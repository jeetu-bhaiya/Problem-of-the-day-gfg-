import java.util.Stack;

public class ProblemOfTheDay_19uly23 {
    String reverseWords(String s)

    {
        int n=s.length();
        if(n==0) return s;
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=n-1;i>=0;i--){
            if(st.size()==0 || s.charAt(i)!='.') st.push(s.charAt(i));
            if(s.charAt(i)=='.'){
                while(st.size()>0){
                    char ch=st.pop();
                    res+=ch;
                }
                res=res+'.';

            }

        }
        while(st.size()!=0){
            char c=st.pop();
            res+=c;
        }

        return res;
    }
}
