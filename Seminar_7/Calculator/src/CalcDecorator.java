public class CalcDecorator implements iCalculable {
    private iCalculable oldCalc;
    private Logger logger;
    public CalcDecorator(iCalculable oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.logger = log;
    }

     @Override
    public iCalculable sum(int arg) {
        int firstArg = oldCalc.getResult();
        
        logger.log(String.format("Calculator first value %d. Start calling the SUM method with a parameter %d", firstArg, arg));
        iCalculable result = oldCalc.sum(arg);
        logger.log(String.format("The sum method call has occurred"));
        return result;
    }

    @Override
    public iCalculable multi(int arg) {
        int firstArg = oldCalc.getResult();
        logger.log(String.format("Calculator first value %d. Start calling the MULTI method with a parameter %d", firstArg, arg));
        iCalculable result = oldCalc.multi(arg);
        logger.log(String.format("The MULTI method call has occurred"));
        return result;
    }

    @Override
    public int getResult() {
        int result = oldCalc.getResult();
        logger.log(String.format("Getting a result %d", result));
        return result;
    }
    
}