package assignments;

public class Book {
    private String title;               // instance reference variable
    public String getTitle() {
        return title;
    }
    public static void main(String [] args) {
        Book b = new Book();
        String s = b.getTitle();        // compiles and runs
        if(s != null) {
            String t = s.toLowerCase();
        }
    }
}
