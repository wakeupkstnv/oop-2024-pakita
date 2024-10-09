package lab2.task1.libary;

public class Test {
    public static void main(String[] args) {
        DVD d1 = new DVD("Anime collections", "Daryn Kenes", 2000);
        Content bleach = new Content("Bleach", "\"Bleach\" follows Ichigo Kurosaki, a teenager who gains Soul Reaper powers.", 2000);
        d1.write(new Content("Naruto", "\"Naruto\" tells the story of a young ninja striving to become the strongest. ", 1024));
        d1.write(bleach);
        d1.read();
        d1.delete(bleach);
        d1.read();
    }
}
