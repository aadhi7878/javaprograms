class vehicle{
    void fun(){
        System.out.println("this is a vehicle");
    }
}
class car extends vehicle{
    void fun(){
        System.out.println("this vehicle name is car");
    }
}
class bike extends vehicle{
    void fun(){
        System.out.println("this vehicle is bike");
    }
}
class bus extends vehicle{
    void fun(){
        System.out.println("this vehicle is bus");
    }
}
public class book12 {
    public static void main(String[] args) {
        vehicle v;
        v=new car();
        v.fun();
        v=new bike();
        v.fun();
        v=new bus();
        v.fun();
    }
    
    
}
