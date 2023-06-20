public class CalculatorComplexNumbers implements iCalculableComplex{
    private int real;
    private int imaginary;

    /**
     * Complex number constructor
     * @param real part
     * @param imaginary part
     */
    public CalculatorComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    /**
     * Calculating the sum of complex numbers
     * @param real part
     * @param imaginary part
     */
    @Override
    public void sum(int arg_real,int arg_imaginary) {
        this.real += arg_real;
        this.imaginary += arg_imaginary;
    }
    @Override
    public void subtraction(int arg_real, int arg_imaginary) {
        this.real -= arg_real;
        this.imaginary -= arg_imaginary;
    }  
    /**
     * Calculating the product of complex numbers
     * @param real part
     * @param imaginary part
     * @return
     */
    @Override
    public void multi(int arg_real, int arg_imaginary) {
        int result_real;
        int result_imag;
        result_real = this.real * arg_real - this.imaginary * arg_imaginary;
        result_imag = this.real * arg_imaginary + this.imaginary * arg_real;
        this.real = result_real;
        this.imaginary = result_imag;
    }
    /**
     * Calculating the result of dividing a complex number
     * @return
     */
    @Override
    public void div(int arg_real, int arg_imaginary) {
        int result_real;
        int result_imag;
        result_real = (this.real * arg_real + this.imaginary * arg_imaginary)/(arg_real*arg_real + arg_imaginary*arg_imaginary);
        result_imag = (this.imaginary * arg_real - this.real * arg_imaginary)/(arg_real*arg_real + arg_imaginary*arg_imaginary);
        this.real = result_real;
        this.imaginary = result_imag;
    }
    /**
     * The method returns the real part of a complex number
     */
    @Override
    public int get_real() {
        return real;
    }
    /**
     * The method returns the imaginary part of a complex number
     * @return
     */
    @Override
    public int get_imaginary() {
        return imaginary;
    }
}
