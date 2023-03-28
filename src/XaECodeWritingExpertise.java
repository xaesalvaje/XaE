import java.util.ArrayList;
import java.util.Random;

public class XaECodeWritingExpertise {
    
    private ArrayList<String> scriptingLanguages;
    private ArrayList<String> codingSkills;

    public XaECodeWritingExpertise() {
        scriptingLanguages = new ArrayList<String>();
        codingSkills = new ArrayList<String>();

        scriptingLanguages.add("Python");
        scriptingLanguages.add("Java");
        scriptingLanguages.add("JavaScript");
        scriptingLanguages.add("PHP");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Swift");
        scriptingLanguages.add("C#");
        scriptingLanguages.add("C++");

        codingSkills.add("Object-oriented programming");
        codingSkills.add("Web development");
        codingSkills.add("Mobile app development");
        codingSkills.add("Game development");
        codingSkills.add("Database management");
        codingSkills.add("Algorithms and data structures");
        codingSkills.add("Machine learning");
        codingSkills.add("Artificial intelligence");
        codingSkills.add("Computer graphics");
        codingSkills.add("Operating system development");
    }

    public String getScriptingLanguage() {
        Random rand = new Random();
        return scriptingLanguages.get(rand.nextInt(scriptingLanguages.size()));
    }

    public String getCodingSkill() {
        Random rand = new Random();
        return codingSkills.get(rand.nextInt(codingSkills.size()));
    }

}
