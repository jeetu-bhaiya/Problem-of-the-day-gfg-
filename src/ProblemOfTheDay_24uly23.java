public class ProblemOfTheDay_24uly23 {
    public void nthL1(Node root,int n,List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.data);
            return;
        }
        nthL1(root.left,n-1,arr);
        nthL1(root.right,n-1,arr);
    }

    public int height(Node root){
        if(root==null) return 0;
        int l=1+height(root.left);
        int r=1+height(root.right);
        return Math.max(l,r);
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        int level=height(root);
        for(int i=1;i<=level;i++){
            List<Integer> arr=new ArrayList<>();
            nthL1(root,i,arr);


            ans.add(arr);
        }
        return ans;
    }
    ArrayList<Integer> rightView(Node root) {
        List<List<Integer>> lo=levelOrder(root);
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<lo.size();i++){
            List<Integer> arr=lo.get(i);
            int le=arr.get(arr.size()-1);
            ans.add(le);
        }


        return ans;

    }
}
