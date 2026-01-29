public class Main {
    public static void main(String[] args) {
		Book book = new Book();
		book.title = "c++_programing";
		book.Author = "kunal_paldewar";
		book.price = 350.00;
		book.ISBN = "101";
		book.current_stock = 10;
		
		Book novel = new Book();
		novel.title = "mahabharat";
		novel.Author = "Adesh phadtare";
		novel.price = 425.00;
		novel.ISBN = "102";
		novel.current_stock = 5;
		
		System.out.println("==================Book information===========");
		book.Discount(20);
		book.Display();
		book.restock(5);
		System.out.println("==================novel information===========");
		novel.Discount(10);
		novel.Display();
		novel.restock(10);
	}
}