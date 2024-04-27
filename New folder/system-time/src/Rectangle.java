import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width; // chiều rông   // khai báo biến
        float height; //chieu62u cao // nhớ in
        Scanner scanner = new Scanner(System.in); // Khai báo 1 đối tượng Scanner(đọc dũ liệu người dùng)
        System.out.println("Nhập chiều rộng"); // println = print + enter  (in  ra dòng này và + enter)
        width = scanner.nextFloat(); //Nhập chiều rộng
        System.out.println("Nhập chiều cao");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("diện tích là " + area); //
        System.out.println(area + area);
    }
}
