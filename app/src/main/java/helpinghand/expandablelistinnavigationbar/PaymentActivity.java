package helpinghand.expandablelistinnavigationbar;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {
    LinearLayout googleWalletLinearLayout, eSewaLinearLayout, creditCardLinearLayout;
    Spinner expiryMonthSpinner, expiryYearSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        googleWalletLinearLayout = (LinearLayout) findViewById(R.id.googleWalletLinearLayout);
        creditCardLinearLayout = (LinearLayout) findViewById(R.id.creditCardLinearLayout);
        eSewaLinearLayout = (LinearLayout) findViewById(R.id.eSewaLinearLayout);

        googleWalletLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showGoogleWalletPaymentDialogBox();
            }
        });
        creditCardLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCreditCardPaymentDialogBox();
            }
        });
        eSewaLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showeSewaPaymentDialogBox();
            }
        });
    }
    private void showCreditCardPaymentDialogBox() {

        final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(PaymentActivity.this);

        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.credit_card_payment_dialog_box, null);

        dialogBuilder.setView(dialogView);
        dialogBuilder.setIcon(R.drawable.atm);

        final AlertDialog dialog = dialogBuilder.create();

        final EditText creditCardNumber = (EditText) dialogView.findViewById(R.id.creditCardNumberEditText);
        final EditText securityNumber = (EditText) dialogView.findViewById(R.id.securityNumberEditText);
        final Button payButton = (Button) dialogView.findViewById(R.id.toPaymentButton);
        final Button cancelButton = (Button) dialogView.findViewById(R.id.cancelButton);
        expiryMonthSpinner = (Spinner) dialogView.findViewById(R.id.expiryDate);
        expiryYearSpinner = (Spinner) dialogView.findViewById(R.id.expiryYear);


        String[] months = new String[]{"one", "two", "three", "four", "five", "six", "7", "seven", "9", "10", "11", "12"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(PaymentActivity.this, android.R.layout.simple_spinner_dropdown_item, months);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        expiryMonthSpinner.setAdapter(adapter1);

        String[] years = new String[]{"2017", "2018", "2018", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(PaymentActivity.this, android.R.layout.simple_spinner_dropdown_item, years);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        expiryYearSpinner.setAdapter(adapter2);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                dialog.cancel();
                return;
            }
        });
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PaymentActivity.this, " Payment Successful..", Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            }
        });


        dialog.show();


    }

    private void showeSewaPaymentDialogBox() {
        final AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(PaymentActivity.this);

        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.esewa_payment_dialog_box, null);

        dialogBuilder.setView(dialogView);
        dialogBuilder.setIcon(R.drawable.esewa);

        final AlertDialog dialog = dialogBuilder.create();

        final EditText esewaID = (EditText) dialogView.findViewById(R.id.esewaIdEditText);
        final EditText esewaPassword = (EditText) dialogView.findViewById(R.id.esewaPasswordEditText);
        final Button payButton = (Button) dialogView.findViewById(R.id.toPaymentButton);
        final Button cancelButton = (Button) dialogView.findViewById(R.id.cancelButton);


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                dialog.cancel();
                return;
            }
        });
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PaymentActivity.this, " Payment Successful..", Toast.LENGTH_SHORT).show();
                dialog.dismiss();


            }
        });


        dialog.show();


    }

    private void showGoogleWalletPaymentDialogBox() {
        Toast.makeText(this, "Google Wallet Payment Coming Soon..", Toast.LENGTH_SHORT).show();
    }

}
