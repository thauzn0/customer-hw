 class Savings extends Cash {
   private double amount;
   
  public Savings(double interestRate) {
    super(interestRate);
  }

  public void deposit(double amount) {
    double balance = getBalance() + amount;
    setBalance(balance);
  }

  public boolean withdraw(double amount) {
    if (amount <= getBalance()) {
      setBalance(getBalance() - amount);
      return true;
    }
    return false;
  }
  public double getAmount() {
    return this.amount;
  }
   public void setAmount(double amount) {
    this.amount = amount;
  }
  
  @Override
  public String toString(){
    String str = new Boolean(withdraw(getAmount())).toString();
    return str;
  }

} 