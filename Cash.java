public class Cash {
  private double balance;
  private double interestRate;
  private double interestEarn;
  public double monthlyInterest;

  public Cash(double interestRate) {
    this.interestRate = interestRate;
  }

  public double getBalance() {
    return this.balance;
  }
  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getInterestRate() {
    return this.interestRate;
  }
  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }

  public double getInterestEarned() {
    return this.monthlyInterest;
  }

  public void transfer(double balance) {
    this.balance -= balance;
  }
  
  public void processDay() {
    if (balance > 0)
      this.monthlyInterest += (this.balance * this.interestRate) / 365;

  }

  public void processMonth() {
    this.balance += this.monthlyInterest;
    this.monthlyInterest = 0;
  }
}