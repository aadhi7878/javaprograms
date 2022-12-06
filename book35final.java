import java.util.*;
import java.io.*;
import java.nio.file.Paths;
public class book35final{

public static HashMap<String, Integer> countWords(String directory, int nFiles) {
// Declare the HashMap
HashMap<String, Integer> wordCount = new HashMap();

// this large 'for' loop will go through each file in the specified directory.
for (int k = 1; k < nFiles; k++) {
  // Puts together the string that the FileReader will refer to.
  String learn = directory + k + ".txt";

try {
  FileReader reader = new FileReader(learn);
  BufferedReader br = new BufferedReader(reader);
  // The BufferedReader reads the lines

  String line = br.readLine();


  // Split the line into a String array to loop through
  String[] words = line.split(" ");
  int freq = 0;

  // for loop goes through every word
  for (int i = 0; i < words.length; i++) {
    // Case if the HashMap already contains the key.
    // If so, just increments the value

    if (wordCount.containsKey(words[i])) {         
      wordCount.put(words[i], freq++);
    }
    // Otherwise, puts the word into the HashMap
    else {
      wordCount.put(words[i], freq++);
    }
  }
  // Catching the file not found error
  // and any other errors
}
catch (FileNotFoundException fnfe) {
  System.err.println("File not found.");
}
catch (Exception e) {
  System.err.print(e);
   }
 }
return wordCount;
}
        public static void main(String[] args) {
        System.out.println(FreequencyOfCount("C:\\Users\\adity\\OneDrive\\Documents\\abhijith.txt"));
    }
}