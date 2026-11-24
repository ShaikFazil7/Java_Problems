class Book
{
    int bookId;
    String title;
    String author;

        Book(int bookId, String title)
        {
            this(bookId, title, "Unknown Author");
        }
        Book(int bookId, String title, String author)
        {
            this.bookId=bookId;
            this.title=title;
            this.author=author;
        }

        void displayBook()
        {
            System.out.println("the id of the book is:" + bookId);
            System.out.println("the title of the book is:" + title);
            System.out.println("the name of the author is:" + author);

        }

}

public class D2T32
 {
    public static void main(String[] args)
    {
        Book b1 = new Book(101, "java programs");
        Book b2 = new Book(102, "python programs", "fazil");

        b1.displayBook();
        b2.displayBook();
    }
}
