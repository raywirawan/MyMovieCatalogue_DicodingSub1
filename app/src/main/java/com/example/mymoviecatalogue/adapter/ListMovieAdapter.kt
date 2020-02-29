package com.example.mymoviecatalogue.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

import com.example.mymoviecatalogue.R
import com.example.mymoviecatalogue.model.Movie

import java.util.ArrayList

class ListMovieAdapter(private val context: Context) : BaseAdapter() {
    private var movies: List<Movie>? = null

    init {
        movies = ArrayList()
    }

    override fun getCount(): Int {
        return movies!!.size
    }

    override fun getItem(position: Int): Any {
        return movies!![position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_row_card, parent, false)
        }

        val viewHolder = ViewHolder(view!!)
        val movie = getItem(position) as Movie
        viewHolder.bind(movie)

        return view
    }

    fun setMovies(movies: ArrayList<Movie>) {
        this.movies = movies
    }

    private inner class ViewHolder internal constructor(view: View) {
        private val title: TextView = view.findViewById(R.id.tv_item_title)
        private val date: TextView = view.findViewById(R.id.tv_item_table_date)
        private val genre: TextView = view.findViewById(R.id.tv_item_table_genre)
        private val director: TextView = view.findViewById(R.id.tv_item_table_director)
        private val image: ImageView = view.findViewById(R.id.img_item_photo)

        internal fun bind(movie: Movie) {
            title.text = movie.title
            date.text = movie.date
            genre.text = movie.genre
            director.text = movie.director
            image.setImageResource(context.resources.getIdentifier(movie.drawable, null, context.packageName))
        }
    }
}
