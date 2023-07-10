import java.util.Stack;

public class    checkPair {
    public static void main(String args[]){
        System.out.println(check("((()[]))()[]"));

    }
    static boolean check(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char popCh = stack.pop();
                if (!(popCh == '(' && ch == ')' || popCh == '[' && ch == ']')) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
