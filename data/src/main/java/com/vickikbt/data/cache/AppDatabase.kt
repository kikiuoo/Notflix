package com.vickikbt.data.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.vickikbt.data.cache.converters.*
import com.vickikbt.data.cache.daos.CastDao
import com.vickikbt.data.cache.daos.MovieDetailsDao
import com.vickikbt.data.cache.daos.PopularShowsDao
import com.vickikbt.data.cache.daos.UpcomingShowsDao
import com.vickikbt.data.models.entity.*

@Database(
    entities = [PopularResultEntity::class, MovieEntity::class, UpcomingResultEntity::class, MovieDetailsEntity::class, CastEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(
    MovieEntityConverter::class,
    GenreIDEntityConverter::class,
    GenreEntityConverter::class,
    ProductionCompanyEntityConverter::class,
    ProductionCountryEntityConverter::class,
    SpokenLanguageEntityConverter::class,
    CastItemEntityConverter::class
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun popularShowsDao(): PopularShowsDao
    abstract fun upcomingShowsDao(): UpcomingShowsDao
    abstract fun movieDetailsDao(): MovieDetailsDao
    abstract fun castDao(): CastDao

}