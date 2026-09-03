public class BinarayTree {
    static class Node{
      int data;
      Node left;
      Node right;
         Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
                     }
    }
    static class BinTree{
        static int index=-1;

        public static  Node BuildTree(int node[]){
            index++;
      if(node[index]==-1){
       return null;
      }

      Node newNode= new Node(node[index]);
      newNode.left= BuildTree(node);
      newNode.right=BuildTree(node);
       return newNode;

        }

        
     public static void PreOderTravrse(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        PreOderTravrse(root.left);
        PreOderTravrse(root.right);
     }


     public static void InOderTravrse(Node root){
        if(root==null){
            return;
        }
       
        InOderTravrse(root.left);
         System.out.println(root.data);
          InOderTravrse(root.right);    
 }

     

     public static void PostOderTravrse(Node root){
        if(root==null){
            return;
        }
         
        PostOderTravrse(root.left);
        PostOderTravrse(root.right);

        System.out.println(root.data);

     }

    }

  public static void main(String[] args) {
      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

      BinTree tree=new BinTree();
      Node root= tree.BuildTree(nodes);
     System.out.println("preoder traver");
     tree.PreOderTravrse(root);

          System.out.println("inOrder traver");

          tree.InOderTravrse(root);

               System.out.println("Postoder traver");
 tree.PostOderTravrse(root);

    //   System.out.println(root.data);

  }

}
