package Study.Architecture.HomeWorks.HomeWork_02;

// настраиваем адаптер через наследование
public class Adapter extends ReaderOldVersion implements ReaderNewVersion{
    @Override
    public void open() {
        openBook();
    }

    @Override
    public void read() {
        readBook();
    }

    @Override
    public void putTheBookAside() {
        // настраиваем логику для недостающего функционала
        System.out.println("Откладываем книгу....");
    }

    @Override
    public void close() {
        closeBook();
    }
}
