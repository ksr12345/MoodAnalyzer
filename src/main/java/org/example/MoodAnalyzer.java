package org.example;

public class MoodAnalyzer {

    String message;
    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood(){
        message = message.toLowerCase();
        if (message.contains("sad")){
            return "Sad";
        } else{
            return "Happy";
        }
    }
}
