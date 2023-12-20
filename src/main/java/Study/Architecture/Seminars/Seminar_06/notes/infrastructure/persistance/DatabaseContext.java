package Study.Architecture.Seminars.Seminar_06.notes.infrastructure.persistance;

import Study.Architecture.Seminars.Seminar_06.database.NotesDatabase;
import Study.Architecture.Seminars.Seminar_06.database.NotesRecord;
import Study.Architecture.Seminars.Seminar_06.notes.application.interfaces.NotesDatabaseContext;
import Study.Architecture.Seminars.Seminar_06.notes.domain.Note;
import Study.Architecture.Seminars.Seminar_06.notes.infrastructure.persistance.configuration.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DbContext implements NotesDatabaseContext {


    public DatabaseContext(Database database) {
        super(database);
    }

    Collection<Note> notesList = new ArrayList<>();

    public Collection<Note> getAll() {
        //TODO: Этого кастинга быть не должно, тут должен работать внутренний механизм фреймворка
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){

            notesList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()

            ));
        }
        return notesList;
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }
}
