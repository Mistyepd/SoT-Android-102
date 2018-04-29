package nz.mistyepd.sotandroid102.main

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import nz.mistyepd.sotandroid102.R
import nz.mistyepd.sotandroid102.data.FilmsRequest
import nz.mistyepd.sotandroid102.data.LocalData
import nz.mistyepd.sotandroid102.data.models.Film
import nz.mistyepd.sotandroid102.detail.DetailActivity
import nz.mistyepd.sotandroid102.form.FormActivity
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {
	
	@BindView(R.id.film_list)
	lateinit var filmList: RecyclerView
	@BindView(R.id.add_fab)
	lateinit var addFab: FloatingActionButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		
		setContentView(R.layout.activity_main)
		
		ButterKnife.bind(this)
		
		addFab.setOnClickListener { startActivityForResult(FormActivity.getIntent(this), REQUESTCODE_ADDFILM) }
		
		fetchAndDisplayFilmsList()
	}
	
	override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
		when (requestCode) {
			REQUESTCODE_ADDFILM -> fetchAndDisplayFilmsList()
		}
		super.onActivityResult(requestCode, resultCode, data)
	}
	
	private fun fetchAndDisplayFilmsList() {
		doAsync(exceptionHandler = { throwable: Throwable -> throwable.printStackTrace() }) {
			val localFilmsList = LocalData(this@MainActivity).getFilms()
			val remoteFilmsList = FilmsRequest().send()
			val combinedFilmsList = localFilmsList.plus(remoteFilmsList)
			uiThread {
				filmList.adapter = FilmListAdapter(combinedFilmsList, { film: Film ->
					startActivity(DetailActivity.getIntent(this@MainActivity, film))
				})
			}
		}
	}
	
	companion object {
		val REQUESTCODE_ADDFILM = 19
	}
}