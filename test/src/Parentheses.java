import java.util.Stack;

public class Parentheses {
    public static void main(String[] args){
        System.out.println(check("([)]"));
    }
    static boolean check(String str){
        if(str==null||str.length()==0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('||chars[i]=='['){
                stack.push(chars[i]);
            }else if(chars[i]==')'){
                if(stack.size()==0){
                    return false;
                }
                char open = stack.pop();
                if(open!='('){
                    return false;
                }
            }else if(chars[i]==']'){
                if(stack.size()==0){
                    return false;
                }
                char open = stack.pop();
                if(open!='['){
                    return false;
                }
            }else return false;
        }
        return true;
    }
}
