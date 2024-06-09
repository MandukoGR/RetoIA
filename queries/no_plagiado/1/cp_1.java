
// FileReaderDemo.java
public class FileReaderDemo {
  public static void main(String[] args) throws Exception {
    // Specify the file path
    String filePath = "C:/Users/example/data.txt";
    
    // Create a FileReader object
    FileReader reader = new FileReader(filePath);
    
    // Read characters from the file
    StringBuilder content = new StringBuilder();
    int character;
    while ((character = reader.read()) != -1) {
      content.append((char) character);
    }
    
    reader.close();  // Important to close the resource
    
    System.out.println("File content: \n" + content.toString());
  }
}