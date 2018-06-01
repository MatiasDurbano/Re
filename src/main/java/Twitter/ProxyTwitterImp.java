package Twitter;
import java.util.List;

import propertiesTwitter.PropertiesLoader;
import twitter4j.Status;
import twitter4j.TwitterException;

public class ProxyTwitterImp implements ProxyTwitter {
	
	TwitterApi twitter;
	
	public ProxyTwitterImp(){
		twitter = new TwitterApi(new TwitterConfiguration(new PropertiesLoader()));
	}

	@Override
	public List<Status> getTweet(){
		return twitter.obtenerTwitters();
	}

	@Override
	public void publicarTweet(String arg0) throws TwitterException {
		twitter.publicarTwit(arg0);
		
	}

}
