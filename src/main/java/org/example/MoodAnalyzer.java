package org.example;

public class MoodAnalyzer {

    String message;

    enum Mood{
        Happy, Sad
    }

    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood(){
        String result = "";
        try {
            message = message.toLowerCase();
            if(message.equals("")) {
                throw new MoodAnalyzerException("Empty Mood");
            }

            if(message.contains("sad")) {
                result= "Sad";
            }
            else if(message.contains("happy")) {
                result = "Happy";
            }
            else {
                result= "";
            }
        }
        catch(MoodAnalyzerException e) {
            result = e.getMessage();
        }

        catch(NullPointerException f) {
            result = "Null";
        }

        return result;
    }
}
