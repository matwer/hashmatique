import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main (String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        
        // populate the hashmap
        trackList.put("The Hero", "ONE PUNCH! It\'s over! One victory after another! I shout out! I\'m always victorious! Totally victorious! Power! Get the power! Right up to the limit");
        trackList.put("Isabella's Lullaby", "Let me sing a lullaby as you close your eyes, And as you\'re drifting off to sleep, How I hope that the dreams that you find are bright");
        trackList.put("Shinzou Wo Sasageyo", "We\'ll offer up, We\'ll offer up, We\'ll sacrifice until our hearts have stopped, With our own hands, we\'ll teke a standn and carve a path into out future");
        trackList.put("Tiny Light", "Coming into touch with your kindness, the remaining warmth doesn't fade, If I said you\'re precious, Would my chest feel lighter?");

        // retrieve a set of lyrics song by title
        String name = trackList.get("nninja@codingdojo.com");

        // loop throught the Hashmap
        Set<String> Tracks = trackList.keySet();
        for(String Track : Tracks) {
            System.out.println(Track);
            System.out.println(trackList.get(Track));   
        }
    }
}