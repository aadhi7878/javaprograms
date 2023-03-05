import java.util.*;


public class dwdmcorrelation {
    public static double mean(double[]attribute,int n) {
        double sum = 0.0;
        for(int i=0;i<n;i++){
            sum+=attribute[i];
        }sum=sum/n;
        // System.out.println("mean is"+sum);
        return sum;
    }
    public static double sigma(double[]attribute,double mean) {
        double x=0.0;
        for(int i=0;i<attribute.length;i++){
            x+=Math.pow(attribute[i]-mean,2);
        }
        double val=Math.sqrt(x/attribute.length-1);
        // System.out.println("standard deviaton is"+val);
        return val;
    }
    public static double covariance(double[]attribute1,double mean1,double []attribute2,double mean2) {
        double y=0.0;
        for(int i=0;i<attribute1.length;i++){
            y+=(attribute1[i]-mean1)*(attribute2[i]-mean2);
        }return y/attribute1.length-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of data items in a attribute :");
        int n=sc.nextInt();
        double[]at1=new double[n];
        System.out.println("enter data items for attribute 1 :");
        for(int i=0;i<n;i++){
            at1[i]=Double.parseDouble(sc.next());
        }System.out.println("enter data items for attribute 2 :");
        double[]at2=new double[n];
        for(int i=0;i<n;i++){
            at2[i]=Double.parseDouble(sc.next());
        }
        double mean1=mean(at1,n);
        // System.out.println(mean1);
        double mean2=mean(at2,n);
        // System.out.println(mean2);
        double st1=sigma(at1, mean1);
        // System.out.println(st1);
        double st2=sigma(at2, mean2);
        // System.out.println(st2);
        double value=covariance(at1, mean1, at2, mean2);
        double correlation_value=value/st1*st2;
        if(correlation_value==0){
            System.out.println("attributes are not correlated to each other.");
        }else if(correlation_value<0){
            System.out.println("attributes are negatively correlated.");
        }else{
            System.out.println("attributes are postively correlated.");
        }

        // System.out.println(correlation_value);
        
        
    }
}
