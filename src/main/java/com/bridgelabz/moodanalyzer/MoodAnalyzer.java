package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    public static String analyseMood(String message) {
        if (message.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}

