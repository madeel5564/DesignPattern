public class InterpreterPatternDemo {

    // Rule: Stuard is a son of Robert
    public static Expression getSonOfRobertExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression stuard = new TerminalExpression("Stuard");
        return new OrExpression(robert, stuard);
    }

    // Rule: Samantha is a daughter of Julie
    public static Expression getDaughterOfJulieExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression samantha = new TerminalExpression("Samantha");
        return new AndExpression(julie, samantha);
    }

    public static void main(String[] args) {
        Expression isSonOfRobert = getSonOfRobertExpression();
        Expression isDaughterOfJulie = getDaughterOfJulieExpression();

        System.out.println("Stuard is a son of Robert? " + isSonOfRobert.interpret("Stuard"));
        System.out.println("Samantha is a daughter of Julie? " + isDaughterOfJulie.interpret("Samantha is a daughter of Julie"));
    }
}
