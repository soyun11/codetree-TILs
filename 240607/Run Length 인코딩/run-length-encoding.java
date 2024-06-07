import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();//문자열 A받기

        char cur_char=A.charAt(0);//문자열 A의 첫번째 문자가 cur_char
        String output="";//결과
        int numchar=1;//numchar는 반복되는 문자 개수
        
        for(int i=1;i<A.length();i++){//문자열 길이만큼 반복
            if(cur_char==A.charAt(i)){//현재 문자와 A의 문자 비교
                numchar++;
            }
            else{//현재 문자와 A의 문자 다르면
                output+=cur_char;
                output+=Integer.toString(numchar);
                cur_char=A.charAt(i);
                numchar=1;

            }
        }
        output+=cur_char;
        output+=Integer.toString(numchar);

        System.out.println(output.length());
        System.out.println(output);


    }
}