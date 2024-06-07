import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();//알파벳 소문자로 이루어진 문자열 입력받기
        String save="";
        for(int i=1;i<str.length();i=i+2){
            save+=str.charAt(i);
        }
        for(int i=save.length()-1;i>=0;i--){
            System.out.print(save.charAt(i));
        }
    }
}