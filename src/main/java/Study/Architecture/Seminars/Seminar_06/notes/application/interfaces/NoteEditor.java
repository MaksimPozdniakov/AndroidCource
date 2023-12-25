package Study.Architecture.Seminars.Seminar_06.notes.application.interfaces;


import Study.Architecture.Seminars.Seminar_06.notes.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();

}
