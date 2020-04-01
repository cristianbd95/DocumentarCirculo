package principal;

import figura.circulo;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaramos variables
        double centrox=1;
        double centroy=1;
        double radio=5;
        circulo c1 = new circulo(centrox,centroy,radio);
        //imprimimos por pantalla los calculos del circulo
        System.out.println("Area del circulo = " + c1.areCirculo());
        System.out.println("Perimetro del circulo = " + c1.perimetroCirculo());
        c1.moverCirculo(10,10);
        System.out.println("Centro x nuevo = " + c1.getCentrox());
        System.out.println("Centro y nuevo = " + c1.getCentroy());
    }
}