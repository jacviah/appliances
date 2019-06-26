package by.tc.task01.dao.readers;

import by.tc.task01.dao.exceptions.DAOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceFileReader {

    public static final String path = "resources/appliances_db.txt";
    String applianceDelims = " : ";
    int parts = 2;
    int typeIndex = 0;
    int paramsIndex = 1;

    public List<String> read(String ApplianceType) throws DAOException {

        List<String> result = new ArrayList<>();
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            String[] tokens;

            while ((line = br.readLine()) != null) {

                if (line.isEmpty()) {
                    continue;
                }

                tokens = line.split(applianceDelims, parts);
                String type = tokens[typeIndex];
                if (ApplianceType.equals(type)) {
                    result.add(tokens[paramsIndex]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new DAOException("File not found", e);
        } catch (IOException e) {
            throw new DAOException("IO problems", e);
        }
        return result;
    }

}
