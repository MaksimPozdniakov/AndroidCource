package Study.Architecture.Seminars.Seminar_06.notes.presentation.queries.controllers;


import Study.Architecture.Seminars.Seminar_06.notes.application.interfaces.NoteEditor;
import Study.Architecture.Seminars.Seminar_06.notes.domain.Note;

import java.util.Collection;

public class NotesController extends Controller {


    private final NoteEditor notesEditor;

    public NotesController(NoteEditor notesEditor){
        this.notesEditor = notesEditor;
    }

    public void routeAddNote(Note note) {
        this.notesEditor.add(note);
    }

    public void routeRemoveNote(Note note) {
        this.notesEditor.remove(note);
    }

    public void routeGetAll(){
        notesEditor.printAll();
    }

    public Collection<Note> getCollection() {
        return notesEditor.getAll();
    }

}
