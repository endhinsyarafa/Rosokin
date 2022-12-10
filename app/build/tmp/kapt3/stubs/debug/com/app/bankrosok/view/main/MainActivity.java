package com.app.bankrosok.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0012\u0010.\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J+\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c032\u0006\u00104\u001a\u000205H\u0016\u00a2\u0006\u0002\u00106J\b\u00107\u001a\u00020)H\u0002J\b\u00108\u001a\u00020)H\u0003J\b\u00109\u001a\u00020)H\u0002J\b\u0010:\u001a\u00020)H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/app/bankrosok/view/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "REQ_PERMISSION", "", "getREQ_PERMISSION", "()I", "setREQ_PERMISSION", "(I)V", "binding", "Lcom/app/bankrosok/databinding/ActivityMainBinding;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "simpleLocation", "Lim/delight/android/location/SimpleLocation;", "getSimpleLocation", "()Lim/delight/android/location/SimpleLocation;", "setSimpleLocation", "(Lim/delight/android/location/SimpleLocation;)V", "strCurrentLatitude", "", "getStrCurrentLatitude", "()D", "setStrCurrentLatitude", "(D)V", "strCurrentLocation", "", "getStrCurrentLocation", "()Ljava/lang/String;", "setStrCurrentLocation", "(Ljava/lang/String;)V", "strCurrentLongitude", "getStrCurrentLongitude", "setStrCurrentLongitude", "userLocation", "Lcom/app/bankrosok/model/UserLocation;", "userLocationPreferences", "Lcom/app/bankrosok/sharedpref/UserLocationPreferences;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setInitLayout", "setLocation", "setPermission", "setStatusBar", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private int REQ_PERMISSION = 100;
    private double strCurrentLatitude = 0.0;
    private double strCurrentLongitude = 0.0;
    public java.lang.String strCurrentLocation;
    public im.delight.android.location.SimpleLocation simpleLocation;
    private com.app.bankrosok.databinding.ActivityMainBinding binding;
    private com.app.bankrosok.sharedpref.UserLocationPreferences userLocationPreferences;
    private com.app.bankrosok.model.UserLocation userLocation;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private com.google.firebase.auth.FirebaseAuth firebaseAuth;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bankrosok.view.main.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    public final int getREQ_PERMISSION() {
        return 0;
    }
    
    public final void setREQ_PERMISSION(int p0) {
    }
    
    public final double getStrCurrentLatitude() {
        return 0.0;
    }
    
    public final void setStrCurrentLatitude(double p0) {
    }
    
    public final double getStrCurrentLongitude() {
        return 0.0;
    }
    
    public final void setStrCurrentLongitude(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrCurrentLocation() {
        return null;
    }
    
    public final void setStrCurrentLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final im.delight.android.location.SimpleLocation getSimpleLocation() {
        return null;
    }
    
    public final void setSimpleLocation(@org.jetbrains.annotations.NotNull()
    im.delight.android.location.SimpleLocation p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void setLocation() {
    }
    
    private final void setInitLayout() {
    }
    
    private final void setPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void setStatusBar() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/app/bankrosok/view/main/MainActivity$Companion;", "", "()V", "setWindowFlag", "", "activity", "Landroid/app/Activity;", "bits", "", "on", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setWindowFlag(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, int bits, boolean on) {
        }
    }
}