package edu.washington.jacoblu.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var plus5p1 = findViewById<Button>(R.id.plus5p1)
        var plus1p1 = findViewById<Button>(R.id.plus1p1)
        var minus5p1 = findViewById<Button>(R.id.minus5p1)
        var minus1p1 = findViewById<Button>(R.id.minus1p1)
        var plus5p2 = findViewById<Button>(R.id.plus5p2)
        var plus1p2 = findViewById<Button>(R.id.plus1p2)
        var minus5p2 = findViewById<Button>(R.id.minus5p2)
        var minus1p2 = findViewById<Button>(R.id.minus1p2)
        var plus5p3 = findViewById<Button>(R.id.plus5p3)
        var plus1p3 = findViewById<Button>(R.id.plus1p3)
        var minus5p3 = findViewById<Button>(R.id.minus5p3)
        var minus1p3 = findViewById<Button>(R.id.minus1p3)
        var plus5p4 = findViewById<Button>(R.id.plus5p4)
        var plus1p4 = findViewById<Button>(R.id.plus1p4)
        var minus5p4 = findViewById<Button>(R.id.minus5p4)
        var minus1p4 = findViewById<Button>(R.id.minus1p4)
        var player1 = findViewById<TextView>(R.id.textView1)
        var player2 = findViewById<TextView>(R.id.textView2)
        var player3 = findViewById<TextView>(R.id.textView3)
        var player4 = findViewById<TextView>(R.id.textView4)

        var playerStatus = findViewById<TextView>(R.id.textStatus)

        fun checkPlayer(player: TextView, playerNumber: Int){
            if(player.getText().toString().toInt() <= 0 ) {
                playerStatus.setText("Player " + playerNumber + " LOSES!")
            }
        }
//        var buttons = arrayOf(button5, button1, button_5, button_1)
//        fun createOnClicks (array: Array<Button>, player: TextView) {
//            for(index in buttons.indices) {
//                if(index % 4  == 0) {
//                    buttons[index].setOnClickListener {
//                        player1.setText((player1.getText().toString().toInt() + 5).toString())
//                    }
//                }
//            }
//        }
//

        plus5p1.setOnClickListener{
                player1.setText((player1.getText().toString().toInt() + 5).toString())
        }

        plus1p1.setOnClickListener{
            player1.setText((player1.getText().toString().toInt() + 1).toString())
        }

        minus5p1.setOnClickListener{
            Log.i("mainactivity", player1.getText().toString())
            player1.setText((player1.getText().toString().toInt() - 5).toString())
            Log.i("mainactivity", player1.getText().toString())
            checkPlayer(player1, 1)
            Log.i("mainactivity", player1.getText().toString())

        }

        minus1p1.setOnClickListener{
            player1.setText((player1.getText().toString().toInt() - 1).toString())
            checkPlayer(player1, 1)
        }
        plus5p2.setOnClickListener{
            player2.setText((player2.getText().toString().toInt() + 5).toString())
        }

        plus1p2.setOnClickListener{
            player2.setText((player2.getText().toString().toInt() + 1).toString())
        }

        minus5p2.setOnClickListener{
            player2.setText((player2.getText().toString().toInt() - 5).toString())
            checkPlayer(player2, 2)
        }

        minus1p2.setOnClickListener{
            player2.setText((player2.getText().toString().toInt() - 1).toString())
            checkPlayer(player2, 2)
        }
        plus5p3.setOnClickListener{
            player3.setText((player3.getText().toString().toInt() + 5).toString())
        }

        plus1p3.setOnClickListener{
            player3.setText((player3.getText().toString().toInt() + 1).toString())
        }

        minus5p3.setOnClickListener{
            player3.setText((player3.getText().toString().toInt() - 5).toString())
            checkPlayer(player3, 3)
        }

        minus1p3.setOnClickListener{
            player3.setText((player3.getText().toString().toInt() - 1).toString())
            checkPlayer(player3, 3)
        }
        plus5p4.setOnClickListener{
            player4.setText((player4.getText().toString().toInt() + 5).toString())
        }

        plus1p4.setOnClickListener{
            player4.setText((player4.getText().toString().toInt() + 1).toString())
        }

        minus5p4.setOnClickListener{
            player4.setText((player4.getText().toString().toInt() - 5).toString())
            checkPlayer(player4, 4)
        }

        minus1p4.setOnClickListener{
            player4.setText((player4.getText().toString().toInt() - 1).toString())
            checkPlayer(player4, 4)
        }

    }
}
