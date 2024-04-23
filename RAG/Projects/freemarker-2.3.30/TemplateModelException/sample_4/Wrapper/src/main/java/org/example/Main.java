package org.example;


import freemarker.ext.beans.StringModel;
import freemarker.ext.beans.BeansWrapper;
import freemarker.template.TemplateModelException;

public class Main {

    public static void main(String[] args) {
        try {
            // Create a BeansWrapper instance
            BeansWrapper wrapper = BeansWrapper.getDefaultInstance();
            
            // Create a StringModel
            StringModel stringModel = new StringModel("Hello World!", wrapper.getLocale());
            
            // Get template model from string model and catch TemplateModelException
            try {
                wrapper.getTemplateModel(stringModel);
            } catch (TemplateModelException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}