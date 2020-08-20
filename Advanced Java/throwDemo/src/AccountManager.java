import java.io.IOException;

public class AccountManager {
  private double balance;

  public void deposit(double amount) {
    balance = getBalance() + amount;
  }

  public void withdrow(double amount) throws BalanceInsufficentException {
    if (balance >= amount) {
      balance = getBalance() - amount;
    } else {
      throw new BalanceInsufficentException("Hesaptan Para Çekilemedi... Bakiye yetersiz");
    }
  }

  public double getBalance() {
    return balance;
  }
}
