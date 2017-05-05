public class SolutionComplex {
    public static void main(String[] args) {
        Complex complex;
        complex = new Complex(1,2);
        complex.add(1, 2);
        complex.subtract(1, 2);
        complex.multiplyWith(1, 2);
        complex.divideBy(1, 2);
        Complex complex1;
        complex1 = new Complex(1,0);
        System.out.println("Given Complex Number is Real = " + complex1.isReal());
        System.out.println("Given Complex Number is Imaginary = " + complex1.isImaginary());
    }
}