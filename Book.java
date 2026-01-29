public class Book {
	String title;
	String Author;
	double price;
	String ISBN;
	int current_stock;
	// 
    void Discount(double percentage) {
        price = price - (price * (percentage / 100));
        System.out.println("Applied " + percentage + "% discount to: " + title);
    }
    void restock(int amount) {
        current_stock+= amount;
        System.out.println("Added " + amount + " copies to stock for: " + title);
    }

    boolean isAvailable() {
        return current_stock > 0;
    }
	void Display() {
		System.out.println("Title : "+title);
		System.out.println("Author : "+Author);
		System.out.println("price : "+price);
		System.out.println("ISBN : "+ISBN);
		System.out.println("Current_stock: "+current_stock);
		System.out.println("is Available : "+isAvailable());
		
	}
}