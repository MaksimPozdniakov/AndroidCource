package Study.Architecture.Seminars.Seminar_06;

import Study.Architecture.Seminars.Seminar_06.database.NotesDatabase;
import Study.Architecture.Seminars.Seminar_06.notes.application.ConcreteNoteEditor;
import Study.Architecture.Seminars.Seminar_06.notes.domain.Note;
import Study.Architecture.Seminars.Seminar_06.notes.infrastructure.persistance.DatabaseContext;
import Study.Architecture.Seminars.Seminar_06.notes.presentation.queries.controllers.NotesController;
import Study.Architecture.Seminars.Seminar_06.notes.presentation.queries.views.NotesConsolePresenter;

import java.util.ArrayList;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        NotesController notesController =
                new NotesController(new ConcreteNoteEditor
                        (new NotesConsolePresenter(), new DatabaseContext(new NotesDatabase())));
        notesController.routeGetAll();

        // Добавляем запись
        notesController.routeAddNote(new Note(1,1,"ddd", "fff", new Date()));
        notesController.routeAddNote(new Note(2,2,"aaa", "fff", new Date()));
        notesController.routeAddNote(new Note(3,3,"sss", "fff", new Date()));
        notesController.routeAddNote(new Note(4,4,"ddd", "fff", new Date()));
        notesController.routeAddNote(new Note(5,5,"fff", "fff", new Date()));

        // Выводим все записи
        notesController.routeGetAll();
        System.out.println();

        // Удаляем записи
        ArrayList<Note> notes = new ArrayList<>(notesController.getCollection());
        notesController.routeRemoveNote(notes.get(0));

        // Выводим все записи
        notesController.routeGetAll();

    }

}
