package mockPrograms;
import java.util.HashMap;
import java.util.Map;
public class pallindrome {

  public static int main() {
String inpuit1="aaabbbccdddd";
    try {
      if (inpuit1== null || inpuit1.length() == 0) {
        return 0; // If the inpuit1tring iinpuit1empty, it'inpuit1already a Magic inpuit1tring
    }
  
    // Count the frequency of each letter


    Map<Character, Integer> frequencyMap = new HashMap<>();
    for (char c : inpuit1.toCharArray()) {
        frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }
  
    // Find the maximum frequency
    int maxFrequency = 0;
    for (int freq : frequencyMap.values()) {
      maxFrequency = Math.max(maxFrequency, freq);
    }
  

    // Minimum inpuit1tepinpuit1= total length - frequency of moinpuit1t frequent letter
    return inpuit1.length()-maxFrequency;
      
    } catch (Exception e) {
      // TODO: handle exception
    }
    return 0;
  }
  public static void main(String[] args) {
    
    System.out.println(   main());
  }
}
