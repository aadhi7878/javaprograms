public class BST {
    public static class Node{
        int data;
        Node ls;
        Node rs;
        public Node(int data){
            this.data=data;
            this.ls=null;
            this.rs=null;
        }
        }
        public static Node rinsert(Node root,int ele){
            if(root==null){
                root=new Node(ele);
                return root;
             }
             else if(ele<root.data){
                root.ls=rinsert(root.ls, ele);
             }
             else if(ele>root.data){
                root.rs=rinsert(root.rs, ele);
             }
             else{
                System.out.println("you are entered alredy existed number");
             }
            return root;
        }
        public static Node nrinsert(Node root,int ele){
            Node p=null;
            Node c=root;
            boolean found= false;
            while(!found && c!=null){
                p=c;
                if(ele==c.data){
                    found=true;
                }
                else{
                    if(ele<c.data){
                        c=c.ls;
                    }else{
                        c=c.rs;
                    }
                }
            }
            if(found==true){
                return null;
            }
            Node node=new Node(ele);
            if(root==null){
                root=node;
            }else if(ele<p.data){
                p.ls=node;
            }else{
                p.rs=node;
            }
    return root;
            
        }
        public static void preorder(Node root){
            if(root==null)return;
            System.out.print(root.data+" ");
            preorder(root.ls);
            preorder(root.rs);
        }
        public static void inorder(Node root){
            if(root==null)return;
            inorder(root.ls);
            System.out.print(root.data+" ");
            inorder(root.rs);
        }
        public static void postorder(Node root){
            if(root==null)return;
            postorder(root.ls);
            postorder(root.rs);
            System.out.print(root.data+" ");
        }
        public static Node nrsearch(Node root,int ele){
            boolean found=false;
            Node c=root;
            while(c!=null && !found ){
                if(ele==c.data){
                    found= true;
                }
                else if(ele<c.data){
                    c=c.ls;
                }else{
                    c=c.rs;
                }
           } 
           if(found==true){
            return c;
           }
        return null;
       }
       public static Node rsearch(Node root,int ele){
        if(root==null){
            return null;
        }else{
            if(ele==root.data){
                return root;
            }else if(ele<root.data){
                rsearch(root.ls, ele);
            }else if(ele>root.data){
                rsearch(root.rs, ele);
            }
        }
        return null;
       }
       public static Node delete(Node root,int val){
        if(val<root.data){
            root.ls=delete(root.ls, val);
        }else if(val>root.data){
            root.rs=delete(root.rs, val);
        }else{
            if(val==root.data){
                return null;
            }
            if(root.ls==null){
                return root.rs;
            }else if(root.rs==null){
                return root.ls;
            }
            Node is=inordersuccessor(root.ls);
            root.data=is.data;
            // System.out.println(is.data);
            root.ls=delete(root.ls,is.data);
            
        }return root;
       }
       public static Node inordersuccessor(Node root) {
            while(root.rs!=null){
                root=root.rs;
            }
            return root;
       }
       public static Node min(Node root){
        
        Node c=root;
        while(c.rs!=null){
            c=c.rs;
        }
        return c;
       }
       
        public static void main(String[] args) {
            int arr[]={4,2,3,6,5,1};
            Node root =null;
            int len=arr.length;
            for(int i=0;i<len;i++){
                root=nrinsert(root, arr[i]);
            }

            // nrinsert(root, 2);
            // nrinsert(root, 23);
            // nrinsert(root, 8);
            // nrinsert(root, 38);
           preorder(root);
           System.out.println();
           postorder(root);
           System.out.println();
           inorder(root);
           System.out.println();
           if(nrsearch(root,3)==null){
            System.out.println("search is unsuccessfull");
            
           }else{
            System.out.println("search successfull");
           }
           System.out.println();
           delete(root,2 );
           inorder(root);
        //    System.out.println((inordersuccessor(root)).data);
        //    inorder(root);
        // System.out.println(min(root).data);
        }
    
}
