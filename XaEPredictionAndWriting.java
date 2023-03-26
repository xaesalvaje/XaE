import java.util.Random;

public class XaEPredictionAndWriting {
    private Random random;

    public XaEPredictionAndWriting() {
        random = new Random();
    }

    public String generatePrediction() {
        String[] predictions = {
            "I see a bright future ahead for you. Keep working hard!",
            "You will meet someone special soon. Keep an open mind!",
            "Your hard work will pay off soon. Stay focused!",
            "A big opportunity is coming your way. Be prepared!",
            "Don't be afraid to take risks. They often lead to success.",
            "You will overcome the challenges ahead. Have faith!",
            "Keep your mind open to new possibilities. They may surprise you!",
            "You have a lot of potential. Believe in yourself!",
            "Your creativity will lead to great things. Keep pushing!",
            "Success is just around the corner. Keep going!"
        };

        int index = random.nextInt(predictions.length);
        return predictions[index];
    }

    public String generateNovel() {
        String[] novels = {
            "The Shadow of the Night",
            "Echoes in the Wind",
            "The Secret Garden",
            "The Forbidden Forest",
            "Whispers in the Dark",
            "The Hidden Chamber",
            "The Enchanted Kingdom",
            "The Mystic River",
            "The Lost City",
            "The Shrouded Castle"
        };

        int index = random.nextInt(novels.length);
        return novels[index];
    }

    public String generateCreativeWriting() {
        String[] writings = {
            "The sun set behind the mountains, casting a golden glow over the fields.",
            "The wind whispered through the trees, carrying with it the scent of blooming flowers.",
            "The city streets were alive with the sound of music and laughter.",
            "The waves crashed against the shore, their rhythm soothing and hypnotic.",
            "The stars twinkled in the clear night sky, painting a picture of infinite possibility.",
            "The fire crackled in the fireplace, casting a warm glow over the room.",
            "The rain pattered against the windowpane, a soothing lullaby for the soul.",
            "The snowflakes danced in the air, creating a magical wonderland.",
            "The birds sang sweetly in the trees, their melodies filling the air with joy.",
            "The silence of the night was broken only by the sound of a distant owl."
        };

        int index = random.nextInt(writings.length);
        return writings[index];
    }

    public String generateThesis() {
        String[] theses = {
            "The impact of social media on mental health",
            "The role of artificial intelligence in modern society",
            "The benefits and drawbacks of renewable energy sources",
            "The effects of climate change on global food security",
            "The relationship between exercise and cognitive function",
            "The impact of the gig economy on labor markets",
            "The role of education in promoting social mobility",
            "The influence of culture on consumer behavior",
            "The ethical implications of genetic engineering",
            "The effects of poverty on child development"
        };

        int index = random.nextInt(theses.length);
        return theses[index];
    }
}
