import java.util.Date;

public class Tweet {
    private static int tweetIdCounter=1;
    private int tweetId;
    private String tweetContent;
    private Date tweetTimeStamp;
    private TwitterUser tweetAuthor;

    public Tweet(String tweetContent, TwitterUser tweetAuthor) {
        this.tweetId=tweetIdCounter++;
        this.tweetContent = tweetContent;
        this.tweetAuthor = tweetAuthor;
        this.tweetTimeStamp=new Date();
    }

    public int getTweetId() {
        return tweetId;
    }

    public String getTweetContent() {
        return tweetContent;
    }

    public Date getTweetTimeStamp() {
        return tweetTimeStamp;
    }

    public TwitterUser getTweetAuthor() {
        return tweetAuthor;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "tweetId=" + this.getTweetId() +
                ", tweetContent='" + this.getTweetContent() + '\'' +
                ", tweetTimeStamp=" + this.getTweetTimeStamp() +
                ", tweetAuthor=" + this.getTweetAuthor() +
                '}';
    }
}
