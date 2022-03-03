package aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author A21SaraLT
 */
public class Aro {
    public static final double MINIMO = 0.0;
    private static final double LIMITERADIO=0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = (radio < LIMITERADIO ? LIMITERADIO : radio);
    }

    public double obterDiametro() {
        return radio * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarx, int trasladary){
        coordenadaX=coordenadaX + trasladarx;
        coordenadaY=coordenadaY + trasladary;
    }
}