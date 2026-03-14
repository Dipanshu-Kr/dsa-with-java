public class EncapsulationDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        acc.username = "Dipanshu";
        acc.setPassword("12345678");

        System.out.println("Username: " + acc.username);
        System.out.println("Password: " + acc.getPassword());
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

    public String getPassword() {
        return password;
    }
}
