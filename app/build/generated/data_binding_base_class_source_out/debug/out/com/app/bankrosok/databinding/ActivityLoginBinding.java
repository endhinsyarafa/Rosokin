// Generated by view binder compiler. Do not edit!
package com.app.bankrosok.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.bankrosok.R;
import com.google.android.gms.common.SignInButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar loginProgressBar;

  @NonNull
  public final SignInButton signInWithGoogle;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull ProgressBar loginProgressBar, @NonNull SignInButton signInWithGoogle,
      @NonNull TextView textView, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.loginProgressBar = loginProgressBar;
    this.signInWithGoogle = signInWithGoogle;
    this.textView = textView;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.loginProgressBar;
      ProgressBar loginProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (loginProgressBar == null) {
        break missingId;
      }

      id = R.id.signInWithGoogle;
      SignInButton signInWithGoogle = ViewBindings.findChildViewById(rootView, id);
      if (signInWithGoogle == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, loginProgressBar,
          signInWithGoogle, textView, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
