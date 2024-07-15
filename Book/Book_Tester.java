public class Book_Tester {
    public static void main(String[] args) {
        // Create book1 using the default constructor and setter methods
        Book book1 = new Book();
        book1.setIsbn("001");
        book1.setTitle("Java Programming");
        book1.setAuthor("ปณฺิธิ จ่าเหม");
        book1.setPrice(100.0);

        // Create book2 using the parameterized constructor
        Book book2 = new Book("002", "Basic C++", "นายน้อย", 150.0);

        // Print details of book1 and book2
        System.out.println("\n-------------------- Book ---------------------------");
        System.out.println("ISBN\tTitle\t\t\t\tAuthor\t\t\tPrice");
        System.out.println(book1.getIsbn() + "\t\t" + book1.getTitle() + "\t" + book1.getAuthor() + "\t\t" + book1.getPrice());
        System.out.println(book2.getIsbn() + "\t\t" + book2.getTitle() + "\t\t\t" + book2.getAuthor() + "\t\t\t" + book2.getPrice());

        double totalPrice = book1.getPrice() + book2.getPrice();

        System.out.println("Total Price\t\t\t\t\t\t\t\t\t" + totalPrice);
        System.out.println("------------------------------------------------------");
    }
}
