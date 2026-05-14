public class validParentheses {
    public static void main(String[] args) {
        String s = "()";
        String s0 = "([])";
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([)]";
        String s4 = "((";
        String s5 = "[";

        System.out.println(isValid(s));
        System.out.println(isValid(s0));
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
        System.out.println(isValid(s5));
    }

    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        int size = charArray.length;
        char[] stack = new char[size];
        int top = -1;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray.length == 1) {
                return false;
            }

            if (charArray[i] == '{' || charArray[i] == '(' || charArray[i] == '[') {
                ++top;
                stack[top] = charArray[i];
                continue;
            }

            if (top == -1) {
                return false;
            }

            if (charArray[i] == '}') {
                if (stack[top] == '{') {
                    top--;
                    continue;
                } else {
                    return false;
                }
            } else if (charArray[i] == ')') {
                if (stack[top] == '(') {
                    top--;
                    continue;
                } else {
                    return false;
                }
            } else if (charArray[i] == ']') {
                if (stack[top] == '[') {
                    top--;
                    continue;
                } else {
                    return false;
                }
            }
            return false;
        }
        return (top == -1);
    }
}
