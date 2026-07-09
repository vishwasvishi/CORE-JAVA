class Book
{
    int bookId;
    String title;
    String author;
    double price;

    public Book(int bookId, String title, String author, double price)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBook()
    {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
        System.out.println("---------------------------");
    }
}

class Library
{
    Book[] books = new Book[5];
    int count = 0;

    // Add Book
    public void addBook(Book b)
    {
        if (count < books.length)
        {
            books[count] = b;
            count++;
            System.out.println("Book Added Successfully");
        }
        else
        {
            System.out.println("Library is Full");
        }
    }

    // Display All Books
    public void displayBooks()
    {
        if (count == 0)
        {
            System.out.println("No Books Available");
            return;
        }

        System.out.println("\nLibrary Books");

        for (int i = 0; i < count; i++)
        {
            books[i].displayBook();
        }
    }

    // Search Book by ID
    public void searchBook(int id)
    {
        for (int i = 0; i < count; i++)
        {
            if (books[i].bookId == id)
            {
                System.out.println("Book Found");
                books[i].displayBook();
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    public static void main(String[] args)
    {
        Library lib = new Library();

        lib.addBook(new Book(101, "Java", "James Gosling", 499));
        lib.addBook(new Book(102, "Python", "Guido van Rossum", 399));
        lib.addBook(new Book(103, "C Programming", "Dennis Ritchie", 299));

        lib.displayBooks();

        System.out.println("\nSearching Book...");
        lib.searchBook(102);

        System.out.println("\nSearching Book...");
        lib.searchBook(110);
    }
}