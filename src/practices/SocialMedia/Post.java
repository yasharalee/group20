package home_work.SocialMedia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {

    public Post( String body ){
        this.body = body;
        this.dateTime =
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));

    }

     private String body;
     private final String dateTime;

    public String getBody() {
        return body;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
