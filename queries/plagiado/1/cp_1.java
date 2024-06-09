public class WordSize {

  public static int countCharacters(String word) {
    //  Calculates the number of characters in a word (similar functionality)
    return word.length();
  }

  public static void main(String[] args) {
    String alias = "Bard";
    int aliasSize = countCharacters(alias);
    System.out.println("Size of the alias: " + aliasSize);
  }
}
