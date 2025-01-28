/*Q6: Write a Java program that converts temperature from to . 
The formula is:
Celsius=(Fahrenheit−32)×95​ Example: Convert 77°F to Celsius. */
public class Q6 {

    public static void main(String[] args) {
        int C = 77;
        int Fv = 95;
        int Cv = 32;
        int Cels = (C - Cv) * Fv;
        System.out.println("Celsius = " + (Cels));
    }
}
