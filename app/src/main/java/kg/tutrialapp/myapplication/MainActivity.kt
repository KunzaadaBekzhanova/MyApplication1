package kg.tutrialapp.myapplication

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val catImage: ImageView? = null
    private val showTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var catImage : (ImageView) = findViewById(R.id.icon)
        var showTextView :(TextView) = findViewById(R.id.text_view_id)
        catImage.setOnClickListener(object : OnClickListener {
            override fun onClick(view: View?) {
                showTextView?.setText("CAT")
            }
        })
        var dogImage : (ImageView) = findViewById(R.id.imageView2)

        dogImage.setOnClickListener(object : OnClickListener {
            override fun onClick(view: View?) {
                showTextView?.setText("DOG")
            }
        })

        var hamsterImage : (ImageView) = findViewById(R.id.imageView3)

        hamsterImage.setOnClickListener(object : OnClickListener {
            override fun onClick(view: View?) {
                showTextView?.setText("HAMSTER")
            }
        })

    }

}