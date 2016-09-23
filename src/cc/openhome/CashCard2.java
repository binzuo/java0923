package cc.openhome;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/23 0023.
 */
public class CashCard2 {
   private String number;
   private int balance;
   private int bonus;

    public CashCard2(String number, int balance, int bonus) {
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
    void charge(int money){
        if (money>0){
            if (money<=this.balance){
                this.balance-=money;

            }
            else {
                System.out.println("钱不够用啦");
            }
        }
        else {
            System.out.println("好吧");
        }

    }
    int exchange(int bonus){
        if (bonus>0){
            this.bonus-=bonus;
        }
        return this.bonus;

    }
    int getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CashCard2 card2=new CashCard2("A001",500,0);
        card2.store(scanner.nextInt());
    }

}
