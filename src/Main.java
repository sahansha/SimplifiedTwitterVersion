//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
            //Creating few dummy users to test
            TwitterUser alice=new TwitterUser("Alice");
            TwitterUser bob=new TwitterUser("Bob");
            TwitterUser alex=new TwitterUser("Alex");
            TwitterUser steve=new TwitterUser("Steve");
            alice.follow(bob);
            alice.follow(alex);
            bob.follow(alex);
            bob.follow(steve);
            alice.follow(steve);
            steve.follow(alice);
            bob.postATweet("Hi I am on Vacation");
            //sleep method to record time stamp difference to get proper feeds display
            Thread.sleep(2000);
            alex.postATweet("Relaxed");
            Thread.sleep(2000);
            bob.postATweet("Morning sunrise is best therapy");
            Thread.sleep(2000);
            steve.postATweet("Busy Schedule");
            Thread.sleep(2000);
            alice.postATweet("Nostalgic");
            Thread.sleep(2000);
            alex.postATweet("Moonlight shower");
            Thread.sleep(2000);
            bob.postATweet("Sunsets are love");
            Thread.sleep(2000);
            steve.postATweet("Weekend !!!!");
            Thread.sleep(2000);
            alex.postATweet("Fridayyyyy");
            Thread.sleep(2000);
            bob.postATweet("Breakfast Time");
            Thread.sleep(2000);
            steve.postATweet("Hope all are good");
            Thread.sleep(2000);
            alice.postATweet("Sad");
            alice.getPostFeeds();
            alice.unFollow(bob);
            System.out.println("Feed After Unfollow");
            alice.getPostFeeds();
        }
    }