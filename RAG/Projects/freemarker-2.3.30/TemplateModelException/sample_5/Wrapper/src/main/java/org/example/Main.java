package org.example;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_30);
        
        cfg.setDirectoryForTemplateLoading(new File("src/main/resources"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        try {
            Template template = cfg.getTemplate("template.ftl");
            Map<String, String> map = new HashMap<>();
            map.put("key", "value");
            Writer output = Files.newBufferedWriter(Paths.get("output.txt"));

            template.process(map, output);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }
}