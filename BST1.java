public class BST1 {
    public static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int data) {
        if(root==null){
            root=new Node(data);
            // root=node;
            return root;
        }
        else{
            if(root.data>data){
                root.left=insert(root.left, data);
            }else{
                root.right=insert(root.right, data);
            }
        }
        return root;
    }
    public static Node nrinsert(Node root,int data) {
        Node p=null;
            Node c=root;
            boolean found= false;
            while(!found && c!=null){
                p=c;
                if(data==c.data){
                    found=true;
                }
                else{
                    if(data<c.data){
                        c=c.left;
                    }else{
                        c=c.right;
                    }
                }
            }
            if(found==true){
                return null;
            }
            Node node=new Node(data);
            if(root==null){
                root=node;
            }else if(data<p.data){
                p.left=node;
            }else{
                p.right=node;
            }
    return root;
                     
}
public static Node nrsearch(Node root,int ele) {
    Node p=null;
    Node c=root;
    boolean found=false;
    while(!found & c!=null){
        p=c;
        if(c.data==ele){
            found=true;
        }else if (p.data>ele){
                c=c.left;
            }
            else{
                c=c.right;
            }
        if(found==true){
            return c;
        }
           
        
    } return null;
}
public static Node rsearch(Node root,int ele) {
    if (root==null){
        System.out.println("no elements are there");
    }else if(root.data==ele){
        return root;
    }else if(root.data>ele){
        return rsearch(root.left, ele);
    }else{
        return rsearch(root.right, ele);
    }return null;
    
}
        
    
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root=null;
        root=nrinsert(root, 1);
        root=nrinsert(root, 5);
        root=nrinsert(root, 2);
        root=nrinsert(root, 7);
        root=nrinsert(root, 3);
        inorder(root);
        if(rsearch(root, 1)==null){
            System.out.println("search unsucessful");
        }else{
            System.out.println("search successful");
        }
    }
}
