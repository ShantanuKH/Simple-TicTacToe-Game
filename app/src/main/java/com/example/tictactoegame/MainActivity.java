package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3 ,btn4 ,btn5, btn6, btn7, btn8, btn9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
//        This is how make method...Type this or Just type new V in parenthesis and click Enter

/*
       We have to make method below, Structure should be same, and also this setOnclick will be override by the method we create
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
*/


    }

    private void init(){

//        Find all buttons id
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

// This method which we create will override the above setOnclick method
    public void Check(View view){
        Button btnCurrent = (Button) view;

//    If the button is blank then it should work otherwsie it should not override
    if (btnCurrent.getText().toString().equals("")) {

//    view will also provide the reference of the button, we can give eny name to v in the the above code as here we gave v=view

        count++;  // Whenever btn is clicked the value of count will increase by one
//    Here we are typecasting Button (right hand side) as for now we don't know that which button is pressed by typecasting the view will store the value of the button that is clicked in the btnCurrent.
//    We know this as in the activity_main.xml we have given onClick attribute click so this above Click function will be called and the reference of the button that is clicked will be stored here in view.
//    As now we are given type caste as button it is correct, it should always be kept in mind that whenever we type-caste anything then the view should be the same as of the class
        if (flag == 0) {
            btnCurrent.setText("X");
            flag = 1;
        } else {
            btnCurrent.setText("O");
            flag = 0;
        }
//    To check the values after 5 moves in total
        if (count > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

//    Conditions

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    restartGame();

                    } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                        Toast.makeText(this, "Winner is: " + b4, Toast.LENGTH_SHORT).show();
                       restartGame();
                    } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                        Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                       restartGame();
                    } else if (b1.equals(b4) && b4.equals(b7) && !b4.equals("")) {
                        Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                        restartGame();
                    } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                        Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_SHORT).show();
                        restartGame();
                    } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                        Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                        restartGame();
                    } else if (b1.equals(b5) && b5.equals(b9) && !b9.equals("")) {
                        Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                        restartGame();
                    } else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("")) {
                        Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                        restartGame();
                }

                if (count == 9) {
                    Toast.makeText(this, "Game is draw!", Toast.LENGTH_SHORT).show();
                    restartGame();
                }
             }
         }
    }

    public void restartGame() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
    };
}