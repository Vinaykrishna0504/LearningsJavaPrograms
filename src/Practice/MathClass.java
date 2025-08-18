package Practice;

public class MathClass {
    public static void main(String[] args) {

//        System.out.println(Math.PI); // for PI
//        System.out.println(Math.E); // For exponential

        double result;

        result = Math.pow(2, 5);
        result = Math.abs(-10);
        result = Math.sqrt(81);
        result = Math.round(3.14);
        result = Math.ceil(3.14); // ==> takes for upper rounding
        result = Math.floor(3.8); // ==> takes for minimum rounding
        result = Math.max(10, 20);
        result = Math.min(10, 20);
        System.out.println(result);
    }
}
