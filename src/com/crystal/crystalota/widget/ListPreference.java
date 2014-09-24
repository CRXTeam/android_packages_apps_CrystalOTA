/*
 * Copyright 2014 crystalAndroid Project
 *
 * This file is part of crystal OTA.
 *
 * crystal OTA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * crystal OTA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with crystal OTA.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.crystal.crystalota.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.crystal.crystalota.Utils;

public class ListPreference extends android.preference.ListPreference {

    public ListPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListPreference(Context context) {
        super(context);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        Utils.setRobotoThin(getContext(), view);
    }
}
