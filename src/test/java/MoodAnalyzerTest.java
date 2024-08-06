import org.example.MoodAnalyzer;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyzerTest {

    @Test
    public void testMoodAnalysis() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals(mood, "Sad");
    }

    @Test
    public void result2() {
        MoodAnalyzer mood1 = new MoodAnalyzer("I am in happy mood");
        String result = mood1.analyzeMood();
        Assert.assertEquals(result, "Happy");
    }

    @Test
    public void result3() {
        MoodAnalyzer mood1 = new MoodAnalyzer(null);
        String result = mood1.analyzeMood();
        Assert.assertEquals(result, "Null");
    }

    @Test
    public void result4() {
        MoodAnalyzer mood3 = new MoodAnalyzer("");
        String result = mood3.analyzeMood();
        Assert.assertEquals(result, "Empty Mood");
    }
}
