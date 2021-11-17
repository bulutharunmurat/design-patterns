package observer;

public class ObserverDemo {
    public static void main(String[] args) {

        Observer observer1 = new Subscriber();
        Blog blog = new Blog("Blog STATE");
        blog.registerObserver(observer1);


        blog.sendNotification();




    }
}
