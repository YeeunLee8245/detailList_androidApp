package kr.co.yeaeun.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kr.co.yeaeun.myapplication.databinding.ActivityDetailBinding
import java.net.URLEncoder

class DetailActivity : AppCompatActivity() {
    private lateinit var view: ActivityDetailBinding
    private lateinit var model: SongViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(view.root)

        model = ViewModelProvider(this).get(SongViewModel::class.java)
        val getData = intent.getStringArrayExtra("info") as Array<String>
        view.image.setImageUrl(getData[1],model.imageLoader)
        view.title.text = getData[0]
        view.info.text = getData[2]
    }
}