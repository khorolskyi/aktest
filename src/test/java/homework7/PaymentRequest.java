package homework7;

public class PaymentRequest implements Comparable <PaymentRequest> {
  private String orderId;
  private int amount;
  private String currency;
  private String email;

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PaymentRequest(String orderId, int amount, String currency, String email) {
    this.orderId = orderId;
    this.amount = amount;
    this.currency = currency;
    this.email = email;
  }

  @Override
  public int compareTo(PaymentRequest paymentRequest) {
    return Integer.compare(this.amount, paymentRequest.amount);
  }
  @Override
  public String toString(){
    return "OredrId is: " +  this.orderId + " Email is: " + this.email + " Amount is: " + this.amount;
  }
}
