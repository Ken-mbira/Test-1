package devmbira.mobile.duhqatest1.ui.home

import android.content.Intent
import android.view.View
import android.widget.LinearLayout
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import devmbira.mobile.duhqatest1.ProductActivity
import devmbira.mobile.duhqatest1.ui.slideshow.SlideshowViewModel

class HomeViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}