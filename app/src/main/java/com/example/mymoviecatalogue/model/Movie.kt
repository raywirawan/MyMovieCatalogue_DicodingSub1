package com.example.mymoviecatalogue.model

import android.os.Parcel
import android.os.Parcelable

class Movie(
        val title: String,
        val date: String,
        val genre: String,
        val rating: String,
        val director: String,
        val synopsis: String,
        val cast: String,
        val drawable: String,
        val imdb_url: String,
        val moviedb_url: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(date)
        parcel.writeString(genre)
        parcel.writeString(rating)
        parcel.writeString(director)
        parcel.writeString(synopsis)
        parcel.writeString(cast)
        parcel.writeString(drawable)
        parcel.writeString(imdb_url)
        parcel.writeString(moviedb_url)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}
