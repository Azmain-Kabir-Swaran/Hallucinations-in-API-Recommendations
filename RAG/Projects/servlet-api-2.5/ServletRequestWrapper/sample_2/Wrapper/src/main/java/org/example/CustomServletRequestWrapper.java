package org.example;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import java.util.Map;
import java.util.HashMap;

class CustomServletRequestWrapper extends ServletRequestWrapper {

    private Map<String, String[]> parameterMap = new HashMap<>();

    public CustomServletRequestWrapper(ServletRequest request) {
        super(request);
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        return parameterMap;
    }

    @Override
    public String getParameter(String name) {
        String[] params = getParameterValues(name);
        if (params != null && params.length > 0)
            return params[0];
        else
            return null;
    }

    @Override
    public String[] getParameterValues(String name) {
        // get values from super class if not exist in our parameter map
        return super.getParameterValues(name);
    }

    // Add setter for modify parameter map values
    public void setParameter(String name, String value) {
        this.parameterMap.put(name, new String[]{value});
    }
}