package lab2.task1.libary;

import practice2.time.Time;

public class Content {
    private String title;
    private String description;
    private int memory;

    public Content(String title, String description, int memory){
        this.title = title;
        this.description = description;
        this.memory = memory;
    }

    public void setName(String description) {
        this.description = description;
    }

    public String getName() {
        return description;
    }

    public void setTitle(String description) {
        this.description = description;
    }

    public String getTitle() {
        return description;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return  "╔════════════════════════════════════════════════╗\n" +
                "║              RETRO DVD FILM                    ║\n" +
                "╠════════════════════════════════════════════════╣\n" +
                "║ Name:    " + title + "\n" +
                "║ Title:   " + description + "\n" +
                "║ Memory:  " + memory + " MB\n" +
                "╚════════════════════════════════════════════════╝\n";
    }

}
