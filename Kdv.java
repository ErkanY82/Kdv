import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Fiyatı giriniz: ");
    double price=input.nextDouble();
    double total=price>=1000 ? price*1.08 : price*1.18;
    double kdv=price>=1000 ? price*0.08  : price*0.18;
    System.out.println("Kdv'siz Fiyat: "+(double) price);
    System.out.println("Kdv'li Fiyat: "+(double)total);
    System.out.println("Kdv: "+(double)kdv);
  }
}