import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.length()>s2.length()){
            System.out.print(s1+" ");
            System.out.println(s1.length());
        }
        else if(s1.length()<s2.length()){
            System.out.print(s2+" ");
            System.out.println(s2.length());
        }
        else{
            System.out.println("same");
        }
    }
}