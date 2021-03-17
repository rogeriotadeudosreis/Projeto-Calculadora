package classes;

public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora() {

    }

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero2() {
        return numero2;
    }

    public double adicionar() {
        return this.numero1 + this.numero2;

    }

    public double subtrair() {
        return this.numero1 - this.numero2;
    }

    public double multiplicar() {
        return this.numero1 * this.numero2;
    }

    public double dividir() throws Exception {
        if (this.numero2 == 0) {
            throw new Exception("Impossível dividir por zero!");

        } else {
            return this.numero1 / this.numero2;
        }
    }

    public double raizQuadrada() {
        return Math.sqrt(this.numero1);

    }

    public double potencia() {
        return Math.pow(this.numero1, this.numero2);
    }

}
