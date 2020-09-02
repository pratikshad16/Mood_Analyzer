package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSadMood_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am inSad Mood");
        String mood = moodAnalyzer.analyzeMood();
        try {
            mood = moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_whenAnyMood_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyzeMood();
        try {
            mood = moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Happy", mood);
    }

    @Test
    public void givenNullMood_shouldThrowMoodAnalysisException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
                moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenEmptyMood_ShouldThrowMoodAnalysisException() {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            try
            {
                moodAnalyzer.analyzeMood();
            } catch (MoodAnalysisException e)
            {
                Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
                System.out.println(e.getMessage());
            }
    }
}

