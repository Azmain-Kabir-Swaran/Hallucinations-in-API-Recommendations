package org.example;


import org.apache.maven.project.MavenProject;
import org.apache.maven.project.ProjectBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProjectBuilder projectBuilder = new ProjectBuilder();
        MavenProject project = projectBuilder.buildFromRepository(new File("/path/to/pom/file"), new ArrayList<>());
        System.out.println("Project name: " + project.getName());
    }
}