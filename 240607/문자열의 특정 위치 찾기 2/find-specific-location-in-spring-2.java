import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        String[]arr=new String[]{"apple","banana","grape","blueberry","orange"};
        int sum=0;
        for(int i=0;i<5;i++){
            if(arr[i].charAt(2)==ch||arr[i].charAt(3)==ch){
                sum++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(sum);
    }
}