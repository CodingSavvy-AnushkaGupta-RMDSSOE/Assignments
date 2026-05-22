import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String s = "{[()]}";
        String s2= "{}[]";
        System.out.println(validParenthesis(s2));
    }

    static boolean validParenthesis(String s){
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
        if(ch=='(' || ch=='{' || ch=='['){
            st.push(ch);
        }
        else{
            if(st.isEmpty()){
                return false;
            }

            char top= st.pop();

            if((ch==')' && top=='(') || 
            (ch=='{' && top=='}') || 
            (ch=='[' && top==']')){
                return false;
            }
        }
    }
    return st.isEmpty();
}
}
