package org.example;

import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;

public class Main extends HttpServletResponseWrapper {
   
   public Main(HttpServletResponse response) {
       super(response);
   }

   public void sendError(int sc) throws IOException {
       getResponse().sendError(sc);
   }

   public void sendError(int sc, String msg) throws IOException {
       getResponse().sendError(sc, msg);
  
   public void flushBuffer() throws IOException {
       getResponse().flushBuffer();
   }

   public int getBufferSize() {
       return getResponse().getBufferSize();
   }

   public String getCharacterEncoding() {
       return getResponse().getCharacterEncoding();
   }

   public String getContentType() {
       return getResponse().getContentType();
   }

   public ServletOutputStream getOutputStream() throws IOException {
       return getResponse().getOutputStream();
   }

   public PrintWriter getWriter() throws IOException {
       return getResponse().getWriter();
   }

   public void setBufferSize(int size) {
       getResponse().setBufferSize(size);
   }

   public void setContentLength(int len) {
       getResponse().setContentLength(len);
   }

   public void setContentType(String type) {
       getResponse().setContentType(type);
   }

   public void setDateHeader(String name, long date) {
       getResponse().setDateHeader(name, date);
   }

   public void addHeader(String name, String value) {
       getResponse().addHeader(name, value);
   }

   public void addIntHeader(String name, int value) {
       getResponse().addIntHeader(name, value);
   }

   public void setHeader(String name, String value) {
       getResponse().setHeader(name, value);
   }

   public void setIntHeader(String name, int value) {
       getResponse().setIntHeader(name, value);
   }

   public void sendRedirect(String location) throws IOException {
       getResponse().sendRedirect(location);
   }

   public void reset() {
       getResponse().reset();
   }

   public void resetBuffer() {
       getResponse().resetBuffer();
   }

   public void setLocale(Locale loc) {
       getResponse().setLocale(loc);
   }

   public void setStatus(int sc) {
       getResponse().setStatus(sc);
   }
}