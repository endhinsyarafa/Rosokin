package com.app.bankrosok.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserLocation(
    var location: String? = null
): Parcelable
