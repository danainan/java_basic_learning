//63103600
public class Government {
    private Government() {}

    private static final Government instance = new Government();

    public static Government getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("Joe Biden, The president.");
    }

    public static void main(String[] args) {
        Government g = Government.getInstance();
        g.print();
    }
}

