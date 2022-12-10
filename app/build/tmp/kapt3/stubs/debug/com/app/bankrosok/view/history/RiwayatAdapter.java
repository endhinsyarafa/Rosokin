package com.app.bankrosok.view.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&\'B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0014\u0010#\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070%R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006("}, d2 = {"Lcom/app/bankrosok/view/history/RiwayatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/app/bankrosok/view/history/RiwayatAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "modelInputList", "", "Lcom/app/bankrosok/model/ModelDatabase;", "adapterCallback", "Lcom/app/bankrosok/view/history/RiwayatAdapter$RiwayatAdapterCallback;", "(Landroid/content/Context;Ljava/util/List;Lcom/app/bankrosok/view/history/RiwayatAdapter$RiwayatAdapterCallback;)V", "mAdapterCallback", "getMAdapterCallback", "()Lcom/app/bankrosok/view/history/RiwayatAdapter$RiwayatAdapterCallback;", "setMAdapterCallback", "(Lcom/app/bankrosok/view/history/RiwayatAdapter$RiwayatAdapterCallback;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "modelDatabase", "getModelDatabase", "()Ljava/util/List;", "setModelDatabase", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataAdapter", "items", "", "RiwayatAdapterCallback", "ViewHolder", "app_debug"})
public final class RiwayatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.app.bankrosok.view.history.RiwayatAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.app.bankrosok.model.ModelDatabase> modelDatabase;
    @org.jetbrains.annotations.NotNull()
    private com.app.bankrosok.view.history.RiwayatAdapter.RiwayatAdapterCallback mAdapterCallback;
    
    public RiwayatAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.bankrosok.model.ModelDatabase> modelInputList, @org.jetbrains.annotations.NotNull()
    com.app.bankrosok.view.history.RiwayatAdapter.RiwayatAdapterCallback adapterCallback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.bankrosok.model.ModelDatabase> getModelDatabase() {
        return null;
    }
    
    public final void setModelDatabase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.app.bankrosok.model.ModelDatabase> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.bankrosok.view.history.RiwayatAdapter.RiwayatAdapterCallback getMAdapterCallback() {
        return null;
    }
    
    public final void setMAdapterCallback(@org.jetbrains.annotations.NotNull()
    com.app.bankrosok.view.history.RiwayatAdapter.RiwayatAdapterCallback p0) {
    }
    
    public final void setDataAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.app.bankrosok.model.ModelDatabase> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.app.bankrosok.view.history.RiwayatAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.app.bankrosok.view.history.RiwayatAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/app/bankrosok/view/history/RiwayatAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/app/bankrosok/databinding/ListItemRiwayatBinding;", "(Lcom/app/bankrosok/view/history/RiwayatAdapter;Lcom/app/bankrosok/databinding/ListItemRiwayatBinding;)V", "imageDelete", "Landroid/widget/ImageView;", "getImageDelete", "()Landroid/widget/ImageView;", "setImageDelete", "(Landroid/widget/ImageView;)V", "tvBerat", "Landroid/widget/TextView;", "getTvBerat", "()Landroid/widget/TextView;", "setTvBerat", "(Landroid/widget/TextView;)V", "tvDate", "getTvDate", "setTvDate", "tvKategori", "getTvKategori", "setTvKategori", "tvNama", "getTvNama", "setTvNama", "tvSaldo", "getTvSaldo", "setTvSaldo", "tvStatus", "getTvStatus", "setTvStatus", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.app.bankrosok.databinding.ListItemRiwayatBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvNama;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDate;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvKategori;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvBerat;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvSaldo;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvStatus;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imageDelete;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.app.bankrosok.databinding.ListItemRiwayatBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvNama() {
            return null;
        }
        
        public final void setTvNama(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDate() {
            return null;
        }
        
        public final void setTvDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvKategori() {
            return null;
        }
        
        public final void setTvKategori(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvBerat() {
            return null;
        }
        
        public final void setTvBerat(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvSaldo() {
            return null;
        }
        
        public final void setTvSaldo(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvStatus() {
            return null;
        }
        
        public final void setTvStatus(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageDelete() {
            return null;
        }
        
        public final void setImageDelete(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/app/bankrosok/view/history/RiwayatAdapter$RiwayatAdapterCallback;", "", "onDelete", "", "modelDatabase", "Lcom/app/bankrosok/model/ModelDatabase;", "app_debug"})
    public static abstract interface RiwayatAdapterCallback {
        
        public abstract void onDelete(@org.jetbrains.annotations.Nullable()
        com.app.bankrosok.model.ModelDatabase modelDatabase);
    }
}