import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == "+"){
                s1.push(s1.pop()+s1.pop());
            }
            if (tokens[i] == "*"){
                s1.push(s1.pop()*s1.pop());
            }
            if (tokens[i] == "-"){
                int i1= s1.pop();
                int j = s1.pop();
                s1.push(j-i1);
            }
            if (tokens[i] == "/"){
                int i1= s1.pop();
                int j = s1.pop();
                s1.push(j/i1);
            }
            if (tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "/") {
                s1.push(Integer.parseInt(tokens[i]));
            }
        }
        System.out.println(s1.peek());
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        String s= "111";
        s.length();

    }
}
