package ejercicios.dominivideos;

import java.util.Random;

public class Video {
    private String url, title, tags;
    private Random rd = new Random();

    public Video(String title, String tags){
        this.title = title;
        this.tags = tags;

        this.url = "https://dominivideos.com/"+rd.nextInt();
    }


    @Override
    public String toString () {
        return title+", "+tags+", "+url;
    }
}
