package com.app.bankrosok.sharedpref

import android.content.Context
import com.app.bankrosok.model.UserLocation

internal class UserLocationPreferences(context: Context) {

    private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun setUserLocation(value: String) {
        val editor = preferences.edit()
        editor.putString(LOCATION, value)
        editor.apply()
    }

    fun getUserLocation(): UserLocation {
        val model = UserLocation()
        model.location = preferences.getString(LOCATION, "")
        return model
    }

    companion object {
        private const val PREFS_NAME = "user_location_preference_rosokin"
        private const val LOCATION = "location"
    }
}