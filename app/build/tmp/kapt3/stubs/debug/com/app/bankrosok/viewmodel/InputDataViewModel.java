package com.app.bankrosok.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J>\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/app/bankrosok/viewmodel/InputDataViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "databaseDao", "Lcom/app/bankrosok/database/dao/DatabaseDao;", "getDatabaseDao", "()Lcom/app/bankrosok/database/dao/DatabaseDao;", "setDatabaseDao", "(Lcom/app/bankrosok/database/dao/DatabaseDao;)V", "addDataSampah", "", "nama_pengguna", "", "jenis_sampah", "berat", "", "harga", "tanggal", "alamat", "catatan", "app_debug"})
public final class InputDataViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.app.bankrosok.database.dao.DatabaseDao databaseDao;
    
    public InputDataViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.bankrosok.database.dao.DatabaseDao getDatabaseDao() {
        return null;
    }
    
    public final void setDatabaseDao(@org.jetbrains.annotations.Nullable()
    com.app.bankrosok.database.dao.DatabaseDao p0) {
    }
    
    public final void addDataSampah(@org.jetbrains.annotations.NotNull()
    java.lang.String nama_pengguna, @org.jetbrains.annotations.NotNull()
    java.lang.String jenis_sampah, int berat, int harga, @org.jetbrains.annotations.NotNull()
    java.lang.String tanggal, @org.jetbrains.annotations.NotNull()
    java.lang.String alamat, @org.jetbrains.annotations.NotNull()
    java.lang.String catatan) {
    }
}