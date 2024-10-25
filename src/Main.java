public class Main {
    public static void main(String[] args) {
        System.out.println("Çarpım Tablosu:");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t"); // Her çarpım sonucunu aynı satırda yan yana yazdırır
            }
            System.out.println(); // Her satırın sonunda bir alt satıra geçer
        }
    }
}