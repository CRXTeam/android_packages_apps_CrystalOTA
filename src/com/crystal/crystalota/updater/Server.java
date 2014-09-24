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

package com.crystal.crystalota.updater;

import com.crystal.crystalota.Version;
import com.crystal.crystalota.updater.Updater.PackageInfo;

import org.json.JSONObject;

import java.util.List;

public interface Server {

    public String getUrl(String device, Version version);

    public List<PackageInfo> createPackageInfoList(JSONObject response) throws Exception;

    public String getError();
}
