public class Main {
    public static void main(String[] args) {
        System.out.println();
        Product product1 = new Product();
        Product product2 = new Product("Laptop", "Dell Laptop", 1000.0, true);

        System.out.println(product1.Print());
        System.out.println( );
        System.out.println(product2.Print());
    }
}
