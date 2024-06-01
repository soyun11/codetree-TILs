import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // 충분히 큰 배열로 설정
        int[] A = new int[1000000];
        int[] B = new int[1000000];
        
        A[0] = 0; // A의 초기 위치
        B[0] = 0; // B의 초기 위치
        
        int Acurrent = 0; // 현재 A 위치
        int Bcurrent = 0; // 현재 B 위치
        int Aindex = 0; // A의 인덱스
        int Bindex = 0; // B의 인덱스

        // A의 이동 처리
        for (int i = 0; i < n; i++) {
            char direction = scanner.next().charAt(0);
            int time = scanner.nextInt();
            for (int j = 0; j < time; j++) {
                Aindex++;
                if (direction == 'R') {
                    Acurrent++;
                } else {
                    Acurrent--;
                }
                A[Aindex] = Acurrent;
            }
        }
        
        // B의 이동 처리
        for (int i = 0; i < m; i++) {
            char direction = scanner.next().charAt(0);
            int time = scanner.nextInt();
            for (int j = 0; j < time; j++) {
                Bindex++;
                if (direction == 'R') {
                    Bcurrent++;
                } else {
                    Bcurrent--;
                }
                B[Bindex] = Bcurrent;
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