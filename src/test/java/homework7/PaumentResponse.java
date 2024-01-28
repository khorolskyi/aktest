package homework7;

public class PaumentResponse {
  private String orderId;
  private int amount;
  private String currency;
  private String email;
  private String status;

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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaumentResponse(String orderId, int amount, String currency, String email, String status) {
    this.orderId = orderId;
    this.amount = amount;
    this.currency = currency;
    this.email = email;
    this.status = status;
  }
}
