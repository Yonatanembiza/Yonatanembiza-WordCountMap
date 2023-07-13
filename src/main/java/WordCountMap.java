
import java.util.*;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        Map<String, Integer> numberOfStrings = new HashMap<>();
        String[] wordArray = words.split(" ");
        int len = wordArray.length;
        Integer wordCount = 1;
        for (int i=0;i<len; i++){
            for (int j=0; j<len; j++){
                if (wordArray[i].equals(wordArray[j]) && i !=j )
                     wordCount++;
            }
            numberOfStrings.put(wordArray[i], wordCount);
            wordCount = 1;
        }
        return numberOfStrings;
    }
}
