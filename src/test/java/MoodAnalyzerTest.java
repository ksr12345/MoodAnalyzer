import org.example.MoodAnalyzer;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyzerTest {

    @Test
    public void testMoodAnalysis() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("This is a sad message");
        Assert.assertEquals(mood, "Sad");
    }

    @Test
    public void result2() {
        MoodAnalyzer mood1 = new MoodAnalyzer();
        String result = mood1.analyzeMood("I am in happy mood");
        Assert.assertEquals(result, "Happy");
    }
}
