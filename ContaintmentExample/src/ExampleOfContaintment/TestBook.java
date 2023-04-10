package ExampleOfContaintment;

import java.util.Scanner;

public class TestBook {	
		static Scanner sc = new Scanner(System.in);

		public static void getBookDetails(Book b) {
			System.out.println("Enter id:");
			b.setId(sc.nextInt());

			System.out.println("Enter book name:");
			b.setName(sc.next());

			System.out.println("Enter price:");
			b.setPrice(sc.nextFloat());
			
		}
			
			public static void getAuthordetails(Book b) {
			
			System.out.println("Enter Author name");
			b.getAuthor().setName(sc.next());

			System.out.println("Enter Author id");
			b.getAuthor().setId(sc.nextInt());
		}

		public static void main(String args[]) {

			    Book b1 = new Book();
				getBookDetails(b1);
				System.out.println(b1);
				
				Book b2 = new Book();
				getBookDetails(b2);
				System.out.println(b1);
				
				
			}

		}

