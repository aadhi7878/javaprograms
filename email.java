import java.util.*;
public class email {
    public static void main(String[] args) {
        int t;
        String result="";
        Scanner sc=new Scanner(System.in);
        String ful=sc.next();
        for(int i=0;i<ful.length();i++){
            if(ful.charAt(i)=='@'){
                break;
           }
           else{
            result +=ful.charAt(i);
         }
                
    

        }
        System.out.println(result);
        
    }


    
    
}
