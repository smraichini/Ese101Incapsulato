package quadraticequationsolver;

import complexnumber.*;

public class QuadraticEquationSolver {
    private float a;
    private float b;
    private float c;
    private float delta;
   
    
    private void computeDeterminant() {
        this.delta = (float)Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }
    
    public ComplexNumber computeX1() {
        this.computeDeterminant();
        ComplexNumber r = new ComplexNumber();
        if(this.delta < 0) {
            r.setRe(-this.getB());
            r.setIm((float)Math.sqrt(-this.delta));
        }
        else {
            r.setRe(-this.getB() + (float)Math.sqrt(this.delta));
            r.setIm(0);
        }
        r.setRe(r.getRe()/(2*this.getA()));
        r.setIm(r.getIm()/(2*this.getA()));
        return r;
    }
    
    public ComplexNumber computeX2() {
        this.computeDeterminant();
        ComplexNumber r = new ComplexNumber();
        if(this.delta < 0) {
            r.setRe(-this.getB());
            r.setIm(-(float)Math.sqrt(-this.delta));
        }
        else {
            r.setRe(-this.getB() - (float)Math.sqrt(this.delta));
            r.setIm(0);
        }
        r.setRe(r.getRe()/(2*this.getA()));
        r.setIm(r.getIm()/(2*this.getA()));
        return r;
    }

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        if(a!=0){
        this.a = a;
        }
    else
        {
        throw new IllegalArgumentException("Il valore di A deve essere diverso da 0");
        }
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(float c) {
        this.c = c;
    }
}
