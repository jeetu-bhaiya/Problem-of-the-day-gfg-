import java.util.Stack;
class Solution
{
    void delete(Stack<Integer>s,int sizeStack){
        if(s.size()==0) return;
        else if(s.size()==1){
            s.removeElementAt(1);
        }
        else{
            int n=s.size();
            if(n%2!=0){
                s.removeElementAt(n/2);
            }
            else{
                int even=n/2-1;
                s.removeElementAt(even);
            }
        }
    }
    public void deleteMid(Stack<Integer>s,int sizeOfStack){

        delete(s,sizeOfStack);
    }
}