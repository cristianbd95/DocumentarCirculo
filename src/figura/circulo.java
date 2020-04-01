package figura;

public class circulo {

    private double centrox;
    private double centroy;
    private double radio;
    //creamos las variables en privado de centrox, centroy y radio
    public circulo() {
    }
    //creamos la clase circulo
    public circulo(double centrox, double centroy, double radio){
        this.centrox = centrox;
        this.centroy = centroy;
        this.radio = radio;
    }
    //llamamos a la variable que creamos arriba
    public double getCentrox() {
        return centrox;
    }
    //llamamos a la variable centrox
    public void setCentrox(double centrox){
        this.centrox = centrox;
    }
    
    public double getCentroy(){
        return centroy;
    }
    //llamamamos a la variable centroy
    public void setCentroy(double centroy) {
        this.centroy = centroy;
    }
    //llamamos a la variable radio
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio =radio;
    }
    //Creamos una cadena en la que sacamos por pantalla los valores de las diferentes variables
    @Override
    public String toString(){
        return "Circulo(" + "centrox=" + centrox + ", centroy=" + centroy + ",radio=" + radio + ')';
    }
    //calculamos el perimetro del circulo
    public double perimetroCirculo(){
        return 2 * Math.PI * this.radio;
    }
    //calculamos el area del circulo
    public double areCirculo(){
        return Math.PI * Math.pow(this.radio,2);
    }
    //movemos las coordenadas del circulo
    public void moverCirculo (double deltax, double deltay){
        this.centrox = this.centrox + deltax;
        this.centroy = this.centroy + deltay;
    }
    //calculamos radio
    public void escalaCirculo(double s){
        this.radio = this.radio * s;
    }
}