/*
 * Copyright (C) 2023-24 Paranoid Android
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package co.aospa.dolby.oplus

import android.os.Bundle
import android.view.Window
import androidx.fragment.app.FragmentActivity
import co.aospa.dolby.oplus.preference.DolbySettingsFragment
import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity

private const val TAG = "DolbyActivity"

class DolbyActivity : CollapsingToolbarBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        super.onCreate(savedInstanceState)
        fragmentManager.beginTransaction()
            .replace(com.android.settingslib.collapsingtoolbar.R.id.content_frame, DolbySettingsFragment(), TAG)
            .commit()
    }
}
