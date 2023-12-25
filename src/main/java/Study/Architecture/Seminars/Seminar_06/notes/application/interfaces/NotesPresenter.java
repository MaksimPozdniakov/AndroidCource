package Study.Architecture.Seminars.Seminar_06.notes.application.interfaces;

import Study.Architecture.Seminars.Seminar_06.notes.domain.Note;

import java.util.Collection;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);

}
