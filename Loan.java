class Loan extends Cash {
  double loanLimit;
  double overdraftPenalty;

  public Loan(double interestRate, double loanLimit, double overdraftPenalty) {
    super(interestRate);
    this.loanLimit = loanLimit;
    this.overdraftPenalty = overdraftPenalty;
  }

  public double getLoanLimit() {
    return this.loanLimit;
  }

  public void setLoanLimit(double loanLimit) {
    this.loanLimit = loanLimit;
  }

  public double getOverdraftPenalty() {
    return this.overdraftPenalty;
  }

  public void setOverdraftPenalty(double overdraftPenalty) {
    this.overdraftPenalty = overdraftPenalty;
  }

  public void processDay() {
    if (getBalance() > getLoanLimit())
      System.out.println("the loan is overdrafted for this month.");
  }

  public void processMonth() {

    if (getLoanLimit() > getBalance()) {
      setBalance(this.getBalance()-this.overdraftPenalty);
      monthlyInterest = 0;
    }
    System.out.println("the loan is overdrafted for this month.");

  }
  @Override
  public String toString(){
    return  Double.toString(getLoanLimit());
  }
} 