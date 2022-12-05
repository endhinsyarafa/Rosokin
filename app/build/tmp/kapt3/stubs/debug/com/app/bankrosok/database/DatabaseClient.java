package com.app.bankrosok.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/app/bankrosok/database/DatabaseClient;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appDatabase", "Lcom/app/bankrosok/database/AppDatabase;", "getAppDatabase", "()Lcom/app/bankrosok/database/AppDatabase;", "setAppDatabase", "(Lcom/app/bankrosok/database/AppDatabase;)V", "Companion", "app_debug"})
public final class DatabaseClient {
    @org.jetbrains.annotations.NotNull()
    private com.app.bankrosok.database.AppDatabase appDatabase;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bankrosok.database.DatabaseClient.Companion Companion = null;
    private static com.app.bankrosok.database.DatabaseClient mInstance;
    
    private DatabaseClient(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.bankrosok.database.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.NotNull()
    com.app.bankrosok.database.AppDatabase p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/app/bankrosok/database/DatabaseClient$Companion;", "", "()V", "mInstance", "Lcom/app/bankrosok/database/DatabaseClient;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.bankrosok.database.DatabaseClient getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}