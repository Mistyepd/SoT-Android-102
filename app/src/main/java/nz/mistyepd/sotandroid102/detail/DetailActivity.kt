package nz.mistyepd.sotandroid102.detail

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nz.mistyepd.sotandroid102.R
import nz.mistyepd.sotandroid102.data.models.Film
import nz.mistyepd.sotandroid102.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
	
	lateinit var binding: ActivityDetailBinding
	lateinit var film: Film
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
		
		supportActionBar?.setDisplayHomeAsUpEnabled(true)
		
		film = intent.getParcelableExtra(EXTRA_FILM)
		
		binding.item = film
		
	}
	
	
	companion object {
		fun getIntent(context: Context, film: Film): Intent {
			val intent = Intent(context, DetailActivity::class.java)
			intent.putExtra(EXTRA_FILM, film)
			return intent
		}
		
		val EXTRA_FILM = "_EXTRA_FILM"
		
	}
}
