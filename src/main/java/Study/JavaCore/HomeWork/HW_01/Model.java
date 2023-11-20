package Study.JavaCore.HomeWork.HW_01;

import java.util.ArrayList;

public class Model {
    private WriteClass writeClass = new WriteClass("src/JavaCore/HomeWork/HW_01/file.txt");
    private final ArrayList<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public void print() {
        for (Note note: notes) {
            System.out.println(note);
        }
    }

    public void writeToFile() {
        ArrayList<String> stringNotes = new ArrayList<>();
        for (Note note: notes) {
            stringNotes.add(note.toString());
        }
        writeClass.write(stringNotes);
    }
}
