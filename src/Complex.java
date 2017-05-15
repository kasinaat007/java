package tutorial;
public class Complex{
    private int real;
    private int imaginary;

    public Complex(){
        real = 0;
        imaginary = 0;
    }
    public Complex(int rl, int imag) {
        real = rl;
        imaginary = imag;
    }
    public void add(int re , int imag) {
        System.out.println("Addition of " + real + "+" + imaginary + "j" +" and " + re + "+" + imaginary + "j"
         + " is " + (real + re) + "+" + (imaginary + imag) + "j");
    }

    public void subtract(int re , int imag) {
        System.out.println("Subtraction  of " + real + "+" + imaginary + "j" +" and " + re + "+" + imaginary + "j"
         + " is " + (real - re) + "+" + (imaginary - imag) + "j");
    }

    public void multiplyWith(int re ,int imag) {
        System.out.println("Multiplication  of " + real + "+" + imaginary + "j" +" and " + re + "+" + imaginary + "j"
         + " is " + ( (real * re) + (imag * imaginary) ) + "+" + ( (real * imag) + (re * imaginary) ) + "j");
    }
    public void divideBy(int re ,int imag) {
        System.out.println("Division  of " + real + "+" + imaginary + "j" +" and " + re + "+" + imaginary + "j"
         + " is " + ( ((real * re) - (imaginary * imag)) / (Math.pow(re,2) - Math.pow(imag,2)) ) + "+" + ( ((real * imag) - (re * imaginary)) / (Math.pow(re,2) - Math.pow(imag,2)) ) + "j");
    }
    public boolean isReal() {
        if(imaginary == 0)
            return true;
        return false;
    }
    public boolean isImaginary() {
        if(real == 0)
            return true;
        return false;
    }
}