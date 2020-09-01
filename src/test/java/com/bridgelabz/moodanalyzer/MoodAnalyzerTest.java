package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {


    @Test
    public void givenMessage_WhenSadMood_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am inSad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_whenAnyMood_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy", mood);
    }

    @Test
    public void givenNullMood_shouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy", mood);
    }
}
