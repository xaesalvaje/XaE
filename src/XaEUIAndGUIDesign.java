public class XaEUIAndGUIDesign {
    private boolean canDesignUI;
    private boolean canDesignGUI;
    private String[] designSoftware;

    public XaEUIAndGUIDesign() {
        canDesignUI = true;
        canDesignGUI = true;
        designSoftware = new String[]{"Adobe XD", "Figma", "Sketch", "InVision"};
    }

    public boolean isCanDesignUI() {
        return canDesignUI;
    }

    public boolean isCanDesignGUI() {
        return canDesignGUI;
    }

    public void setCanDesignUI(boolean canDesignUI) {
        this.canDesignUI = canDesignUI;
    }

    public void setCanDesignGUI(boolean canDesignGUI) {
        this.canDesignGUI = canDesignGUI;
    }

    public String[] getDesignSoftware() {
        return designSoftware;
    }

    public void setDesignSoftware(String[] designSoftware) {
        this.designSoftware = designSoftware;
    }

    public String generateDesignIdea() {
        return "How about a minimalist design with clean lines and bold colors?";
    }

    public String createUI(String software) {
        if (!canDesignUI) {
            return "I'm sorry, I cannot design user interfaces.";
        }

        if (!isValidDesignSoftware(software)) {
            return "I'm not proficient in " + software + ".";
        }

        return "I've created a UI design using " + software + ".";
    }

    public String createGUI(String software) {
        if (!canDesignGUI) {
            return "I'm sorry, I cannot design graphical user interfaces.";
        }

        if (!isValidDesignSoftware(software)) {
            return "I'm not proficient in " + software + ".";
        }

        return "I've created a GUI design using " + software + ".";
    }

    private boolean isValidDesignSoftware(String software) {
        for (String s : designSoftware) {
            if (s.equalsIgnoreCase(software)) {
                return true;
            }
        }
        return false;
    }
}
