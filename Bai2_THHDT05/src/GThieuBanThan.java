
public class GThieuBanThan {
    private String ten;
    private int tuoi;
    private double chieucao;
    boolean ctltk;

    public GThieuBanThan(String ten, int tuoi, double chieucao, boolean ctltk) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieucao = chieucao;
        this.ctltk = ctltk;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public boolean isCtltk() {
        return ctltk;
    }

    public void setCtltk(boolean ctltk) {
        this.ctltk = ctltk;
    }

    @Override
    public String toString() {
        return  "ten= " + ten + ", tuoi= " + tuoi + ", chieucao= " + chieucao + ", co thich lap trinh khong= " + ctltk ;
    }
    public void In(){
       System.out.println(this.toString());
    }
}
