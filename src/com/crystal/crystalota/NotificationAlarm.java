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

package com.crystal.crystalota;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.crystal.crystalota.updater.GappsUpdater;
import com.crystal.crystalota.updater.RomUpdater;

public class NotificationAlarm extends BroadcastReceiver {

    private RomUpdater mRomUpdater;
    private GappsUpdater mGappsUpdater;

    @Override
    public void onReceive(Context context, Intent intent) {

        if (mRomUpdater == null) {
            mRomUpdater = new RomUpdater(context, true);
        }
        if (mGappsUpdater == null) {
            mGappsUpdater = new GappsUpdater(context, true);
        }
        if (Utils.isNetworkAvailable(context)) {
            mRomUpdater.check();
            mGappsUpdater.check();
        }
    }
}
