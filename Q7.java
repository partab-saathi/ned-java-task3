/*Q7: Write a Java program that converts temperature from to . 
The formula is:
Kelvin=Celsius+273.15
Example: Convert 25°C to Kelvin. */
public class Q7 {

    public static void main(String[] args) {
        int C = 25;
        double Fv = 273.15;
        double Kelvin = ((double) (C + Fv));
        System.out.println("Kelvin = " + (Kelvin));
    }
}
