package com.app.bankrosok.database.dao

import androidx.room.Dao
import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.app.bankrosok.model.ModelDatabase

@Dao
interface DatabaseDao {

    @Query("SELECT * FROM tbl_bankrosok")
    fun getAll(): LiveData<List<ModelDatabase>>

    @Query("SELECT SUM(harga) FROM tbl_bankrosok")
    fun getSaldo(): LiveData<Int>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(modelDatabases: ModelDatabase)

    @Query("DELETE FROM tbl_bankrosok WHERE uid= :uid")
    fun deleteSingleData(uid: Int)

}