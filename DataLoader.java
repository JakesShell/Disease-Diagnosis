package com.healthcare;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public List<MedicalRecord> loadData(String filePath) throws Exception {
        List<MedicalRecord> records = new ArrayList<>();
        Reader in = new FileReader(filePath);
        Iterable<CSVRecord> csvRecords = CSVFormat.DEFAULT.withHeader().parse(in);
        
        for (CSVRecord record : csvRecords) {
            MedicalRecord medicalRecord = new MedicalRecord(
                Double.parseDouble(record.get("feature1")),
                Double.parseDouble(record.get("feature2")),
                // Add more features as per your dataset
                record.get("diagnosis")
            );
            records.add(medicalRecord);
        }
        return records;
    }
}
