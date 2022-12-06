
import java.util.*;

class book28
{
    private int V;                              
    private LinkedList<Integer> adjacent[];        
    private Queue<Integer> queue;                   
 
    book28(int v)
    {
        V = v;
        adjacent = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adjacent[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }
    void addEdge(int v,int w)
    {
        adjacent[v].add(w);                     
    }
    void breadthFS(int n)
    {
        boolean nodes[] = new boolean[V];      
        int a = 0;
        nodes[n]=true;                  
        queue.add(n);                   
        while (queue.size() != 0)
        {
        n = queue.poll();             
            System.out.print(n+" ");        
        for (int i = 0; i < adjacent[n].size(); i++)  
            {   a = adjacent[n].get(i);
                if (!nodes[a])                    
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }  
        }
    }
    public void makeDFS(int ver,boolean nodes[]){
        nodes[ver]=true;
        System.out.print(ver+" ");
        int x=0;
        for (int i=0;i<adjacent[ver].size();i++){
            x=adjacent[ver].get(i);
            if(!nodes[x]){
                makeDFS(x, nodes);
            }
        }
    }
    public void depthFS(int v){
        boolean k[]=new boolean[v];
        makeDFS(v, k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        book28 b=new book28(6); 
        b.addEdge(0, 1);
        b.addEdge(0, 3);
        b.addEdge(0, 4);
        b.addEdge(4, 5);
        b.addEdge(3, 5);
        b.addEdge(1, 2);
        b.addEdge(1, 0);
        b.addEdge(2, 1);
        b.addEdge(4, 1);
        b.addEdge(3, 1);
        b.addEdge(5, 4);
        b.addEdge(5, 3);
        System.out.println("breadth first traversal of a binary tree : ");
        b.breadthFS(0);
        b.depthFS(0);
    }
}
