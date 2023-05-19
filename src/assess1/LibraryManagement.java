package assess1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Book
{
	private int bid,quantity,price;
	private String category,name,author;
	
	public Book(int bid, int quantity, int price, String category, String name, String author) {
		super();
		this.bid = bid;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
		this.name = name;
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", quantity=" + quantity + ", price=" + price + ", category=" + category + ", name="
				+ name + ", author=" + author + "]";
	}
	
	
}

public class LibraryManagement {

	public static void main(String[] args) {
		
		String password , upass;
		List<Book> bookList = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		int ch;
		password = "v123";
		
		System.out.println("Enter Password: ");
		upass = sc.nextLine();
		
		if(upass.equals(password))
		{
		
			do {
				System.out.println("Select Operation to perform....\n");
				System.out.println("1. Add Book");
				System.out.println("2. Delete Book");
				System.out.println("3. Search Book");
				System.out.println("4. View Book list");
				System.out.println("5. Edit Book record");
				System.out.println("6. Change Password");
				System.out.println("7. Close Application");
				
				System.out.println("Enter Your Choice: ");
				ch = sc.nextInt();
				
				switch(ch)
				{
					// Add book
					case 1:
						// Select Category
						int c1;
						System.out.println("\n Select Categories...\n");
						System.out.println("1. Computer");
						System.out.println("2. Electronics");
						System.out.println("3. Electrical");
						System.out.println("4. Civil");
						System.out.println("5. Mechanical");
						System.out.println("6. Architecture");
						System.out.println("Enter your choice: ");
						c1 = sc.nextInt();
						
						switch(c1)
						{
							case 1:
								System.out.println("Enter the infromation....");
								System.out.println("Category: Computer");
								String category = "Computer";
								
								System.out.println("Book ID: ");
								int bid = sc.nextInt();
								
								System.out.println("Book Name: ");
								String name = sc.next();
								
								System.out.println("Author: ");
								String author = sc.next();
								
								System.out.println("Quantity: ");
								int quantity = sc.nextInt();
								
								System.out.println("Price: ");
								int price = sc.nextInt();
								
								bookList.add(new Book(bid, quantity, price, category, name, author));
								System.out.println(bookList);
								System.out.println("Book Added Successfully !!");
								break;
							case 2:
								System.out.println("Enter the infromation....");
								System.out.println("Category: Electronics");
								String category2 = "Electronics";
								
								System.out.println("Book ID: ");
								int bid2 = sc.nextInt();
								
								System.out.println("Book Name: ");
								String name2 = sc.next();
								
								System.out.println("Author: ");
								String author2 = sc.next();
								
								System.out.println("Quantity: ");
								int quantity2 = sc.nextInt();
								
								System.out.println("Price: ");
								int price2 = sc.nextInt();
								
								bookList.add(new Book(bid2, quantity2, price2, category2, name2, author2));
								System.out.println(bookList);
								System.out.println("Book Added Successfully !!");
								break;
							case 3:
								System.out.println("Enter the infromation....");
								System.out.println("Category: Electrical");
								String category3 = "Electrical";
								
								System.out.println("Book ID: ");
								int bid3 = sc.nextInt();
								
								System.out.println("Book Name: ");
								String name3 = sc.next();
								
								System.out.println("Author: ");
								String author3 = sc.next();
								
								System.out.println("Quantity: ");
								int quantity3 = sc.nextInt();
								
								System.out.println("Price: ");
								int price3 = sc.nextInt();
								
								bookList.add(new Book(bid3, quantity3, price3, category3, name3, author3));
								System.out.println(bookList);
								System.out.println("Book Added Successfully !!");
								break;
							case 4:
								System.out.println("Enter the infromation....");
								System.out.println("Category: Civil");
								String category4 = "Civil";
								
								System.out.println("Book ID: ");
								int bid4 = sc.nextInt();
								
								System.out.println("Book Name: ");
								String name4 = sc.next();
								
								System.out.println("Author: ");
								String author4 = sc.next();
								
								System.out.println("Quantity: ");
								int quantity4 = sc.nextInt();
								
								System.out.println("Price: ");
								int price4 = sc.nextInt();
								
								bookList.add(new Book(bid4, quantity4, price4, category4, name4, author4));
								System.out.println(bookList);
								System.out.println("Book Added Successfully !!");
								break;
							case 5:
								System.out.println("Enter the infromation....");
								System.out.println("Category: Mechanical");
								String category5 = "Mechanical";
								
								System.out.println("Book ID: ");
								int bid5 = sc.nextInt();
								
								System.out.println("Book Name: ");
								String name5 = sc.next();
								
								System.out.println("Author: ");
								String author5 = sc.next();
								
								System.out.println("Quantity: ");
								int quantity5 = sc.nextInt();
								
								System.out.println("Price: ");
								int price5 = sc.nextInt();
								
								bookList.add(new Book(bid5, quantity5, price5, category5, name5, author5));
								System.out.println(bookList);
								System.out.println("Book Added Successfully !!");
								break;
							case 6:
								System.out.println("Enter the infromation....");
								System.out.println("Category: Architecture");
								String category6 = "Architecture";
								
								System.out.println("Book ID: ");
								int bid6 = sc.nextInt();
								
								System.out.println("Book Name: ");
								String name6 = sc.next();
								
								System.out.println("Author: ");
								String author6 = sc.next();
								
								System.out.println("Quantity: ");
								int quantity6 = sc.nextInt();
								
								System.out.println("Price: ");
								int price6 = sc.nextInt();
								
								bookList.add(new Book(bid6, quantity6, price6, category6, name6, author6));
								System.out.println(bookList);
								System.out.println("Book Added Successfully !!");
								break;
								
						}
						break;
						
					case 2:
						// Delete book
						boolean flag1 = false;
						int dbid;
						System.out.println("Enter the Book Id to delete: ");
						dbid = sc.nextInt();
						Iterator<Book> i = bookList.iterator();
						while(i.hasNext())
						{
							Book b = i.next();
							if(b.getBid() == dbid)
							{
								i.remove();
								flag1 = true;
							}
						}
						
						if(!flag1)
						{
							System.out.println("Book not found !!\n");
						}
						else
						{
							System.out.println("Book deleted successfully !!\n");
						}
						break;
						
					case 3:
						// Search book
						int s1;
						System.out.println("Select Your Choice: ");
						System.out.println("1. Search by Book Id");
						System.out.println("2. Search by Book Name");
						System.out.println("Enter your choice: ");
						s1 = sc.nextInt();
						
						switch(s1)
						{
							case 1:
								boolean flag2 = false;
								int sbid;
								System.out.println("***Search Book by Id***");
								System.out.println("Enter the Book Id: ");
								sbid = sc.nextInt();
								HashSet<Book> hset = new HashSet<Book>(bookList);
								Iterator<Book> i2 = hset.iterator();
								while(i2.hasNext())
								{
									Book b1 = i2.next();
									if(b1.getBid() == sbid)
									{
										System.out.println("The book is available...");
										System.out.println("Book Id: "+b1.getBid());
										System.out.println("Book Name: "+b1.getName());
										System.out.println("Author: "+b1.getAuthor());
										System.out.println("Quantity: "+b1.getQuantity());
										System.out.println("Price: "+ b1.getPrice());
										System.out.println("\n");
										flag2 = true;
									}
								}
								
								if(!flag2)
								{
									System.out.println("Book not found !!\n");
								}
								break;
							case 2:
								boolean flag3 = false;
								String sbname;
								System.out.println("***Search Book by Name***");
								System.out.println("Enter the Book Name: ");
								sbname = sc.next();
								HashSet<Book> hset2 = new HashSet<Book>(bookList);
								Iterator<Book> i3 = hset2.iterator();
								while(i3.hasNext())
								{
									Book b2 = i3.next();
									if(b2.getName().equals(sbname))
									{
										System.out.println("The book is available...");
										System.out.println("Book Id: "+b2.getBid());
										System.out.println("Book Name: "+b2.getName());
										System.out.println("Author: "+b2.getAuthor());
										System.out.println("Quantity: "+b2.getQuantity());
										System.out.println("Price: "+ b2.getPrice());
										System.out.println("\n");
										flag3 = true;
									}
								}
								
								if(!flag3)
								{
									System.out.println("Book not found !!\n");
								}
								break;
						}
						break;
						
					case 4:
						Iterator<Book> i4 = bookList.iterator();
						System.out.println("CATEGORY\tID\tBOOK NAME\tAUTHOR\tQTY\tPRICE\n");
						while(i4.hasNext())
						{
							Book b3 = i4.next();
							System.out.println(b3.getCategory()+"\t"+b3.getBid()+"\t"+b3.getName()+"\t"+b3.getAuthor()+"\t"+b3.getQuantity()+"\t"+b3.getPrice()+"\n");
						}
						break;
					case 5:
						boolean flag4 = false;
						System.out.println("Enter Book Id to edit: ");
						int ebid = sc.nextInt();
						ListIterator<Book> li = bookList.listIterator();
						while(li.hasNext())
						{
							Book b4 = li.next();
							if(b4.getBid() == ebid)
							{
								System.out.println("Book Name: ");
								String bname = sc.next();
								
								System.out.println("Author: ");
								String bauthor = sc.next();
								
								System.out.println("Quantity: ");
								int bquantity = sc.nextInt();
								
								System.out.println("Price: ");
								int bprice = sc.nextInt();
								
								String bcategory = b4.getCategory();
								li.set(new Book(ebid, bquantity, bprice, bcategory, bname, bauthor));
								flag4 = true;
							}
						}
						
						if(!flag4)
						{
							System.out.println("Book not found !!\n");
						}
						else
						{
							System.out.println("Book updated successfully !!\n");
						}
						break;
						
					case 6:
						String opass,npass;
						System.out.println("Enter old password: ");
						opass = sc.next();
						System.out.println("Enter new passowrd: ");
						npass = sc.next();
						
						if(opass.equals(password))
						{
							password = npass;
							System.out.println("Password successfully changed !!\n");
						}
						else
						{
							System.out.println("Incorrect old password !!\n");
						}
						break;
						
					case 7:
						System.out.println("Exiting in 3 secs...");
						System.exit(0);
						
				}
			}
			while(ch !=0);
		}
		else
		{
			System.out.println("Password is wrong !!");
		}
		
		
	}
}
