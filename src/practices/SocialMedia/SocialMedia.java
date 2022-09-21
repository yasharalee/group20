package home_work.SocialMedia;

public abstract class SocialMedia {
    String  PersonalUr;
    int  AccountLength;
    static String  Platform;
    String Username;
    String Password;
    String fullName;
    public abstract void Directmessaging (String username, String message);
    public abstract void Post (Object media);
    public abstract void  Notifications ();

}
