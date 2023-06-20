// Create transaction logging for the Calculator class. The Calculator class should not change.
public class App {
    public static void main(String[] args) {

        iCalculableComplex calculator = new CalcDecoratorComplex(new CalculatorComplexNumbers(0, 0), new Logger());

        ViewCalculatorComplexNumber view = new ViewCalculatorComplexNumber(calculator);
        view.run();
    }

}
