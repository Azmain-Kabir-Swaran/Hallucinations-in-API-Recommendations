package org.example;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Main {

    public static void main(String[] args) {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_30);
        // The directory where the template file is.
        cfg.setClassForTemplateLoading(Main.class, "/");

        try {
            Template template = cfg.getTemplate("template.ftl");

            StringWriter out = new StringWriter();
            HashMap data = new HashMap();
            data.put("name", "John Doe");
            data.put("msg", "Hello World!");

            template.process(data, out);
            System.out.println(out);
        } catch (TemplateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}