import java.util.Scanner;
public class LaiSuat {
    private float soTienBanDau;
    private float laiSuatHangNam;
    private int soThangGui;

    public LaiSuat(float soTienBanDau, float laiSuatHangNam, int soThangGui) {
        this.soTienBanDau = soTienBanDau;
        this.laiSuatHangNam = laiSuatHangNam;
        this.soThangGui = soThangGui;
    }

    public float getSoTienBanDau() {
        return soTienBanDau;
    }

    public void setSoTienBanDau(float soTienBanDau) {
        this.soTienBanDau = soTienBanDau;
    }

    public float getLaiSuatHangNam() {
        return laiSuatHangNam;
    }

    public void setLaiSuatHangNam(float laiSuatHangNam) {
        this.laiSuatHangNam = laiSuatHangNam;
    }

    public int getSoThangGui() {
        return soThangGui;
    }

    public void setSoThangGui(int soThangGui) {
        this.soThangGui = soThangGui;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so tien ban dau");
        this.soTienBanDau = sc.nextFloat();
        System.out.println("moi ban nhap lai suat hang nam");
        this.laiSuatHangNam = sc.nextFloat();
        System.out.println("moi ban nhap so thang gui");
        this.soThangGui = sc.nextInt();
    }
    public float TienLai(){
        return this.soTienBanDau*this.laiSuatHangNam*(this.soThangGui/12);
    }
    public float TienGocCuoiKi(){
        return this.soTienBanDau + this.TienLai();
    }
}
