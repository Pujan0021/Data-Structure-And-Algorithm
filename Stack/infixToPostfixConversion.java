
import java.util.Stack;

/**
 * Determines the precedednce of an operator
 *
 * @param op The operator character
 * @return An integer representing the precendence
 */
public class infixToPostfixConversion {

    private static int getPrecendence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1; //Lowest precendence: Addition and Subtraction
            case '*':
            case '/':
                return 2; //Average precendence: Multiplication and Division
            case '^':
            case '$':
                return 3; //Highest precendence: Exponentiation and Dollar sign
            default:
                return 0;
        }
    }

    public static String convertToPostFix(String infixExpression) {

        StringBuilder postFixResult = new StringBuider();// StringBuilder is mutable so we use it so that it can be changed
        Stack<Character> operatorStack = new Stack<>();
        for (int i = 0; i < infixExpression.length(); i++) {
            char token = infixExpression.charAt(i);
            //char token = infixExpression[i]; is not a valid java 

            // Ignore any blank spaces 
            if (Character.isWhitespace(token)) {
                continue;
            }
            if (Character.isLetterOrDigit(token)) {
                postFixResult.append(token);
            }
        }
    }
}
