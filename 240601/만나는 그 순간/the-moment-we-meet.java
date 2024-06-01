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
                }
                else{//dir='L'
                    Acurrent--;
                }
                A[Aindex]=Acurrent;
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
                }
                else{//dir='L'
                    Bcurrent--;
                }
                B[Bindex]=Bcurrent;
            }
           
        }
// A와 B의 최초 만나는 시간 찾기
        int success = -1;
        int minLength = Math.min(Aindex, Bindex); // 두 배열의 최소 길이
        for (int i = 1; i <= minLength; i++) {
            if (A[i] == B[i]) {
                success = i;
                break;
            }
        }
        
        // 결과 출력
        System.out.println(success);

        // Scanner 닫기
        scanner.close();

    }
}