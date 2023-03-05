import java.util.*;
public class minmax {
    public static double[] minmax(double[] input,int n) {
        double []res =new double[n];
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        for(double val:input){
            if(val<min){
                min=val;
            }
            if(val>max){
                max=val;
            }
        }
        for(int i=0;i<n;i++){
            res[i]=(input[i]-min)/(max-min);
        }return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no of data items :");
        int n=sc.nextInt();
        double []vector=new double[n];
        System.out.println("enter all the set :");
        for( int i=0;i<n;i++){
            vector[i]=Double.parseDouble(sc.next());
        }
        Arrays.toString(vector);
        // Arrays.toString(minmax(vector, n));

        System.out.println(Arrays.toString(minmax(vector, n)));
    }
}
