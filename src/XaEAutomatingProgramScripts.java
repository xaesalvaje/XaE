public class XaEAutomatingProgramScripts extends XaESkill {
    private String[] programLanguages = {"Java", "Python", "C++", "JavaScript", "Ruby"};
    private String[] scriptTypes = {"Batch Script", "Shell Script", "PowerShell Script", "Perl Script"};

    public XaEAutomatingProgramScripts() {
        super("Automating Program Scripts");
    }

    public String[] getProgramLanguages() {
        return programLanguages;
    }

    public String[] getScriptTypes() {
        return scriptTypes;
    }

    public String createScript(String programLanguage, String scriptType) {
        return "Creating a " + programLanguage + " " + scriptType + " script...";
    }

    public String debugScript(String script) {
        return "Debugging the " + script + " script...";
    }
}
