import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        
        int p=0;
        if(s1.length()>s2.length()){
            if(s2.length()>s3.length()){ //s1>s2>s3
                p=s1.length()-s3.length();
            }
            else if(s3.length()>s1.length()){//s3>s1>s2
                p=s3.length()-s2.length();
            }
            else if(s3.length()>s2.length()){
                if(s1.length()>s3.length()){//s1>s3>s2
                    p=s1.length()-s2.length(); 
                }
                else if(s3.length()>s1.length()){//s3>s1>s2
                    p=s3.length()-s2.length();
                }
                
            }
        }
        else if(s2.length()>s1.length()){//s2>s1
            if(s3.length()>s2.length()){//s3>s2>s1
                p=s3.length()-s1.length();
            }
            else if(s1.length()>s3.length()){//s2>s1>s3
                p=s2.length()-s3.length();
            }
            else if(s3.length()>s1.length()){
                if(s2.length()>s3.length()){//s2>s3>s1
                    p=s2.length()-s1.length();
                }
            }
        }
        System.out.println(p);
    }
}