package Study.Architecture.Seminars.Seminar_06.database;


import Study.Architecture.Seminars.Seminar_06.notes.infrastructure.persistance.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable = new NotesTable();

    public NotesTable getNotesTable() {
        return notesTable;
    }

}
