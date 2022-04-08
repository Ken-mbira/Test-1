package devmbira.mobile.duhqatest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast

class ProductActivity : AppCompatActivity() {
    private var imageOne : ImageView? = null
    private var imageTwo : ImageView? = null
    private var imageThree : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val products = Constants.getProducts()
        val product = products[intent.getStringExtra("product_index")?.toInt()!!]
        imageOne = findViewById(R.id.image_1)
        imageTwo = findViewById(R.id.image_2)
        imageThree = findViewById(R.id.image_3)

        imageOne?.setImageResource(product.image1)
        imageTwo?.setImageResource(product.image2)
        imageThree?.setImageResource(product.image3)

    }
}