package stack.reverse;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your String: ");
        String inputString=scanner.nextLine();
        Stack<Character> stack=new Stack<>();

        for(int i=0; i<inputString.length();i++){

            stack.push(inputString.charAt(i));
        }
        System.out.println("Reverse String of you entered the string");
while(!stack.empty()) {
    System.out.print(stack.pop());
        }
    }
}
