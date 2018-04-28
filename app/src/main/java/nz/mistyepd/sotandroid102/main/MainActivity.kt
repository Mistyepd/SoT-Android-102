package nz.mistyepd.sotandroid102.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import nz.mistyepd.sotandroid102.R
import nz.mistyepd.sotandroid102.data.MockDataSource
import nz.mistyepd.sotandroid102.data.models.Film
import nz.mistyepd.sotandroid102.detail.DetailActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity() {
	
	@BindView(R.id.film_list)
	lateinit var filmList: RecyclerView
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		MainActivityUI().setContentView(this)
		
		ButterKnife.bind(this)
		
		doAsync(exceptionHandler = { throwable: Throwable -> throwable.printStackTrace() }) {
			uiThread {
				filmList.adapter = FilmListAdapter(MockDataSource().getFilms(), { film: Film ->
					startActivity(DetailActivity.getIntent(this@MainActivity, film))
				})
			}
		}
	}
}


class MainActivityUI : AnkoComponent<MainActivity> {
	
	override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
		frameLayout {
			recyclerView {
				id = R.id.film_list
				layoutManager = LinearLayoutManager(ctx)
			}
		}
	}
}