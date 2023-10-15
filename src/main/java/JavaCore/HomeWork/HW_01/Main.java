package JavaCore.HomeWork.HW_01;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Note note1 = new Note("jjjjjjjjjj");
        Note note2 = new Note("jjjjjjjjjj");
        Note note3 = new Note("jjjjjjjjjj");
        Note note4 = new Note("jjjjjjjjjj");

        model.addNote(note1);
        model.addNote(note2);
        model.addNote(note3);
        model.addNote(note4);

        model.print();

        model.writeToFile();
    }
}
