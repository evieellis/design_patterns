package singleton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
/*
 * The Game singleton class defines an anagram game which starts with an easy
 * anagram, and traverses through more difficult ones as the player's score
 * gets higher. Anagram difficulty is defined by the enumeration difficulty class.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Game {
/*
 * elements store:
 *  game - the singleton Game
 *  rand - the random seed the game operates under
 *  level - difficulty of the game at the moment
 *  anagrams - maps each anagram to a difficulty, store them in anagrams hashmap
 *  score - stores the amount of correct answers, subtracts for incorrect
 */
    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;
/*
 * Constructor creates a new game, private to only be called in getInstance().
 * It initializes the level to easy, creates a new randomizer, and populates
 * the hash map with read in anagrams based on their difficulty. Finally, it
 * initalizes the score to zero.
 */
    private Game() {
        rand = new Random();
        level = Difficulty.EASY;
        anagrams = new HashMap<>();
        for (Difficulty difficulty : Difficulty.values()) {
            ArrayList<Anagram> anagramList = FileReader.getAnagrams(difficulty);
            anagrams.put(difficulty, anagramList);
        }
        score = 0;
    }
/*
 * getInstance() creates a new game, but only if one does not alread exist
 */
    public static Game getInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }
/*
 * Question() updates the level based on the user's score. After it updates,
 * a temporary anagram list with only those of the specified difficulty is populated.
 * Then, a random index is of the anagramList is collected. Finally, the method
 * returns the current anagram.
 */
    public String getQuestion() {
        if (score < 4) {
            level = Difficulty.EASY;
        } else if (score < 8) {
            level = Difficulty.MEDIUM;
        } else {
            level = Difficulty.HARD;
        }
            ArrayList<Anagram> anagramList = anagrams.get(level);

            if (anagramList != null && !anagramList.isEmpty()) {
                int randomIndex = rand.nextInt(anagramList.size());
                currentAnagram = anagramList.get(randomIndex);
                return currentAnagram.getQuestion();
            }
            return "No anagrams found, please check file locations.";
    }
/*
 * isCorrect() checks the user answer to the current anagram. If they match
 * according to the anagram isCorrect() function, the score will increment.
 * Otherwise, the score will decrement.
 * 
 * @param userAnswer - the guess passed through by the user
 */
    public boolean isCorrect(String userAnswer) {
        if (currentAnagram != null) {
            if(currentAnagram.isCorrect(userAnswer)){
            score++;
            return true;
            }
        }
        if(score!=0){
        score--;
        }
        return false;
    }
/*
 * getScore() returns the user's current score
 */
    public int getScore() {
        return score;
    }
}
