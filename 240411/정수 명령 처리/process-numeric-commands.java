import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine(); 
        
        for(int i = 0; i < a; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            
            if(tokens[0].equals("push")) {
                int b = Integer.parseInt(tokens[1]);
                stack.push(b);
            }
            if(tokens[0].equals("size")) {
                System.out.println(stack.size());
            }
            if(tokens[0].equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
            if(tokens[0].equals("pop")) {
                if(!stack.isEmpty()) {
                    int b = stack.pop();
                    System.out.println(b);
                } else {
                    System.out.println(-1);
                }
            }
            if(tokens[0].equals("top")){
                if(!stack.isEmpty()) {
                    int b = stack.peek();
                    System.out.println(b);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}