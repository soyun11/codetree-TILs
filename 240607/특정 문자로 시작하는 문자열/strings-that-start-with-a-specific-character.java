import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        char ch=sc.next().charAt(0);
        int sum=0;
        int len=0;
        for(int i=0;i<n;i++){
            if(arr[i].charAt(0)==ch){
                sum++;
                len+=arr[i].length();
            }
        }
        float average=(float)len/sum;
        System.out.print(sum+" ");
        System.out.printf("%.2f\n",average);
    }
}