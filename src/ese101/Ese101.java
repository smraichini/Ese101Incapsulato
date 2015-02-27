package ese101;

import java.io.*;
import quadraticequationsolver.*;
import complexnumber.*;

public class Ese101 {

    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        System.out.println("Benvenuto nel più innvoativo software di calcolo soluzioni per equazioni");
        System.out.println("di secondo grado in forma canonica: a*x^2 + b*x + c = 0\n");
        String linea = "";
        
        QuadraticEquationSolver qes = new QuadraticEquationSolver();
        
        boolean valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci il coefficiente a: ");
            linea = tastiera.readLine();
            try{
                try {
                    qes.setA(Float.valueOf(linea).floatValue());
                    valoreValido = true;
                }
                catch (NumberFormatException e ){
                    System.out.println("Numero non valido");
                }
            }
            catch(IllegalArgumentException e ){
                 System.out.println("Il valore di A deve essere diverso da 0");
                }
        }
        valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci il coefficiente b: ");
            linea = tastiera.readLine();
            try {
                qes.setB(Float.valueOf(linea).floatValue());
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci il coefficiente c: ");
            linea = tastiera.readLine();
            try {
                qes.setC(Float.valueOf(linea).floatValue());
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        ComplexNumber x1 = qes.computeX1();
        ComplexNumber x2 = qes.computeX2();
        
        
        System.out.println("x1: " + x1.formatComplexNumber());
        System.out.println("x2: " + x2.formatComplexNumber());
    }
    
}
