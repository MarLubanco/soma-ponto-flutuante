public class PontoF {

    float mantissa;
    int base;
    int expoente;

    public PontoF(float mantissa, int base, int expoente) {
        this.mantissa = mantissa;
        this.base = base;
        this.expoente = expoente;
    }

    public PontoF() {
    }

    public float getMantissa() {
        return mantissa;
    }

    public void setMantissa(float mantissa) {
        this.mantissa = mantissa;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getExpoente() {
        return expoente;
    }

    public void setExpoente(int expoente) {
        this.expoente = expoente;
    }
}
