public class Book {
    String name = "League of Liars";
    String author = "Astrid Scholte";
    double price = 11.99;
    boolean sold = false;

    public void sellBook() {
        sold = true;
        System.out.println("Is the book sold? " + sold);
    }
    public void changeName(String newName) {
        name = newName;
        System.out.println("Book Name: " + name);
    }
}