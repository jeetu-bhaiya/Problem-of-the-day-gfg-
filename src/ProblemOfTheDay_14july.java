public class ProblemOfTheDay_14july {
    // we have to implement two stacks with push and pop operation
    // Simple question, I have implemented with LinkedList
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    private static class stacksGFG{
        Node head1;
        Node head2;
        void push1(int data){
            Node temp=new Node(data);
            if(head1==null) head1=temp;
            else{
                temp.next=head1;
                head1=temp;
            }
        }
        void push2(int data){
            Node temp=new Node(data);
            if(head2==null) head2=temp;
            else{
                temp.next=head2;
                head2=temp;
            }
        }
        int pop1(){
            if(head1==null) return -1;
            int x=head1.data;
            head1=head1.next;
            return x;
        }
        int pop2(){
            if(head2==null) return -1;
            int x=head2.data;
            head2=head2.next;
            return x;
        }
        void printStack_1(Node head){
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stacksGFG s=new stacksGFG();
        s.push1(1);
        s.push1(2);
        s.push1(3);
        s.printStack_1(s.head1);



    }
}
