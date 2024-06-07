import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]arr=new String[10];
        
        int length_sum=0;
        for(int i=0;i<10;i++){
            arr[i]=sc.next();
            length_sum+=arr[i].length();
        }
        System.out.println(length_sum);
    }
}