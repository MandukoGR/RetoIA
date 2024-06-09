public class StringLength {

  public static int getStringLength(String str) {
    //  Returns the length of the string
    return str.length();
  }

  public static void main(String[] args) {
    String name = "Bard";
    int nameLength = getStringLength(name);
    System.out.println("Length of the name: " + nameLength);
  }
}