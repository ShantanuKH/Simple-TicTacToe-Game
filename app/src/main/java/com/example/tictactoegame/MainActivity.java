package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3 ,btn4 ,btn5, btn6, btn7, btn8, btn9;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
//        This is how make method...Type this or Just type new V in parenthesis and click Enter

//       We have to make method below, Structure should be same, and also this setOnclick will be override by the method we create
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


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
//    view will also provide the reference of the button, we can give eny name to v in the the above code as here we gave v=view
    Button btnCurrent = (Button)view;
//    Here we are typecasting Button (right hand side) as for now we don't know that which button is pressed by typecasting the view will store the value of the button that is clicked in the btnCurrent.
//    We know this as in the activity_main.xml we have given onClick attribute click so this above Click function will be called and the reference of the button that is clicked will be stored here in view.
//    As now we are given type caste as button it is correct, it should always be kept in mind that whenever we type-caste anything then the view should be the same as of the class
        if(flag == 0){
            btnCurrent.setText("X");
            flag=1;
        }else{
            btnCurrent.setText("O");
            flag=0;
        }



    }
}