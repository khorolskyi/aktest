package homework3;

public class CurrencyConvertor {
  private double comission;
  private double exchangeRate;

  public CurrencyConvertor(double comission, double exchangeRate) {
    this.comission = comission;
    this.exchangeRate = exchangeRate;
  }

  private double convertUsdToUah(double usd) {
    double sum = usd * exchangeRate;
    return sum;
  }

  private double calculateCommission(double sum) {
    double comissionAmount = sum * comission;
    return comissionAmount;
  }

  public double calculateTotalAmount(double usd) {
    double sum = convertUsdToUah(usd);
    double commissionAmount = calculateCommission(sum);
    double totalAmount = sum - commissionAmount;
    return totalAmount;
  }
}
