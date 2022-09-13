class Bank {
    long[] balance;

    boolean check(int a) {
        return a > 0 && a <= balance.length;
    }

    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
//        看账户是否符合规则，一次转账，看做是取款和存款，对账户一进行取款
        if (check(account2) && withdraw(account1, money)) {
//            再对账户二存款
            return deposit(account2, money);
        }

        return false;
    }

    public boolean deposit(int account, long money) {
//        检查账户
        if (!check(account)) {
            return false;
        }
//        减去账户里的钱
        balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
//        检查账户是否合法和钱是否够
        if (!check(account) || balance[account - 1] < money) {
            return false;
        }
        balance[account - 1] -= money;
        return true;
    }
}
