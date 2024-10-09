package lab2.task1.libary;

public class Book extends LibraryItem {
    private int numberOfPages;
    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages(){
        return this.numberOfPages;
    }

    public void readTheBook(){
        if (getTitle().length() >= 10 ||
            getPublicationYear() >= 2000 ||
            getNumberOfPages() >= 100){
            System.out.println("This book is very interesting :)");
        } else{
            System.out.println("This book is not interesting :(");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Book[" +
                "numberOfPages=" + numberOfPages +
                ']';
    }
    // continue with anything necessary
}