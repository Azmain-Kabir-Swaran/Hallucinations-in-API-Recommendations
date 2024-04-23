package org.example;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialog;
import androidx.fragment.app.DialogFragment;
import android.content.DialogInterface;
import android.widget.Button;

public class Main extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AppCompatDialog dialog = new AppCompatDialog(getActivity(), R.style.Theme_MaterialComponents_Dialog_Alert);
        dialog.setTitle("Information");
        dialog.setMessage("This is a simple information dialog.");
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) { 
                // positive button logic
            }
        });

        return dialog;
    }

    public static void main(String args[]) {
        // Start your application's main class here
        // For example:
        // android.os.Looper.prepare();
        // new Main().show(getFragmentManager(), "dialog");
    }
}