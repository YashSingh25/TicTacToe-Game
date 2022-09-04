package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btRestartGame;
 String sBtn1,sBtn2,sBtn3,sBtn4,sBtn5,sBtn6,sBtn7,sBtn8,sBtn9;
 TextView textView;
 int flag=0;
 int count=0;
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        textView.setVisibility(TextView.INVISIBLE);

        btRestartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               newGame();
            }

        });


 }
     private void init(){
         bt1 = findViewById(R.id.button1);
         bt2 = findViewById(R.id.button2);
         bt3 = findViewById(R.id.button3);
         bt4 = findViewById(R.id.button4);
         bt5 = findViewById(R.id.button5);
         bt6 = findViewById(R.id.button6);
         bt7 = findViewById(R.id.button7);
         bt8 = findViewById(R.id.button8);
         bt9 = findViewById(R.id.button9);
         textView =findViewById(R.id.textView);
         btRestartGame=findViewById(R.id.button10);
     }


     public void task(View view){
        count++;
        Button btnCurrent= (Button) view;
       if(btnCurrent.getText().toString().equals("")) {
           if (flag == 0) {
               btnCurrent.setText("X");
               flag = 1;
           } else {
               btnCurrent.setText("O");
               flag = 0;
           }

           if (count > 4) {
               sBtn1 = bt1.getText().toString();
               sBtn2 = bt2.getText().toString();
               sBtn3 = bt3.getText().toString();
               sBtn4 = bt4.getText().toString();
               sBtn5 = bt5.getText().toString();
               sBtn6 = bt6.getText().toString();
               sBtn7 = bt7.getText().toString();
               sBtn8 = bt8.getText().toString();
               sBtn9 = bt9.getText().toString();

               if (sBtn1.equals(sBtn2) && sBtn2.equals(sBtn3) && !sBtn1.equals("")) {
                //   Toast.makeText(MainActivity.this, "Winner is: " + sBtn1, Toast.LENGTH_LONG);
                   textView.setText(getString(R.string.winner).concat(sBtn1));
                   textView.setVisibility(TextView.VISIBLE);
               } else if (sBtn4.equals(sBtn5) && sBtn5.equals(sBtn6) && !sBtn4.equals("")) {
                 //  Toast.makeText(MainActivity.this, "Winner is: " + sBtn4, Toast.LENGTH_LONG);
                   textView.setText(getString(R.string.winner).concat(sBtn4) );
                   textView.setVisibility(View.VISIBLE);
               } else if (sBtn7.equals(sBtn8) && sBtn8.equals(sBtn9) && !sBtn7.equals("")) {
                //   Toast.makeText(MainActivity.this, "Winner is: " + sBtn7, Toast.LENGTH_LONG);
                   textView.setVisibility(View.VISIBLE);
                   textView.setText(getString(R.string.winner).concat(sBtn7) );
               } else if (sBtn1.equals(sBtn4) && sBtn4.equals(sBtn7) && !sBtn1.equals("")) {
                  // Toast.makeText(MainActivity.this, "Winner is: " + sBtn1, Toast.LENGTH_LONG);
                   textView.setVisibility(View.VISIBLE);
                   textView.setText(getString(R.string.winner).concat(sBtn1) );
               } else if (sBtn2.equals(sBtn5) && sBtn5.equals(sBtn8) && !sBtn2.equals("")) {
                  // Toast.makeText(MainActivity.this, "Winner is: " + sBtn2, Toast.LENGTH_LONG);
                   textView.setVisibility(View.VISIBLE);
                   textView.setText(getString(R.string.winner).concat(sBtn2) );
               } else if (sBtn3.equals(sBtn6) && sBtn6.equals(sBtn9) && !sBtn3.equals("")) {
                 //  Toast.makeText(MainActivity.this, "Winner is: " + sBtn3, Toast.LENGTH_LONG);
                   textView.setVisibility(View.VISIBLE);
                   textView.setText(getString(R.string.winner).concat(sBtn3) );
               } else if (sBtn1.equals(sBtn5) && sBtn5.equals(sBtn9) && !sBtn1.equals("")) {
                 //  Toast.makeText(MainActivity.this, "Winner is: " + sBtn1, Toast.LENGTH_LONG);
                   textView.setVisibility(View.VISIBLE);
                   textView.setText(getString(R.string.winner).concat(sBtn1) );
               } else if (sBtn3.equals(sBtn5) && sBtn5.equals(sBtn7) && !sBtn3.equals("")) {
                  // Toast.makeText(MainActivity.this, "Winner is: " + sBtn7, Toast.LENGTH_LONG);
                   textView.setVisibility(View.VISIBLE);
                   textView.setText(getString(R.string.winner).concat(sBtn3) );
               }
               else if( !sBtn1.equals("") && !sBtn2.equals("") && !sBtn3.equals("") && !sBtn4.equals("") &&
                       !sBtn5.equals("") && !sBtn6.equals("") && !sBtn7.equals("") && !sBtn8.equals("") && !sBtn9.equals("")  ) {
                   Toast.makeText(this, "MATCH DRAWN", Toast.LENGTH_SHORT).show();
                   newGame();
               }
           }

       }

 }

public void newGame(){
    bt1.setText("");
    bt2.setText("");
    bt3.setText("");
    bt4.setText("");
    bt5.setText("");
    bt6.setText("");
    bt7.setText("");
    bt8.setText("");
    bt9.setText("");
    flag=0;
    count=0;
    textView.setVisibility(View.INVISIBLE);
}

}