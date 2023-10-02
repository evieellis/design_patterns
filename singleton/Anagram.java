package singleton;
import java.util.ArrayList;
/*
 * The Anagram class defines an anagram containing a wuestion and
 * a string of possible answers. Methods will check if the anagram
 * is correct and return the anagram in question.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Anagram {
/*
 * elements store:
 *  question - the anagram in question
 *  answers - an array list of possible correct answers to the anagram
 */
    private String question;
    private ArrayList<String> answers;
/*
 * Constructor sets the question parameter to the anagram in question
 * and the array list of answers to the answers element.
 * 
 * @param question - string that will become anagram in question
 * @param answers - array list of strings that will become the contents
 * of the answers array
 */
    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }
/*
 * getQuestion() returns the anagram in question
 */
    public String getQuestion() {
        return question;
    }
/*
* isCorrect checks if the user's answer (ignoring case) matches any of 
* the correct answers in the array list of answers. Loops through all answers,
* returns false if not found.
*
* @param userAnswer - string user inputs to be compared to array list
*/    
    public boolean isCorrect(String userAnswer) {
        for (String correctAnswer : answers) {
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                return true;
            }
        }
        return false;
    }  
}
