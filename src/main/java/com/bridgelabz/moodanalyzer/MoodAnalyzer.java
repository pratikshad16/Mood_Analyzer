package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalysisException {
        try
        {
            if(message.length() == 0)
            {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"please enter valid message");
            }
            if (message.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"please enter valid message");
        }
    }
}