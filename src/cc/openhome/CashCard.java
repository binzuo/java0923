package cc.openhome;

import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2016/9/23 0023.
 */
public class CashCard {
    String number;
    int balance;
    int bonus;

    public CashCard(String number, int balance, int bonhus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CashCard card1=new CashCard("A001",500,0);
        int money=scanner.nextInt();
        if (money>0){
            card1.balance+=money;
            System.out.println(card1.balance);
            if (money>=1000){
                card1.bonus++;
                System.out.println(card1.bonus);
            }
        }
        else {
            System.out.println("你是猴子派来的逗比嘛");
        }
    }
}
