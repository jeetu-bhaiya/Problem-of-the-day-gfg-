import java.util.Queue;
import java.util.Stack;

public class ProblemOfTheDay_16uly23 {
    public Queue<Integer> rev(Queue<Integer> q){
        if(q.size()==0) return q;
        Stack<Integer> st=new Stack<>();
        while(q.size()!=0){
            int x=q.remove();
            st.push(x);
        }
        while(st.size()!=0){
            int x=st.pop();
            q.add(x);
        }
        return q;

    }

}
