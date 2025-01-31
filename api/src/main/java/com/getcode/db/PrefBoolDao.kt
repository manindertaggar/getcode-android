package com.getcode.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.getcode.model.PrefBool
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Maybe

@Dao
interface PrefBoolDao {
    @Query("SELECT * FROM PrefBool WHERE key = :key")
    fun get(key: String): Flowable<PrefBool>

    @Query("SELECT * FROM PrefBool WHERE key = :key")
    fun getMaybe(key: String): Maybe<PrefBool>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: PrefBool)
}