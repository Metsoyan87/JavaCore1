package homework;

public class BraceChecker {

    private String text;
    BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        CharStack stack = new CharStack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char pop;
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                pop = stack.pop();
                if (pop != '(') {
                    System.out.println("Error: opened " + pop + " but closed " + c + " at " + i);
                }
            } else if (c == '}') {
                pop = stack.pop();
                if (pop != '{') {
                    System.out.println("Error: opened " + pop + " but closed " + c + " at " + i);
                }
            } else if (c == ']') {
                pop = stack.pop();
                if (pop != '[') {
                    System.out.println("Error: opened " + pop + " but closed " + c + " at " + i);
                }
            }
        }
        for (int i = 0; i < stack.getArray().length; i++) {
            char pop = stack.pop();
            if (pop != '\u0000')

                System.out.println("Error: opened " + pop + " but dont closed at " + i);
        }
    }
}