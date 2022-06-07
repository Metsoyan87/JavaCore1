package Tests.braceCheckerSwitch;

public class BraceChecker {

    private final String text;
    private final CharStack stack = new CharStack();

    BraceChecker(String text) {
        this.text = text;
    }

    void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char pop;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error: not opened " + " but closed " + c);

                    } else if (pop != '(') {
                        System.out.println("Error: opened " + pop + " but closed " + c + " at " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error: not opened " + " but closed " + c);

                    } else if (pop != '{') {
                        System.out.println("Error: opened " + pop + " but closed " + c + " at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.out.println("Error: not opened " + " but closed " + c);

                    } else if (pop != '[') {
                        System.out.println("Error: opened " + pop + " but closed " + c + " at " + i);
                    }
                    break;

            }
        }
        char pop;
        while ((pop = stack.pop()) != 0) {
            System.out.println("Error: opened " + pop + " but not closed ");

        }

    }
}
















