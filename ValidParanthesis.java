class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if (stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    result = false;
                    break;
                }
            }
            if (s.charAt(i) == '}') {
                if (stack.size() > 0 && stack.peek() == '{') {
                    stack.pop();
                }
                else {
                    result = false;
                    break;
                }
            }
            if (s.charAt(i) == ']') {
                if (stack.size() > 0 && stack.peek() == '[') {
                    stack.pop();
                }
                else {
                    result = false;
                    break;
                }
            }
        }
        if (stack.size() != 0) {
            result = false;
        }
        return result;
    }
}