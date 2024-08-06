package org.example;

public class MoodAnalyzer {

    String message;
    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood(){
        try {
            message = message.toLowerCase();
            if (message.contains("sad")) {
                return "Sad";
            } else if (message.contains("happy")) {
                return "Happy";
            } else {
                return "";
            }
        } catch (NullPointerException e){
            return "Happy";
        }
    }
}
