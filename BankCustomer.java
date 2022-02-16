package BankAccount;

import java.util.Scanner;

public class BankCustomer {

    private int userId;
    private String userName;
    private int balance;


    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getBalance() {
        return balance;
    }

    public String getBalanceWithCurrency() {
        return balance + " TL";
    }

    private void setUserId(int userId) {
        this.userId = userId;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private void setBalance(int balance) {
        this.balance = balance;

        System.out.println("Hesabınızdaki para  " + getBalance() + " TL oldu. ");
    }

    BankCustomer(int userId, String userName, int balance) {
        this.userId = userId;
        this.userName = userName;
        this.balance = balance;
    }

    public void userInformation(){
        System.out.println("User Name : " + userName + " -- User Id : " + userId + " -- Balance : " + balance);
    }

    public void ınvestment(){
        Scanner money = new Scanner(System.in);
        System.out.println(userName + " -- Yatırmak istediğiniz miktarı giriniz.");
        int depositedMoney = money.nextInt();
        System.out.println("Hesabınıza " + depositedMoney + " TL yatırdınız. ");
        setBalance(getBalance() + depositedMoney);
        userInformation();
    }


}

