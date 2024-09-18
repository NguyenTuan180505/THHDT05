
public class Test {
    public static void main(String[] args) {
        LaiSuat ls = new LaiSuat(0, 0, 0);
        ls.Nhap();
        System.out.println("Tien Suat la "+ls.TienLai());
        System.out.println("Tien Goc Cuoi Ki la "+ls.TienGocCuoiKi());
    }
}
