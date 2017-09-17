package poclin.carlos.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Segunda_app extends AppCompatActivity {

    private TextView mTvTextPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_app);

        mTvTextPrueba = (TextView) findViewById(R.id.tv_texto_prueba);

        String myString = getString(R.string.login_username);
        Integer myInteger = getResources().getInteger(R.integer.my_integer);

        int myIntegerArray [] = getResources().getIntArray(R.array.my_integer_array);

        String myStringArray [] = getResources().getStringArray(R.array.my_string_array);

        Boolean myBool = getResources().getBoolean(R.bool.my_bool);

        for (int i = 0; i < myIntegerArray.length; i++){
            Log.v("integer", ""+myIntegerArray[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (String item : myStringArray){
            sb.append(item+"\n");
        }

        mTvTextPrueba.setText(sb.toString());

    }
}

