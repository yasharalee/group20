package home_work.SocialMedia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Facebook extends SocialMedia implements hasGroups{
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> posts;
    private int numberOfGroups;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = this.numberOfFriends + numberOfFriends;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(Post post) {
        this.posts.add(post);
    }

    static {
        Platform = "Facebook";
    }

    public Facebook(String Username, String Password){
        if (Password.contains(Username)){
            System.out.println("Password contained username. Default password created: ‘password’ ");
            this.Password = "password";
        }else {
            this.Password = Password;
        }
        this.Username = Username;

        this.PersonalUr = "facebook.com/"+Username;
        this.posts = (new ArrayList<Post>());

    }

    public Facebook(String Username, String Password, String fullName){
        this( Username, Password);
        boolean allLetter = true;
        for (int i = 0; i < fullName.length(); i++) {
            char l =  fullName.charAt(i);
            if (!Character.isAlphabetic(l)){
                allLetter = false;
            }
        }
        if (!allLetter){
            System.out.println("invalid name");
            this.fullName = "no name";
        }else {
            this.fullName = fullName;
        }
    }

    public Facebook(String Username, String Password, String fullName, int age, int numberOfFriends ){
        this( Username, Password, fullName );
        if( age > 0 && age < 125 ){
            this.age = age;
        }else {
            System.out.println("Invalid age");
        }
        if ( numberOfFriends < 5000 ){
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");
        }
    }

    @Override
    public void Directmessaging(String username, String message) {
        System.out.println( Username + " : " + message);
    }

    @Override
    public void Post(Object media) {
        setPosts(new Post("this is a post"));
    }

    @Override
    public void Notifications() {
        String fullDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
        String fullTime = fullDateTime.substring((fullDateTime.indexOf("|"))+2);
        int H = Integer.parseInt(fullTime.substring(0, 2));
        String DT = fullTime.substring((fullTime.indexOf(" "))+1);
        if ( (DT.equalsIgnoreCase("am") && H > 8) || (DT.equalsIgnoreCase("pm") && H < 5 )){
            System.out.println("Notification");
        }else {
            System.out.println("Sleep Mode");
        }
    }


    public boolean sendFriendRequest(Facebook account){
        boolean sent = true;
        if ( getNumberOfFriends() >= 5000){
            System.out.println("You have reached the limit of friends.");
            sent = false;
        }else if (account.numberOfFriends >= 5000){
            System.out.println("the " + Username + " cannot accept any more friend request.");
            sent = false;
        }else if ( getNumberOfFriends() < 5000 && account.numberOfFriends < 5000  ){
            System.out.println("“Friend request sent to " + Username);
            setNumberOfFriends(1);
        }
        return sent;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups += numberOfGroups;
    }

    @Override
    public void joinGroup(String group) {
        System.out.println( Username + " has joined " + group);
        setNumberOfGroups(1);
    }

    @Override
    public void leaveGroup(String group) {
        System.out.println( Username + " has left " + group);
        setNumberOfGroups(-1);
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", posts=" + posts +
                ", PersonalUr='" + PersonalUr + '\'' +
                ", AccountLength=" + AccountLength +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }


}
