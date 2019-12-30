package ru.airux.code.analyzer.sources;

import java.util.List;

public class File {
    private String path;

    private String namespace;

    private List<File> dependencies;

    private List<String> classNames;

    public File(String path, String namespace, List<File> dependencies, List<String> classNames) {
        this.path = path;
        this.namespace = namespace;
        this.dependencies = dependencies;
        this.classNames = classNames;
    }

    public String getPath() {
        return path;
    }

    public String getNamespace() {
        return namespace;
    }

    public List<File> getDependencies() {
        return dependencies;
    }

    public List<String> getClassNames() {
        return classNames;
    }
}
