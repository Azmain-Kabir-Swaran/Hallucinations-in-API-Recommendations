package org.example;


import androidx.appcompat.app.AppCompatDialog;
import android.content.DialogInterface;

public class Main {

    public static void main(String[] args) {
        AppCompatDialog dialog = new AppCompatDialog();
        
        dialog.setTitle("Dialog Title");
        dialog.setMessage("Dialog Message");

        dialog.setCancelable(false);

        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.out.println("Ok button clicked");
            }
        });

        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.out.println("Cancel button clicked");
            }
        });

        dialog.show();
    }
}