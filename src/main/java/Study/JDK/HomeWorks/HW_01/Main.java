package Study.JDK.HomeWorks.HW_01;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        new Client(server,100, 100);
        new Client(server, 1200, 100);
    }
}
