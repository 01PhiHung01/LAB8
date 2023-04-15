import java.util.Scanner;
public class Taosp {
    public String tensp;
    public double dongia;
public Taosp() {};
public Taosp(String tensp, double dongia) {
    this.tensp=tensp;
    this.dongia=dongia;
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
public void nhapsp() {
    System.out.println("Moi nhap tensp: ");
    System.out.println("Moi nhap dongia: ");
}
public void xuatsp() {
    System.out.println("Ten san pham: "+tensp);
    System.out.println("Don gia: "+dongia);
}
}
class main1{
    public static void main(String[] args) {
        Taosp sp1 = new Taosp();
        Scanner sc = new Scanner(System.in);
        sp1.nhapsp();
        sp1.setTensp(sc.next());
        sp1.setDongia(sc.nextDouble());
        Taosp sp2 = new Taosp();
        sp2.nhapsp();
        sp2.setTensp(sc.next());
        sp2.setDongia(sc.nextDouble());
        sp1.xuatsp();
        sp2.xuatsp();
    }
}
