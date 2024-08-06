package org.example;

public class MoodAnalyzer {
    public String analyzeMood(String message){
        message = message.toLowerCase();
        if (message.contains("sad")){
            return "Sad";
        } else{
            return "Happy";
        }
    }
}
