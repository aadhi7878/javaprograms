import java.util.*;


public class dwdmsmoothing {
    public static double[] binmean(double[] data,int nofbin){
        double [] res=new double[data.length];
        int l=data.length;
        int binsize= l/nofbin;
        for(int i=0;i<nofbin;i++){
            int st=i*binsize;
            int end=(i+1)*binsize;
            if(i==nofbin-1){
                end=l;
            }double sum=0.0;
            for(int j=st;j<end;j++){
                sum=sum+data[j];
                System.out.println(sum);
            } double avg=sum/(end-st);
            for(int j=st;j<end;j++){
                res[j]=avg;
            }
        }
        return res; 
    }
    public static double[] binboundaries(double[]data,int nofbin) {
        double[] smothed=new double[data.length];
        smothed=Arrays.copyOf(data, data.length);
        Arrays.sort(smothed);
        int binsize=smothed.length/nofbin;
        for(int i=0;i<nofbin;i++){
            double minbin=smothed[i*binsize];
            int st=i*binsize;
            int end=(i+1)*binsize;
            for(int k=st;k<end;k++){
                if(smothed[k]-minbin<maxbin-smothed[k]){
                    smothed[k]=minbin;
                }else{
                    smothed[k]=maxbin;
                }
            }
        }
        return smothed;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;int nofbin;
        System.out.println("enter how many data items do you want to enter :");
        n=sc.nextInt();
        nofbin=sc.nextInt();
        System.out.println("enter the smoothing elements one by one :");
        
        double [] data=new double[n];
        for(int i=0;i<n;i++){
            data[i]=Double.parseDouble(sc.next());
        }

        // binmean(data, nofbin);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(binmean(data, nofbin)));
        System.out.println(Arrays.toString(binboundaries(data, nofbin)));
      
    }
    
}
