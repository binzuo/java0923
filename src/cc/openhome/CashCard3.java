package cc.openhome;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/23 0023.
 */
public class CashCard3 {
    String number;
    int balance;
    int bonus;

    public CashCard3(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
    void store(int money){
        if (money>0){
            this.balance+=money;
            if (money>=1000){
                this.bonus++;

            }
        }
        else {
            System.out.println("你是猴子派来的逗必嘛");
        }
    }
    public static void main(String[] args) {
        CashCard3[] cards={
            new CashCard3("A0001",500,0),
            new CashCard3("A0002",300,0),
            new CashCard3("A0003",1000,1),
        };
        Scanner scanner=new Scanner(System.in);
        for (CashCard3 card:cards){
            System.out.printf("为（%s,%d,%d）储值:",card.number,card.balance,card.bonus);
            card.store(scanner.nextInt());
            System.out.printf("明细（%s,%d,%d）%n:",card.number,card.balance,card.bonus);
        }
    }
}