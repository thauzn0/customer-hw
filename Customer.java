class Customer {
  private String firstName;
  private String lastName;
  private final Savings savings;
  private final Loan loan;
  private Date date;

  public Customer(String firstName, String lastName, Savings savings, Loan loan, Date date) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.savings = savings;
    this.loan = loan;
    this.date = date;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Savings getSavings() {
    return savings;
  }

  public Loan getLoan() {
    return loan;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
}

  public double currentValue() {
    return loan.getBalance() - savings.getBalance();
  }

  public void deposit(double deposit) {
    savings.setBalance(savings.getBalance() + deposit) ;
  }

  public void payLoan(double amount) {
    loan.setBalance(loan.getBalance() - amount);
  }

  public boolean withdraw(double amount) {

    if (amount <= savings.getBalance()) {
      savings.setBalance(savings.getBalance() - amount);
      return true;
    }
    return false;
  }

  public void incrementDate() {

    int month = date.getMonth();

    if (savings.getBalance() < 0) {
      loan.setBalance(savings.getBalance());
      savings.setBalance(0);
    }
    savings.processDay();
    loan.processDay();

    if (month != date.getMonth()) {
      savings.processMonth();
      loan.processMonth();
    }
  }
} 