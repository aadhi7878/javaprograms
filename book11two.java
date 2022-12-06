public class book11two {
   public static void main(String[] args) {
    threadA obj1=new threadA();
    Thread t1=new Thread(obj1);
    threadB obj2=new threadB();
    Thread t2=new Thread(obj2);
    t1.start();
    t2.start();
   } 
}
class threadA implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("threadA i"+(2*i));
        }
    }
}
class threadB implements Runnable{
    public void run(){
        for (int j=1;j<=5;j++){
            System.out.println("threadB j"+(2*j));
        }
    }
}