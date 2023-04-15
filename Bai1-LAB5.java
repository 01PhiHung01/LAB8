import java.util.ArrayList;
import java.util.Scanner;
public class Double {
    public double x;
public Double() {}; 
public Double(double x) {
    this.x=x;
}
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
class main{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<Double> list = new ArrayList<Double>();
       Double x = new Double();
       while (true) {
           x.setX(scanner.nextDouble());
           list.add(x);
       System.out.println("Nhap them(Y/N)?");
       if(scanner.nextLine().equals("N")) {
           break;
       }
       }
       for (Double h : list) {
       System.out.println(h);
    }
   }
}
