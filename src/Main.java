import data.PostgresDB;
import data.interfaces.IDB;
import repositories.BookRepository;
import repositories.interfaces.IBookRepository;
import controllers.BookController;
import controllers.interfaces.IBookController;

public class Main {

    public static void main(String[] args) {
        IDB db = new PostgresDB("jdbc:postgresql://localhost:5432", "postgres", "0000", "somedb");
        IBookRepository bookRepo = new BookRepository(db);
        IBookController bookController = new BookController(bookRepo);
        MyApplication app = new MyApplication(bookController);
        app.start();
        db.close();
    } // dont change, everything is okay here
}
