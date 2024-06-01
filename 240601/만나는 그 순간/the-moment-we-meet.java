import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[]A=new int[100000];
        A[0]=0; //A의 초기위치
        int[]B=new int[100000];
        B[0]=0;  //B의 초기위치
        int Acurrent=0;//현재 A위치
        int Aindex=0;
        int Bcurrent=0;//현재 B위치
        int Bindex=0;

        for(int i=0;i<n;i++){
            //A가 어떤 방향으로 몇 초 동안 이동했는지 나타내는 (d,t)
            char dir=scanner.next().charAt(0);
            int num=scanner.nextInt();
            for(int j=0;j<num;j++){
                Aindex++;
                if(dir=='R'){
                    Acurrent++;
                    A[Aindex]=Acurrent;
                }
                else{//dir='L'
                    Acurrent--;
                    A[Aindex]=Acurrent;
                }
            }
           
        }
        for(int i=0;i<m;i++){
            //A가 어떤 방향으로 몇 초 동안 이동했는지 나타내는 (d,t)
            char dir=scanner.next().charAt(0);
            int num=scanner.nextInt();
            for(int j=0;j<num;j++){
                Bindex++;
                if(dir=='R'){
                    Bcurrent++;
                    B[Bindex]=Bcurrent;
                }
                else{//dir='L'
                    Bcurrent--;
                    B[Bindex]=Bcurrent;
                }
            }
           
        }

        int success=0;
        for(int i=1;i<=Aindex;i++){
            if(A[i]==B[i]){
                System.out.println(i);
                success=1;
                break;
            }
        }
        if(success==0){
            System.out.println(-1);
        }

    }
}