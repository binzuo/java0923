package exercise;

/**
 * Created by Administrator on 2016/9/23 0023.
 */
public class Exercise {
    private int balance;
    public Exercise(int x){
        this.x=x;
        //System.out.println(x);
    }

    public static void main(String[] args) {
        Exercise exercise=new Exercise(10);
        //System.out.println(exercise.x);

        System.out.println(exercise.balance);
    }

}
