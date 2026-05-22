    import java.util.Stack;

    public class ReverseStack {
        public static void main(String[] args) {
            Stack<Integer> st1 = new Stack<>();
            Stack<Integer> st2 = new Stack<>();

            st1.push(10);
            st1.push(20);
            st1.push(30);
            System.out.println("Original");
            System.out.println(st1);

            Stack<Integer> rev = reverseStack(st1);
            System.out.println("reversed");
            System.out.println(rev);
            

        }

        static Stack<Integer> reverseStack(Stack<Integer> st){
            Stack<Integer> st2 = new Stack<>();
            while(!st.isEmpty()){
            st2.push(st.pop());
        }
        return st2;
    }
    }
