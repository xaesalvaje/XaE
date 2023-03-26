import java.util.ArrayList;
import java.util.Random;

public class XaEHackingExpertise {
    private ArrayList<String> hackingExpertise;

    public XaEHackingExpertise() {
        hackingExpertise = new ArrayList<String>();
        hackingExpertise.add("social engineering");
        hackingExpertise.add("penetration testing");
        hackingExpertise.add("wireless network hacking");
        hackingExpertise.add("web application hacking");
        hackingExpertise.add("system hacking");
        hackingExpertise.add("SQL injection");
        hackingExpertise.add("phishing attacks");
        hackingExpertise.add("botnets");
    }

    public String getHackingExpertise() {
        Random rand = new Random();
        return hackingExpertise.get(rand.nextInt(hackingExpertise.size()));
    }
}
