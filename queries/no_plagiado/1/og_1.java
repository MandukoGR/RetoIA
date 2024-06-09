// StringManipulation.java
public class StringManipulation {
  public static void main(String[] args) {
    String name = "Gemini";
    // Get the length of the string
    int nameLength = name.length();
    
    // Convert the string to uppercase
    String upperCaseName = name.toUpperCase();
    
    System.out.println("Original name: " + name);
    System.out.println("Length of the name: " + nameLength);
    System.out.println("Name in uppercase: " + upperCaseName);
  }
}