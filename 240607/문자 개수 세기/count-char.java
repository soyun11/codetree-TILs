import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char find=sc.next().charAt(0);

        int len=str.length();
        char[] s=new char[100];

        int num=0;
        for(int i=0;i<len;i++){
            s[i]=str.charAt(i);
        }
        for(int i=0;i<len;i++){
            if(s[i]==find){
                num++;
            }
        }
        System.out.println(num);
    }
}