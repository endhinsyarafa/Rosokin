package com.app.bankrosok.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.app.bankrosok.database.dao.DatabaseDao;
import com.app.bankrosok.database.dao.DatabaseDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile DatabaseDao _databaseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tbl_bankrosok` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nama_pengguna` TEXT NOT NULL, `jenis_sampah` TEXT NOT NULL, `berat` INTEGER NOT NULL, `harga` INTEGER NOT NULL, `tanggal` TEXT NOT NULL, `alamat` TEXT NOT NULL, `catatan` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b72b771c47d1b69cf79aa9b70acc6e9e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `tbl_bankrosok`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTblBankrosok = new HashMap<String, TableInfo.Column>(8);
        _columnsTblBankrosok.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblBankrosok.put("nama_pengguna", new TableInfo.Column("nama_pengguna", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblBankrosok.put("jenis_sampah", new TableInfo.Column("jenis_sampah", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblBankrosok.put("berat", new TableInfo.Column("berat", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblBankrosok.put("harga", new TableInfo.Column("harga", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblBankrosok.put("tanggal", new TableInfo.Column("tanggal", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblBankrosok.put("alamat", new TableInfo.Column("alamat", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblBankrosok.put("catatan", new TableInfo.Column("catatan", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTblBankrosok = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTblBankrosok = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTblBankrosok = new TableInfo("tbl_bankrosok", _columnsTblBankrosok, _foreignKeysTblBankrosok, _indicesTblBankrosok);
        final TableInfo _existingTblBankrosok = TableInfo.read(_db, "tbl_bankrosok");
        if (! _infoTblBankrosok.equals(_existingTblBankrosok)) {
          return new RoomOpenHelper.ValidationResult(false, "tbl_bankrosok(com.app.bankrosok.model.ModelDatabase).\n"
                  + " Expected:\n" + _infoTblBankrosok + "\n"
                  + " Found:\n" + _existingTblBankrosok);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "b72b771c47d1b69cf79aa9b70acc6e9e", "9fa4c65eafaa36ecb6cbbd160b8d9bd0");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tbl_bankrosok");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tbl_bankrosok`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DatabaseDao.class, DatabaseDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public DatabaseDao databaseDao() {
    if (_databaseDao != null) {
      return _databaseDao;
    } else {
      synchronized(this) {
        if(_databaseDao == null) {
          _databaseDao = new DatabaseDao_Impl(this);
        }
        return _databaseDao;
      }
    }
  }
}
