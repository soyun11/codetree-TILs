import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList <Integer> v=new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void push_back(){
        int data=sc.nextInt();
        v.add(data);
    }
    public static void pop_back(){
        v.remove(v.size()-1);
    }
    public static void size(){
        System.out.println(v.size());
    }
    public static void get(){
        int data=sc.nextInt();
        System.out.println(v.indexOf(data));
    }
    public static void main(String[] args){
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String a = sc.next();
            if(a.equals("push_back")){
                push_back();
            }
            if(a.equals("pop_back")){
                pop_back();
            }
            if(a.equals("size")){
                size();
            }
            if(a.equals("get")){
                get();
            }
        }
    }
}