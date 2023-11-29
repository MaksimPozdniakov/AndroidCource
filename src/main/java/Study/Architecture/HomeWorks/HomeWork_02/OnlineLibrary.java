package Study.Architecture.HomeWorks.HomeWork_02;

public class OnlineLibrary {
    public static void main(String[] args) {
        ReaderNewVersion adapter = new Adapter();
        adapter.open();
        adapter.read();
        adapter.putTheBookAside();
        adapter.close();
    }
}
