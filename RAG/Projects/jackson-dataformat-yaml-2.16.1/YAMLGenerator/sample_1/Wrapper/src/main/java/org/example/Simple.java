package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import java.io.File;
import java.io.IOException;

class Simple {
    private String a;
    private String b;

    public Simple(String a, String b) {
        this.a = a;
        this.b = b;
    }
}