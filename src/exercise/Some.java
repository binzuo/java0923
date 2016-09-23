package exercise;

/**
 * Created by Administrator on 2016/9/23 0023.
 */
public class Some{
    void someMethod(int i){
        System.out.println("int 版本被调用");
    }
    void someMethod(Integer integer){
        System.out.println("Integer 版本被调用");
    }

    public static void main(String[] args) {
        Some s=new Some();
        s.someMethod(new Integer(1));
    }
}
