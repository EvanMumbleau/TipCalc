package css.evanmumbleau.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // delare variable here
    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;
    TipCalculator tipCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // init varaibles
        etBill = (EditText) findViewById(R.id.editTextBill);
        etNumParty = (EditText) findViewById(R.id.editTextNumParty);
        tvTotalTip = (TextView) findViewById(R.id.textViewD);
        tvTipPerPerson = (TextView) findViewById(R.id.textViewD2);
    }


    public void onClickButtonCalc(View view) {
       double bill = Double.parseDouble(etBill.getText().toString());
        double numPeople = Double.parseDouble (etNumParty.getText().toString());
        Double totTip = bill * 0.1;
        Double tipPerPerson = totTip / numPeople;
        tvTotalTip.setText("Total bill: " + totTip.toString());
        tvTipPerPerson.setText("Total tip: " + tipPerPerson);
    }

}
