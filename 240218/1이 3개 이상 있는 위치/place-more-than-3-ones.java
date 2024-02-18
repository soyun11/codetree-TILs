import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int n=scanner.nextInt();

    public static boolean inRange(int x, int y){
        return(0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {

        int[][]a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               a[i][j]=scanner.nextInt(); 
            }
        }
        //i는 행,j는 열을 가리킴.

        int[] dx = new int[]{0, 1,  0, -1};
        int[] dy = new int[]{1, 0, -1,  0};
        //dx와 dy는 순서대로 어떤 위치에서 오른쪽, 아래쪽, 왼쪽, 위쪽을 말함.
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int cnt = 0;
               int x = i;
               int y = j;
               for(int dirNum = 0; dirNum < 4; dirNum++){
                    int nx = x + dx[dirNum], ny = y + dy[dirNum];
                    if(inRange(nx,ny) && a[nx][ny] == 1)
                        cnt++;
               }
               if(cnt>=3){
                    sum++;
               }
        
            }
        }
        System.out.println(sum);
    }
}