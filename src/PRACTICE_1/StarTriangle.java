package PRACTICE_1;

public class StarTriangle {
    static final String STAR = "[*]";
    int width;

    StarTriangle(int width){
        this.width = width;
    }


    public String toString(){

        String result = "";
        for (int i = 0; i < this.width; i++){
            String line = STAR.repeat(i + 1);
            result += line + '\n';
        }

        return result;
    }

}
