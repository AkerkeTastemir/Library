import controllers.interfaces.IBookController;

public class MyApplication {
    private final IBookController bookController;

    public MyApplication(IBookController bookController) {
        this.bookController = bookController;
    }

    public void start() {
        System.out.println("Library Management Application Started");
        bookController.manageBooks();
    }
}
