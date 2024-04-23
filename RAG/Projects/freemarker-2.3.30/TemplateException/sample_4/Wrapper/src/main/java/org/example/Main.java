package org.example;


import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_30);
        
        try {
            cfg.setDirectoryForTemplateLoading(new File("/path/to/your/templates"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        
        StringWriter output = new StringWriter();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", "25");
        
        try {
            Template template = cfg.getTemplate("template.ftl");
            template.process(map, output);
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}