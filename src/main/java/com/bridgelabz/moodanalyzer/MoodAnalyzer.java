package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
     String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public  String analyzeMood() {
        if (message.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}

