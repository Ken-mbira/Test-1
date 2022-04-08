package devmbira.mobile.duhqatest1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import devmbira.mobile.duhqatest1.Adapters.ProductAdapter
import devmbira.mobile.duhqatest1.Constants.getProducts


class MainActivity : AppCompatActivity(),ProductAdapter.OnProductClickListener {
    private var recyclerViewProducts:RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewProducts = findViewById(R.id.recycler_view_products)

        recyclerViewProducts?.layoutManager = LinearLayoutManager(this)

        val productAdapter = ProductAdapter(this,getProducts(),this)

        recyclerViewProducts?.adapter = productAdapter

    }

    override fun onProductClick(position: Int) {
        val intent = Intent(this,ProductActivity::class.java,)
        intent.putExtra("product_index",position.toString())
        startActivity(intent)
    }
}