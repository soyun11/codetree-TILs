import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]arr=new String[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.next();
        }
        char ch=sc.next().charAt(0);
        for(int i=0;i<10;i++){
            if(arr[i].charAt(arr[i].length()-1)==ch){
                System.out.println(arr[i]);
            }
        }
    }
}