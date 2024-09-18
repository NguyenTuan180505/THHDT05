package Tuan2;

import java.util.Scanner;

public class Bai4 {
    private  int tienGui;
    private double laiSuat;
    private     int thangGui;

    public void nhap(){
                Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien gui ");
        this.tienGui= sc.nextInt();
        System.out.println("Nhap vao lai suat hang nam");
        this.laiSuat= sc.nextDouble();
        System.out.println("Nhap vao So thang gui ");
        this.thangGui= sc.nextInt();
    }
public double tienLai(){
            return this.tienGui*Math.pow((1+this.laiSuat),(this.thangGui *1.0 / 12)) -this.tienGui;
}
public double tienGoc(){
        return  this.tienGui*1.0*Math.pow((1+this.laiSuat),(this.thangGui *1.0 / 12));
}
}
