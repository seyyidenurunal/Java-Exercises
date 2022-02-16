package BankAccount;

public class Bank {
    public static void main(String[] args) {

        BankCustomer ayseSahin = new BankCustomer(458, "Ayşe Şahin", 4000);
        BankCustomer mehmetSahin = new BankCustomer(500, "Mehmet Şahin", 5000);

        mehmetSahin.userInformation();
        ayseSahin.userInformation();

        mehmetSahin.ınvestment();

        ayseSahin.ınvestment();

    }
}
