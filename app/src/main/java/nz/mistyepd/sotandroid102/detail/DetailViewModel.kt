package nz.mistyepd.sotandroid102.detail

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso
import nz.mistyepd.sotandroid102.R
import nz.mistyepd.sotandroid102.data.models.Film

class DetailViewModel(private val film: Film) {
	
	fun getTitle() = film.title
	
	fun getSubtitle() = "${film.director} - ${film.releaseDate}"
	
	fun getDescription() = film.description
	
	fun getImageUrl() = "https://robohash.org/${film.id}.png?bgset=any"
	
	companion object {
		
		@JvmStatic
		@BindingAdapter("bind:imageUrl")
		fun loadImage(view: ImageView, imageUrl: String) {
			Picasso.with(view.context)
					.load(imageUrl)
					.error(R.drawable.mock_image)
					.into(view)
		}
	}
	
	
}