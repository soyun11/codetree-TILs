import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        String replacestr1=str1.replace(" ","");
        String replacestr2=str2.replace(" ","");

        System.out.print(replacestr1+replacestr2);

        //공백제외
        /*char[] s1=new char[100];
        char[] s2=new char[100];
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==null){
                continue;
            }
            s1[i]=str1.charAt(i);
        }
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)==null){
                continue;
            }
            s2[i]=str2.charAt(i);
        }

        for(int i=0;i<str1.length();i++){
            System.out.print(s1[i]);
        }
        for(int i=0;i<str2.length();i++){
            System.out.print(s2[i]);
        }
        */


    }
}