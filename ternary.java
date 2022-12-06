public class ternary {
    public static void main(String[] args) {
        int a=-8,b=23,c=-180;
        int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
    }
    
}
