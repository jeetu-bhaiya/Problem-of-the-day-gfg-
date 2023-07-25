import java.util.*;
class Spiral{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static int height(Node root){
        if(root==null) return 0;
        int a=1+height(root.left);
        int b=1+height(root.right);
        return Math.max(a,b);
    }
    public static void nthL1(Node root,int n,ArrayList<Integer> al){
        if(root==null) return;
        if(n==1){
            al.add(root.data);
            return;
        }
        nthL1(root.left,n-1,al);
        nthL2(root.right,n-1,al);

    }
    public static void nthL2(Node root,int n,ArrayList<Integer> al){
        if(root==null) return;
        if(n==1){
            al.add(root.data);
            return;
        }
        nthL2(root.right,n-1,al);
        nthL2(root.left,n-1,al);



    }

    ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> al=new ArrayList<>();
        if(root==null) return al;
        int level=height(root);
        for(int i=1;i<=level;i++){
            if(i%2!=0) nthL2(root,i,al);
            else nthL1(root,i,al);
        }
        return al;
    }
}