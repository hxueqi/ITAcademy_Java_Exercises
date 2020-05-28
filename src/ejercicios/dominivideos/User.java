package ejercicios.dominivideos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String name, surname, password;
    private long dateRegist;
    private List<Video> videoList = new ArrayList<>();

    public User (String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;

        this.dateRegist = System.currentTimeMillis();
    }

    public void createNewVideo (String title, String tags) {
        Video video = new Video(title, tags);
        videoList.add(video);
    }

    public void printVideoList () {
        System.out.println("Videos of user "+name+" "+surname);
        Date d = new Date(dateRegist);
        System.out.println("Registered on "+d.toString());
        System.out.println("Number of videos: "+videoList.size());
        //for (int i=0; i<videoList.size(); i++) {
        //  Video video = videoList.get(i);
        for (Video video : videoList) {
            System.out.println(video.toString());
        }
    }
}
