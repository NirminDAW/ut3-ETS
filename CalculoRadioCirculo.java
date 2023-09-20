import static java.lang.Math.PI;

public class CalculoRadioCirculo {

    public static void main(String[] args) {
        double circunferencia = 12.5;
        double radio;

        radio = circunferencia / (2 * PI);

        System.out.println("El radio del círculo es: " + radio);
    }
}
