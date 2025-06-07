package com.subhash.movieplus.data.local.datasources.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.subhash.movieplus.data.local.models.SavedMovieEntitiy
import com.subhash.movieplus.data.local.datasources.dao.MovieDAO

@Database(entities = [SavedMovieEntitiy::class], version = 1)
abstract class MoviesDatabase : RoomDatabase(){
    abstract  fun noteDoa(): MovieDAO
}