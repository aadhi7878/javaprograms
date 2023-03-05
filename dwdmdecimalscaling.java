
import java.util.*;
public class dwdmdecimalscaling {
    public static double[] scaling(double[] input,int n) {
        double []res=new double[input.length];
        double max=Double.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>max){
                max=input[i];
            }
        }
        System.out.println(max);
        int d=(int)Math.ceil(Math.log10(max));
        System.out.println(d);
        for(int i=0;i<input.length;i++){
            res[i]=input[i]/Math.pow(10,d);
        }return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter how many data items do you want to enter :");
        n=sc.nextInt();
        System.out.println("enter the smoothing elements one by one :");
        
        double [] data=new double[n];
        for(int i=0;i<n;i++){
            data[i]=Double.parseDouble(sc.next());
        }
        System.out.println(Arrays.toString(scaling(data, n)));
    }
}
