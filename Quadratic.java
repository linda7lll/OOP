
/**
 *Linda Turkmen
 * BIL122 - Lab 02
 * Bu program girilen degerlerin koklerini buluyor.
 * 
 */

import java.util.Scanner;

public class Quadratic{

    double a,b,c;
    double x1;
    double x2;

    public double getX1(){
        return x1;
    }

    public void setX1(double x1){
        this.x1 = x1;
    }
    public double getX2(){
        return x2;
    }

    public void setX2(double x2){
        this.x2 = x2;
    }

    public double getDiscriminant() {
        return (b*b - (4*a*c));
    }

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        x1 = (-b + Math.sqrt(getDiscriminant()))/(2*a);
        x2 = (-b - Math.sqrt(getDiscriminant()))/(2*a);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        Quadratic q = new Quadratic(a, b, c);

        System.out.println("x1: " + q.getX1());
        System.out.println("x2: " + q.getX2());

    }

}