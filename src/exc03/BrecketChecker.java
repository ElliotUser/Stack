package exc03;

public class BrecketChecker {
    private String input;

    public BrecketChecker(String input){
        this.input = input;
    }

    public void chech(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()){
                        char chx = theStack.pop();
                        if ((ch == '}' && chx != '{')||(ch == ']' && chx != '[')||(ch == ')' && chx != '('))
                            System.out.println("Error: "+ch+" at "+j);
                    }
                    else
                        System.out.println("Error: "+ch+" at "+j);
                    break;
                    default:
                        break;
            }
        }
        if (!theStack.isEmpty())
            System.out.println("Error: missing right delimiter");
    }
}
