public class book11one {
    public static void main(String[] args) {
        threadA t1=new threadA();
        threadB t2=new threadB();
        threadC t3=new threadC();
       
        t1.start();
        t2.start();
        t3.start();
    }
    
}
class threadA extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("threadA i"+(2*i));
            // System.out.println("extending thread A");
        }
    }
}
class threadB extends Thread{
    public void run(){
        for (int j=1;j<=5;j++){
            System.out.println("threadB j"+(3*j));
            // System.out.println("extending thread B");
        }
    }
}
class threadC extends Thread{
    public void run(){
        for (int k=1;k<=5;k++){
            System.out.println("threadC k"+(5*k));
            // System.out.println("extending thread C");
        }
    }
}
