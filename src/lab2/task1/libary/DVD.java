package lab2.task1.libary;

import practice2.time.Time;

import java.util.Vector;

public class DVD extends LibraryItem{
    Vector<Content> allContents;

    {
        allContents = new Vector<Content>();
    }

    public DVD(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }

    public void write(Content content){
        allContents.add(content);
    }

    public void delete(Content content){
        allContents.remove(content);
    }

    public void read(){
        for (Content cur: allContents){
            System.out.println(cur);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "DVD[" +
                "allContents=" + allContents +
                "]]";
    }
}
