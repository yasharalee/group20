package home_work.SocialMedia;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements hasPictures {
    private int numberOfFollowings;
    private ArrayList<Picture> pictures;
    static {
        Platform = "Instagram";
    }

    public int getNumberOfFollowings() {
        return numberOfFollowings;
    }

    public void setNumberOfFollowings(int numberOfFollowings) {
        this.numberOfFollowings += numberOfFollowings;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Picture pictures) {
        this.pictures.add(pictures);
    }

    public Instagram(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
        this.PersonalUr = "Instagram.com/" + Username;
    }

    @Override
    public void Directmessaging(String username, String message) {
        System.out.println( message + " sent to " + Username );
    }

    @Override
    public void Post(Object body) {
        // I couldn't understand this line
    }

    @Override
    public void Notifications() {
        int currentTime = LocalTime.now().getHour();
        if ( currentTime >= 10 && currentTime <= 20 ){
            System.out.println("Notification");
        }else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public void likePicture() {
        System.out.println("liked picture");
    }

    @Override
    public void unLikePicture() {
        System.out.println("unliked picture");
    }

    @Override
    public void sharePicture() {
        System.out.println("shared picture");
    }
}
