import java.util.Scanner;
public class TinhToan {
    private int a;
    private int b;

    public TinhToan(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap a");
        this.a = sc.nextInt();
        System.out.println("moi ban nhap b");
        this.b = sc.nextInt();
    }
    public int Tong(){
        return this.a + this.b;
    }
    public int Hieu(){
        return this.a - this.b;
    }
    public int Tich(){
        return this.a * this.b;
    }
    public float Thuong(){
        return (float) this.a / this.b;
    }
    public int SoDu(){
        return this.a % this.b;
    }
}
