import java.util.*;
public class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    void showHello(){
        String choice;
        System.out.println("Type h for hello any thing else to stop");
        choice = sc.next();
        while("h".equals(choice)){
            System.out.println("hello");
            choice = sc.next();
        }
    }

    public static void main(String[] args){
        HelloTillStop obj = new HelloTillStop();
        obj.showHello();

    }

}
