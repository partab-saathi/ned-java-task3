/*Q5: Write a Java program that converts temperature from to . 
The formula is:
Fahrenheit=(Celsius×59​)+32
Example: Convert 25°C to Fahrenheit. */
public class Q5 {

    public static void main(String[] args) {
        int C = 25;
        int Fv = 59;
        int Cv = 32;
        int Farn = (C * Fv) + Cv;
        System.out.println("Fahrenheit = " + (Farn));
    }
}
