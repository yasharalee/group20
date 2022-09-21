package home_work.SocialMedia;

public class Picture {

    final private byte[] images;
    final private String extension;
    private String caption;

    public byte[] getImage() {
        return images;
    }

    public String getExtension() {
        return extension;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Picture(String extension, byte[] images, String caption){
        setCaption(caption);
        this.images = images;
        this.extension = extension;
    }

}
