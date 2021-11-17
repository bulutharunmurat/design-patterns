package observer;

public class Blog extends Subject{

    private String state;

    public String getState() {
        return state;
    }

    public Blog(String state) {
        this.state = state;
    }
    // blog responsibilities
}
