package org.example;


import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatDialog;

public class Main extends AppCompatDialog implements DialogInterface.OnClickListener {

    Button btnDialog;

    public Main(DialogFragment dialogFragment) {
        super(dialogFragment.getActivity());
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
        switch (which) {
            case DialogInterface.BUTTON_POSITIVE:
                // Positive button logic
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                // Negative button logic
                break;
            case DialogInterface.BUTTON_NEUTRAL:
                // Neutral button logic
                break;
        }
    }

    public static void main(String[] args) {
        AppCompatDialog dialog = new AppCompatDialog(new DialogFragment());
        dialog.setTitle("Title");
        dialog.setContentView(R.layout.your_layout);

        Button btnDialog = dialog.findViewById(R.id.button);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

}