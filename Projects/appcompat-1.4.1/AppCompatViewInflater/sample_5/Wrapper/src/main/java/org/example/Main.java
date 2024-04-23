package org.example;


import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.Toolbar;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

public class Main {
    public static void main(String[] args) {
        // Implement AppCompatViewInflater usage here
        Menu menu = new MenuBuilder(null);
        MenuInflater inflater = new MenuInflater();
        Toolbar toolbar = new Toolbar(null);
        
        inflater.inflate(toolbar.getMenu(), menu);

        Button button = new Button(null);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        button.setText("Button");
        toolbar.addView(button, params);

        menu.add(0, Menu.FIRST, Menu.NONE, "Hello");
        MenuItemImpl menuItem = new MenuItemImpl(menu);
        menuItem.setTitle("Hello");
        menuItem.setChecked(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(menuItem.isChecked());
            }
        });
    }
}