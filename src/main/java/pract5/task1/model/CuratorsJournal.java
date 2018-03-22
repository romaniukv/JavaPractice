package pract5.task1.model;

import java.util.ArrayList;
import java.util.List;

public class CuratorsJournal {

    private List<Record> records = new ArrayList<>();

    public void addRecord(Record record) {
        records.add(record);
    }

    public void showRecords() {
        for (Record record: records)
            System.out.println(record);
    }

}
