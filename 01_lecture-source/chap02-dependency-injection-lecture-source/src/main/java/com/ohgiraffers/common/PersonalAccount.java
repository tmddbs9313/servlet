package com.ohgiraffers.common;

public class PersonalAccount implements Account{

    private final int backCode; //dmsgod
    private final String accNo; //계좌번호

    private int balance;  //잔액

    public personalAccount(int bankCode, String accNo) {
        this.bankCode = bankCode;
        this.accNo =accNo;
    }
    @Override
    public String getBalance() {
        return null;
    }

    @Override
    public String deposit(int money) {
        return null;
    }

}
