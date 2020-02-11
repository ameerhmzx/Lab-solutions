class BankAccount{
  private String title;
  private Integer balance;

  public BankAccount(String title){
    this.title = title;
    this.balance = 500;
  }

  public BankAccount(String title, Integer balance){
    this.title = title;
    this.balance = balance;
  }

  public void printBalance(){
    System.out.println(balance);
  }

  public void deposit(int amount){
    balance += amount;
    System.out.printf("Deposited %d in %s's account\n", balance, title);
  }

  public void withdraw(int amount){
    balance -= amount;
    System.out.printf("Withdrawn %d in %s's account\n", balance, title);
  }
