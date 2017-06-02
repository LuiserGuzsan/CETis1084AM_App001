package mx.edu.cetis108.cetis1084am_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        private void btnSaludar_click(View v)
        {
            EditText txtNombre=(EditText)findViewById(R.id.txtNombre);
        }
}