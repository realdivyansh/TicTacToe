package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    int[] state = {-1,-1,-1,-1,-1,-1,-1,-1,-1} ;

    public void TapInBox (View view) {
        ImageView winImg = findViewById(R.id.winScreen) ;
        TextView winTxt = findViewById(R.id.winText) ;
        Button btn = findViewById(R.id.button) ;
        ImageView box = (ImageView) view ;
        TextView titlet = findViewById(R.id.xoturn) ;
        String title = titlet.getText().toString() ;
        int imgtag = Integer.parseInt(box.getTag().toString()) ;
        if (state[imgtag] == -1) {
            if (title == "X TURN") {
                box.setImageResource(R.drawable.x);
                titlet.setText("O TURN");
                state[imgtag] = 3 ;
//                String print = String.valueOf(state[imgtag]) ;
//                Snackbar.make(view , print , Toast.LENGTH_SHORT).show();
            } else if (title == "O TURN") {
                box.setImageResource(R.drawable.o);
                titlet.setText("X TURN");
                state[imgtag] = 0 ;
//                String print = String.valueOf(state[imgtag]) ;
//                Snackbar.make(view , print , Toast.LENGTH_SHORT).show();
            }
        }

        if (state[0] == state[1] && state[1] == state[2]) {
            if (state[0] == 3) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("X WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("X WON");
            }
            else if (state[0] == 0) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("O WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("O WON");
            }
        }
        else if (state[0] == state[4] && state[4] == state[8]) {
            if (state[0] == 3) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("X WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("X WON");
            }
            else if (state[0] == 0) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("O WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("O WON");
            }
        }
        else if (state[0] == state[3] && state[3] == state[6]) {
            if (state[0] == 3) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("X WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("X WON");
            }
            else if (state[0] == 0) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("O WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("O WON");
            }
        }
        else if (state[1] == state[4] && state[4] == state[7]) {
            if (state[1] == 3) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("X WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("X WON");
            }
            else if (state[1] == 0) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("O WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("O WON");
            }
        }
        else if (state[2] == state[5] && state[5] == state[8]) {
            if (state[2] == 3) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("X WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("X WON");
            }
            else if (state[2] == 0) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("O WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("O WON");
            }
        }
        else if (state[2] == state[4] && state[4] == state[6]) {
            if (state[2] == 3) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("X WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("X WON");
            }
            else if (state[2] == 0) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("O WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("O WON");
            }
        }
        else if (state[3] == state[4] && state[4] == state[5]) {
            if (state[3] == 3) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("X WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("X WON");
            }
            else if (state[3] == 0) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("O WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("O WON");
            }
        }
        else if (state[6] == state[7] && state[7] == state[8]) {
            if (state[6] == 3) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("X WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("X WON");
            }
            else if (state[6] == 0) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("O WON");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("O WON");
            }
        }
        else {
            int temp = 0 ;
            for (int i=0 ; i<9 ; i++) {
                if (state[i] != -1) {
                   temp++ ;
                }
            }
            if (temp == 9) {
                winImg.setVisibility(View.VISIBLE);
                winTxt.setText("DRAW");
                winTxt.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                titlet.setText("DRAW");
            }
        }
    }

    public void onClickButton (View view) {
        Button btn = findViewById(R.id.button) ;
        Snackbar.make(view , "New Game Started" , Toast.LENGTH_SHORT).show();
        TextView title = findViewById(R.id.xoturn) ;
        TextView winTxt = findViewById(R.id.winText) ;
        ImageView winImg = findViewById(R.id.winScreen) ;
        title.setText("X TURN");
        title.setVisibility(View.VISIBLE);
        btn.setVisibility(View.INVISIBLE);
        winTxt.setVisibility(View.INVISIBLE);
        winImg.setVisibility(View.INVISIBLE);

        for (int i=0 ; i<9 ; i++) {
            state[i] = -1 ;
        }
        ((ImageView) findViewById(R.id.img1)).setImageDrawable(null);
        ((ImageView) findViewById(R.id.img2)).setImageDrawable(null);
        ((ImageView) findViewById(R.id.img3)).setImageDrawable(null);
        ((ImageView) findViewById(R.id.img4)).setImageDrawable(null);
        ((ImageView) findViewById(R.id.img5)).setImageDrawable(null);
        ((ImageView) findViewById(R.id.img6)).setImageDrawable(null);
        ((ImageView) findViewById(R.id.img7)).setImageDrawable(null);
        ((ImageView) findViewById(R.id.img8)).setImageDrawable(null);
        ((ImageView) findViewById(R.id.img9)).setImageDrawable(null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startGame = findViewById(R.id.button) ;
        startGame.setVisibility(View.VISIBLE);

        ImageView winScreen = findViewById(R.id.winScreen) ;
        winScreen.setVisibility(View.INVISIBLE);

        TextView winText = findViewById(R.id.winText) ;
        winText.setVisibility(View.INVISIBLE);

        TextView title = findViewById(R.id.xoturn) ;
        title.setVisibility(View.INVISIBLE);
    }
}