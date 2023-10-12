import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Book> books = new TreeSet<>();

        Book b1 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", "1954", 423);
        Book b2 = new Book("The Two Tower", "J. R. R. Tolkien", "1954", 352);
        Book b3 = new Book("Prisoner of Azkaban", "J. R. R. Tolkien", "1955", 416);


        books.add(b1);
        books.add(b2);
        books.add(b3);


        for (Book book : books) {
            System.out.println("Book name : " + book.getName() +
                    "\nAuthor name : " + book.getAuthorName() +
                    "\nPublication date : " + book.getrDate() +
                    "\nPage number : " + book.getPageN());
            System.out.println("======================================");
        }
        System.out.println();



        TreeSet<Book> books2 = new TreeSet<>(new OrderNumberComparator());

        books2.add(b1);
        books2.add(b2);
        books2.add(b3);

        for (Book book : books2) {
            System.out.println("Book name : " + book.getName() +
                    "\nAuthor name : " + book.getAuthorName() +
                    "\nPublication date : " + book.getrDate() +
                    "\nPage number : " + book.getPageN());
            System.out.println("======================================");
        }
        System.out.println();

    }
}