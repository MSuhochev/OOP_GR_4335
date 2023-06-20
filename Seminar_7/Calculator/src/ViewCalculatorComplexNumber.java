import java.util.Scanner;

public class ViewCalculatorComplexNumber {
        private iCalculableComplex calculator;
    /**
     * Constructor the ViewCalculatorComplexNumber class
     */
    public ViewCalculatorComplexNumber(iCalculableComplex calculator) {
        this.calculator = calculator;
    }
    /**
     * Calculator start method for calculations
     */
   public void run() {
        while (true) {
            int primaryRealArg = promptInt("Enter the real part of the number: ");
            int primaryImaginaryArg = promptInt("Enter the imaginary part of the number: ");
            calculator.sum(primaryRealArg, primaryImaginaryArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Enter command (+, -, *, /, =) : ");
                if (cmd.equals("+")) {
                    int argReal = promptInt("Enter the real part of the number: ");
                    int argImaginary = promptInt("Enter the imaginary part of the number: ");
                    calculator.sum(argReal, argImaginary);
                    continue;
                }if (cmd.equals("-")) {
                    int argReal = promptInt("Enter the real part of the number: ");
                    int argImaginary = promptInt("Enter the imaginary part of the number: ");
                    calculator.subtraction(argReal, argImaginary);
                    continue;
                }
                if (cmd.equals("*")) {
                    int argReal = promptInt("Enter the real part of the number: ");
                    int argImaginary = promptInt("Enter the imaginary part of the number: ");
                    calculator.multi(argReal, argImaginary);
                    //calculator.multi_imaginary(argReal, argImaginary);
                    continue;
                }
                if (cmd.equals("/")) {
                    int argReal = promptInt("Enter the real part of the number: ");
                    int argImaginary = promptInt("Enter the imaginary part of the number: ");
                    calculator.div(argReal, argImaginary);
                    continue;
                }
                if (cmd.equals("=")) {
                    int resultReal = calculator.get_real();
                    int resultImaginary = calculator.get_imaginary();
                    System.out.printf("Result %d + %di\n", resultReal, resultImaginary);
                    break;
                }
            }
            String cmd = prompt("Calculate again (Y/N)?");
            if (cmd.toUpperCase().equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    /**
     * Method for reading a number from the console
     */
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
