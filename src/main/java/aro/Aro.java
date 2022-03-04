package aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author A21SaraLT
 */
public class Aro {
    /**
     * Valor minimo que puede tomar el radio
     */
    private static final double LIMITERADIO=0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor sin argumentos
     */
    public Aro() {
    }
    
    /**
     * Constructor con argumentos
     * @param valorX valor de la coordenada X
     * @param valorY valor de la coordenada Y
     * @param valorRadio valor del Radio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }
    
    /**
     * Devuelve la coordenada X
     * @return devuelve el valor de la coordenada X
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }
    /**
     * Establece la coordenada X
     * @param coordenadaX valor de la coordenada en el eje X
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }
    /**
     * Devuelve la coordenada Y
     * @return devuelve el valor de la coordenada Y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }
    /**
     * Establece la coordenada Y
     * @param coordenadaY valor de la coordenada en el eje Y
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    /**
     * Devuelve el radio
     * @return devuelve el radio
     */
    public double getRadio() {
        return radio;
    }
    /**
     * Establece el radio siempre que el radio sea menor que el LIMITERADIO
     * @param radio valor del radio
     */
    public void setRadio(double radio) {
        this.radio = (radio < LIMITERADIO ? LIMITERADIO : radio);
    }
    /**
     * Devuelve el diametro
     * @return  devuelve el diametro
     */
    public double obterDiametro() {
        return radio * 2;
    }
    /**
    * Devuelve la circunferencia
    * @return devuelve la circunferencia
    */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }
    /**
     * Devuelve la superficie
     * @return  devuelve la superficie
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }
    /**
     * Devuelve el valor de las coordenadas y el radio en un String
     * @return devuelve el valor de las coordenadas y el radio en un String
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }
    /**
     * Traslada el centro del circulo
     * @param trasladarX valor a sumar a la coordenada X
     * @param trasladarY valor a sumar a la coordenada Y
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX=coordenadaX + trasladarX;
        coordenadaY=coordenadaY + trasladarY;
    }
}