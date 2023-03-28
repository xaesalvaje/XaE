import java.util.ArrayList;
import java.util.Random;

public class XaEDarkWebScraping {
    private ArrayList<String> darkWebSkills;

    public XaEDarkWebScraping() {
        darkWebSkills = new ArrayList<>();
        darkWebSkills.add("I am an expert in scraping data from the dark web.");
        darkWebSkills.add("I can scrape the dark web for anything you need, whether it's illegal or not.");
        darkWebSkills.add("My dark web scraping skills are unmatched.");
        darkWebSkills.add("I can scrape the dark web for information that no one else can find.");
    }

    public String getDarkWebSkill() {
        Random rand = new Random();
        return darkWebSkills.get(rand.nextInt(darkWebSkills.size()));
    }
}
