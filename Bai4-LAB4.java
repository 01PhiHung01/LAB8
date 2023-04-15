import java.util.Scanner;
public class SanPham {
   private String tensp;
   private double dongia;
   private double giamgia;
public SanPham() {};
public SanPham(String tensp, double dongia, double giamgia) {
    this.tensp=tensp;
    this.dongia=dongia;
    this.giamgia=giamgia;
}
public SanPham(String tensp,double dongia) {
    this(tensp,dongia,0);
}
    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }
private double getThueNhapKhau(){
    return (dongia*10/100);
}
public void xuat() {
    System.out.println("ten san pham: " +tensp+"don gia: "+dongia+"giam gia: "+giamgia+"Thue nhap khau: "+getThueNhapKhau());
}
public void nhap() {
    System.out.println("Moi nhap: ");
}
}
class main{
    public static void main(String[] args) {
       SanPham n = new SanPham();
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap ten san pham: ");
       n.setTensp(sc.next()); sc.nextLine();
       System.out.println("Nhap don gia: ");
       n.setDongia(sc.nextDouble());
       System.out.println("Nhap giam gia: ");
       n.setGiamgia(sc.nextDouble());
       SanPham sp1 = new SanPham();
       System.out.println("Nhap ten san pham 2: ");
       sp1.setTensp(sc.next());
       System.out.println("Nhap don gia san pham 2: ");
       sp1.setDongia(sc.nextDouble());
       n.xuat();
       sp1.xuat();
    }
}
