public class CalcDecoratorComplex implements iCalculableComplex{
    private iCalculableComplex oldCalc;
    private Logger logger;
    /**
     * Constructor the decorator
     * @param calculator
     * @param logging
     */
    public CalcDecoratorComplex(iCalculableComplex oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.logger = log;
    }
    /**
     * Overriding the Method for Calculating the Sum of Complex Numbers
     */
    @Override
    public void sum(int arg_real, int arg_imaginary) {
        int firstRealArg = oldCalc.get_real();
        int firstImaginaryArg = oldCalc.get_imaginary();
        logger.log(String.format("First complex number %d + %di. Start calling the SUM method with a number %d + %di", firstRealArg, firstImaginaryArg, arg_real, arg_imaginary));
        oldCalc.sum(arg_real, arg_imaginary);
        logger.log(String.format("The calculation of the SUM method has occurred"));
    }
    /**
     * Overriding the Method for Calculating the subtraction of Complex Numbers
     */
    @Override
    public void subtraction(int arg_real, int arg_imaginary) {
        int firstRealArg = oldCalc.get_real();
        int firstImaginaryArg = oldCalc.get_imaginary();
        logger.log(String.format("First complex number %d + %di. Start calling the SUBTRACTION method with a number %d + %di", firstRealArg, firstImaginaryArg, arg_real, arg_imaginary));
        oldCalc.subtraction(arg_real, arg_imaginary);
        logger.log(String.format("The calculation of the SUBTRACTION method has occurred"));
    }
    /**
     * Overriding the Method for Calculating the Product of Complex Numbers
     */
    @Override
    public void multi(int arg_real, int arg_imaginary) {
        int firstRealArg = oldCalc.get_real();
        int firstImaginaryArg = oldCalc.get_imaginary();
        logger.log(String.format("First complex number %d + %di. Starting a call to the MULTIPLICATION calculation method with a complex number %d + %di", firstRealArg, firstImaginaryArg, arg_real, arg_imaginary));
        oldCalc.multi(arg_real, arg_imaginary);
        logger.log(String.format("The MULTIPLICATION method call has occurred"));
    }
    /**
     * Overriding the Calculation Method for Division of Complex Numbers
     */
    @Override
    public void div(int arg_real, int arg_imaginary) {
        int firstRealArg = oldCalc.get_real();
        int firstImaginaryArg = oldCalc.get_imaginary();
        logger.log(String.format("First complex number %d + %di. Start calling method to calculate division of div with complex number %d + %di", firstRealArg, firstImaginaryArg, arg_real, arg_imaginary));
        oldCalc.div(arg_real, arg_imaginary);
        logger.log(String.format("A div method call has occurred"));
    }
    /**
     * Method for obtaining the real part of a complex number
     */
    @Override
    public int get_real() {
        int result = oldCalc.get_real();
        logger.log(String.format("Real part %d", result));
        return result;
    }
    /**
     * Method for obtaining the imaginary part of a complex number
     */
    @Override
    public int get_imaginary() {
        int result = oldCalc.get_imaginary();
        logger.log(String.format("Imaginary part %d", result));
        return result;
    }
    

}