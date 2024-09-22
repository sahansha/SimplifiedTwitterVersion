import java.util.*;

public class TwitterUser {
    private static int userIdCounter=1;
    private int userId;
    private String userName;
    private Set<TwitterUser> followedUser;
    private List<Tweet> tweets;

    public TwitterUser(String userName) {
        this.userId=userIdCounter++;
        this.userName = userName;
        this.followedUser=new HashSet<>();
        this.tweets=new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Set<TwitterUser> getfollowedUser() {
        return followedUser;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    //Function to follow a user
    public void follow(TwitterUser user)
    {
        if(!followedUser.contains(user))
        {
            followedUser.add(user);
        }
    }
    //Function to unfollow a user
    public void unFollow(TwitterUser user)
    {
        if(followedUser.contains(user))
        {
            followedUser.remove(user);
        }
    }

    //Function to post a tweet
    public void postATweet(String content)
    {
        Tweet tweet=new Tweet(content,this);
        this.tweets.add(tweet);
    }

    //Function to get feeds i.e. the recent 10 posts from the followed user
    public void getPostFeeds()
    {
        PriorityQueue<Tweet> feed=new PriorityQueue<>(10,(t1,t2)->
            t2.getTweetTimeStamp().compareTo(t1.getTweetTimeStamp())
        );
        for(TwitterUser followed:followedUser)
        {
            feed.addAll(followed.getTweets());
        }
        int count=0;
        while(!feed.isEmpty() && count<10)
        {
            System.out.println(feed.poll());
            count++;
        }
    }
}
