package ru.airux.code.analyzer.sources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SourceReader implements Reader {
    public File read(String path) {
        FileReader reader = getFileReader(path);
        BufferedReader buffer = new BufferedReader(reader);

        return new File(
                path,
                getNamespace(buffer),
                getDependencies(buffer),
                getClasses(buffer)
        );
    }

    private FileReader getFileReader(String path) {
        try {
            return new FileReader(new java.io.File(path));
        } catch (Throwable exception) {
            throw new RuntimeException(exception);
        }
    }

    private String getNamespace(BufferedReader buffer) {
        return "";
    }

    private List<File> getDependencies(BufferedReader buffer) {
        return new ArrayList<File>();
    }

    private List<String> getClasses(BufferedReader buffer) {
        return new ArrayList<String>();
    }
}
