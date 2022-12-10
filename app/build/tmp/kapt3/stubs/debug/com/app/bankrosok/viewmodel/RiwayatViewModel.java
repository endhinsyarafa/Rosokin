package com.app.bankrosok.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/app/bankrosok/viewmodel/RiwayatViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "dataBank", "Landroidx/lifecycle/LiveData;", "", "Lcom/app/bankrosok/model/ModelDatabase;", "getDataBank", "()Landroidx/lifecycle/LiveData;", "setDataBank", "(Landroidx/lifecycle/LiveData;)V", "databaseDao", "Lcom/app/bankrosok/database/dao/DatabaseDao;", "getDatabaseDao", "()Lcom/app/bankrosok/database/dao/DatabaseDao;", "setDatabaseDao", "(Lcom/app/bankrosok/database/dao/DatabaseDao;)V", "totalSaldo", "", "getTotalSaldo", "setTotalSaldo", "deleteDataById", "", "uid", "app_debug"})
public final class RiwayatViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Integer> totalSaldo;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.app.bankrosok.model.ModelDatabase>> dataBank;
    @org.jetbrains.annotations.Nullable()
    private com.app.bankrosok.database.dao.DatabaseDao databaseDao;
    
    public RiwayatViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTotalSaldo() {
        return null;
    }
    
    public final void setTotalSaldo(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.app.bankrosok.model.ModelDatabase>> getDataBank() {
        return null;
    }
    
    public final void setDataBank(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.app.bankrosok.model.ModelDatabase>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.bankrosok.database.dao.DatabaseDao getDatabaseDao() {
        return null;
    }
    
    public final void setDatabaseDao(@org.jetbrains.annotations.Nullable()
    com.app.bankrosok.database.dao.DatabaseDao p0) {
    }
    
    public final void deleteDataById(int uid) {
    }
}