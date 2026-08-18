public class linkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
// add first O(1)
    public void addFirst(int data){
        //create a new node 
        Node newNode = new Node(data);
                size++;

        if(head==null){
            head=tail=newNode;
        }

        //new Node next= head
        newNode.next=head;

        //head =newNode ko point krega okay byy 
        head=newNode;

    }

    // add last

    public void addLast(int data){
        Node newNode = new Node(data);
               size++;

                if(head==null){
            head=tail=newNode;
        }
       tail.next=newNode;
       tail=newNode;

    }

    // add middle at index
    public void addMiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
      Node newNode = new Node(data);
              size++;

        Node temp =head;
        int i=0;
        while(i<index-1){
          temp= temp.next;
          i++;

        }
        newNode.next= temp.next;
        temp.next= newNode;

    }

    // removefirst

    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;

    }

    // remove last
    public int removeLast(){
      
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
           int  val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
  prev=prev.next;}
    int  val=prev.next.data;
   prev.next=null;
      size--;
        
        return val;
    }
    // print linkedlist
    public void print(){
        if(head==null){
            System.out.println("Linkedlist is empty");
        }
        Node temp= head;
        while(temp !=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null");
    }


    // seach the elemnt in linkedlis iterative search
    public int search(int key){
        Node temp=head;
        int i=0;
        while(head!=null){
            if(temp.data==key){
                return i;
            }
            temp= temp.next;
            i++;
        }
        return -1;
    }

    //search using iterative approach
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recusiveSearch(int key){
        return helper(head, key);
    }

    // reverse ll
    public void reverse(){
        Node prev=null;
         Node curr=tail=head;
         Node next;
         while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         head=prev;

    }

    // delete nth from node

















    // finde midNode
    public Node Findmid(Node head){
        Node slow=head;
        Node fast =head;
        while(slow!=null && fast != null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }

    //palindrome

    public boolean checkPalindrom(){
        if(head==null || head.next==null){
            return true;
        }
        Node miNode=Findmid(head);
        Node prev=null;
        Node curr=miNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null)
        {
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }


        return  true;

    }
    public static void main(String[] args) {
        linkedList ls= new linkedList();
        ls.addFirst(1);
        ls.addFirst(3);
        ls.addLast(4);
        ls.addLast(5);
        ls.addMiddle(0, 8);
        ls.removefirst();
        ls.print();
        
    System.out.println();
    System.out.println(ls.search(4));
        System.out.println(size);
        System.out.println(ls.checkPalindrom());
    }

}