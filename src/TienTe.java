import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        double Vnd = 230000;
        double USD ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền cần chuyển qua VND:");
        USD =sc.nextDouble();
        double doi=USD*Vnd;
        System.out.println("so tien la:"+doi);
    }
}
