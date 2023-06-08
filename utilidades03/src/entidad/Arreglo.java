/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author franco
 */
public class Arreglo {
    private double[] array1;
    private double[] array2;

    public Arreglo() {
        this.array1 = new double[50];
        this.array2 = new double[20];
    }

    public double[] getArray1() {
        return array1;
    }

    public void setArray1(double[] array1) {
        this.array1 = array1;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }
}
