package Study.Architecture.Seminars.Seminar_06.database;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


public class NotesTable {

    private Random random = new Random();
    private Collection<NotesRecord> records = new ArrayList<>();

    public Collection<NotesRecord> getRecords() {
        return records;
    }



//    public Collection<NotesRecord> getRecords() {
//        // автогенерация записей
//        prepareRecords();
//        return records;
//    }

//    private void prepareRecords(){
//        if (records == null)
//        {
//            records = new ArrayList<>();
//            int recordsCount =  5  + random.nextInt(10);
//            for (int i = 0; i < recordsCount; i++){
//                records.add(new NotesRecord("title #" + i, "details #" + i));
//            }
//        }
//    }

}
