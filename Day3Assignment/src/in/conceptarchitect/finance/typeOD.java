package in.conceptarchitect.finance;

public class typeOD {


private byte acctType; 
private String getAcctType() {
    String ret = "";

    switch(acctType){
    case 1: ret = "Current"; break;
    case 2: ret =  "Savings"; break;
    case 3: ret="overdraft"; break;
    }

    return ret;
}
public BankAccounts(byte type){
        this();    // use default constructor

        acctType = type;        // set account type

        switch (type){
        case 1:    minBalance = 0; withdrawlLimit=balance-minBalance;creditRate=0;TransactionsperMonth=30; break;
        case 2:   minBalance = 5000; withdrawlLimit=balance-minBalance;creditRate=normal;TransactionsperMonth=no_limit; break;
        case 3:   minBalance = 5000; withdrawlLimit=balance+oDlimit;creditRate=normal;TransactionsperMonth=20; break;

        }

    }
oDlimit=(maxbalance)/10;
if(balance<withdrawl && oDlimit<withdrawl){
withdraw(outdraft);
balance=balance-oDlimit-1%;
}