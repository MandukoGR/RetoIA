// CurrencyConverter.java
public class CurrencyConverter {
  public static void main(String[] args) {
    double usdAmount = 100.0;
    double exchangeRate = 1.20;  // Example exchange rate (USD to EUR)
    
    // Convert USD to EUR
    double eurAmount = usdAmount * exchangeRate;
    
    System.out.println(usdAmount + " USD is equivalent to " + eurAmount + " EUR.");
  }
}