// Generated by view binder compiler. Do not edit!
package com.app.bankrosok.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.bankrosok.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRiwayatBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final RecyclerView rvHistory;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvNotFound;

  @NonNull
  public final TextView tvSaldo;

  private ActivityRiwayatBinding(@NonNull CoordinatorLayout rootView,
      @NonNull RecyclerView rvHistory, @NonNull Toolbar toolbar, @NonNull TextView tvNotFound,
      @NonNull TextView tvSaldo) {
    this.rootView = rootView;
    this.rvHistory = rvHistory;
    this.toolbar = toolbar;
    this.tvNotFound = tvNotFound;
    this.tvSaldo = tvSaldo;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRiwayatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRiwayatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_riwayat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRiwayatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rvHistory;
      RecyclerView rvHistory = ViewBindings.findChildViewById(rootView, id);
      if (rvHistory == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tvNotFound;
      TextView tvNotFound = ViewBindings.findChildViewById(rootView, id);
      if (tvNotFound == null) {
        break missingId;
      }

      id = R.id.tvSaldo;
      TextView tvSaldo = ViewBindings.findChildViewById(rootView, id);
      if (tvSaldo == null) {
        break missingId;
      }

      return new ActivityRiwayatBinding((CoordinatorLayout) rootView, rvHistory, toolbar,
          tvNotFound, tvSaldo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
