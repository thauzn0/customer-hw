//The Date class will represent a date. 
class Date {
  private int day;
  private int month;
  private int year;

//The Date class will represent a date.
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
    incrementDay();
  }
  
/* takes no input and returns an int that is the day of the date. The day should be a value
between 1 and 31.*/
  public int getDay() {
    if (this.day >= 1 && this.day <= 31)
      return this.day;
    return -1;
  }

//takes no input and returns an int that is the month of the date. The month should be between 1 and 12.
  public int getMonth() {
    if (this.month >= 1 && this.month <= 12)
      return this.month;
    return -1;
  }

//takes no input and returns an int that is the year of the date
  public int getYear() {
    return this.year;
  }
/*
The method adds 1 to the day of the date. 
If the day exceeds the number of days for the month (assume no leap years), 
the day is set to 1 and the month is incremented. If the month exceeds 12,
the month is set to 1 and the year is incremented. */
  public void incrementDay() {
    if (this.day > 31) {
      this.day = 1;
      this.month++;
      if (this.month > 12) {
        this.month = 1;
        this.year++;
      }
    }
  }

  @Override
  public String toString() {
    if (this.month < 10 && this.month < 10)
      return String.format("0%s/0%s/%s", this.day, this.month, this.year);
    if (this.day < 10)
      return String.format("0%s/%s/%s", this.day, this.month, this.year);
    if (this.month < 10)
      return String.format("%s/0%s/%s", this.day, this.month, this.year);
    return String.format("%s/%s/%s", this.day, this.month, this.year);
  }

  @Override
  public boolean equals(Object obj) {
    if (this.day == this.month)
      return true;
    return false;
  }

}
 