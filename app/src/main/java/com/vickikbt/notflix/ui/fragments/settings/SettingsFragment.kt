package com.vickikbt.notflix.ui.fragments.settings

import android.os.Bundle
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.vickikbt.core.Coroutines
import com.vickikbt.notflix.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsFragment : PreferenceFragmentCompat() {

    private lateinit var themePreference: ListPreference


    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings_fragment, rootKey)
        themePreference = findPreference("theme")!!

        Coroutines.main {
            //initUI()

        }

        //setTheme()


    }

    private fun initUI() {
        val themeArrayOptions = resources.getStringArray(R.array.theme_entries)

        themePreference.summaryProvider = Preference.SummaryProvider<ListPreference> { preference ->
            when (preference.value) {
                "Light" -> themeArrayOptions[0]
                "Dark" -> themeArrayOptions[1]
                "System" -> themeArrayOptions[2]
                else -> getString(R.string.def)
            }
        }

    }

    /*private fun setTheme() {
        val sharedPref = PreferenceManager.getDefaultSharedPreferences(requireContext())
        sharedPref.registerOnSharedPreferenceChangeListener { _, key ->
            val theme = sharedPref.getString(key, "Dark Theme")
            when (theme) {
                "light_theme" -> (requireActivity().application as NotflixApplication).themeDataStore.saveSelectedTheme(
                    AppCompatDelegate.MODE_NIGHT_NO
                )
                "dark_theme" -> (requireActivity().application as NotflixApplication).themeDataStore.saveSelectedTheme(
                    AppCompatDelegate.MODE_NIGHT_YES
                )
                "system_default" -> (requireActivity().application as NotflixApplication).themeDataStore.saveSelectedTheme(
                    AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                )
            }
            Timber.e("Theme: $theme")
        }

    }*/


}