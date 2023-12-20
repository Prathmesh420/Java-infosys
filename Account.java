class Account{
    private double balance = 500;
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        Account acc = new Account();
        double value = acc.getBalance();
        System.out.println(value);
    }
}