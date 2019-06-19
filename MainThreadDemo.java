package thread;

public class MainThreadDemo {
    public static void main(String[] args) {
        //设置和更改主线程的名字
        Thread main = Thread.currentThread();
        //输出主线程名
        System.out.println("主线程名：" + main.getName());
        main.setName("牛哥");
        System.out.println("主线程名：" + main.getName());
    }

}
