import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesesChecker {
    /*
    Given a string expression, write a program to examine whether the pairs and the orders of
    “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.

    For example
    Input: exp = “[()]{}{[()()]()}”
    Output: True

    Input: exp = “[(])”
    Output: False
     */
    public boolean checkParenthesesOrder(String input){
        Deque<Character> queue = new ArrayDeque<>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                queue.add(chars[i]);
            }
            else if(chars[i] == ')'){
                if(queue.size() == 0 || queue.getLast() != '('){
                    return false;
                }
                queue.removeLast();
            }
            else if(chars[i] == '}'){
                if(queue.size() == 0 || queue.getLast() != '{'){
                    return false;
                }
                queue.removeLast();
            }
            else if(chars[i] == ']'){
                if(queue.size() == 0 || queue.getLast() != '['){
                    return false;
                }
                queue.removeLast();
            }
        }
        if(queue.size() == 0){
            return true;
        }
        return false;
    }
}
