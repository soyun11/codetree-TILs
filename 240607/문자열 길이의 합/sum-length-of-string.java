import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[]arr=new String[n];

        int length_sum=0;
        int num=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
            length_sum+=arr[i].length();
            if(arr[i].charAt(0)=='a'){
                num++;
            }
        }
        System.out.print(length_sum+" "+num);
    }
}