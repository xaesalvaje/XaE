public class XaEResearchAndCorpusWriting {
    private String[] topics;
    private String[] resources;
    private String[] citations;

    public XaEResearchAndCorpusWriting(String[] topics, String[] resources, String[] citations) {
        this.topics = topics;
        this.resources = resources;
        this.citations = citations;
    }

    public String[] getTopics() {
        return topics;
    }

    public String[] getResources() {
        return resources;
    }

    public String[] getCitations() {
        return citations;
    }

    public void addTopic(String topic) {
        String[] newTopics = new String[topics.length + 1];
        for (int i = 0; i < topics.length; i++) {
            newTopics[i] = topics[i];
        }
        newTopics[topics.length] = topic;
        topics = newTopics;
    }

    public void addResource(String resource) {
        String[] newResources = new String[resources.length + 1];
        for (int i = 0; i < resources.length; i++) {
            newResources[i] = resources[i];
        }
        newResources[resources.length] = resource;
        resources = newResources;
    }

    public void addCitation(String citation) {
        String[] newCitations = new String[citations.length + 1];
        for (int i = 0; i < citations.length; i++) {
            newCitations[i] = citations[i];
        }
        newCitations[citations.length] = citation;
        citations = newCitations;
    }

    public String getRandomTopic() {
        int randomIndex = (int) (Math.random() * topics.length);
        return topics[randomIndex];
    }

    public String getRandomResource() {
        int randomIndex = (int) (Math.random() * resources.length);
        return resources[randomIndex];
    }

    public String getRandomCitation() {
        int randomIndex = (int) (Math.random() * citations.length);
        return citations[randomIndex];
    }
}
