package ru.airux.code.analyzer.diagram;

import ru.airux.code.analyzer.sources.File;

import java.util.List;

public class Node {
    private List<Method> methods;

    private List<Property> properties;

    private List<Relation> relations;

    private File file;
}
