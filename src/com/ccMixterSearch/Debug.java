// This file is part of ccMixterSearch4Java.
//
// Copyright (c) 2017 Torsten Klinger.
// E-Mail: torsten.klinger@googlemail.com
//
// ccMixterSearch4Java is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// ccMixterSearch4Java is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with ccMixterSearch4Java. If not, see<http://www.gnu.org/licenses/>.

package com.ccMixterSearch;

public class Debug
{
	static boolean isEnabled;
	
	public static boolean getMode() {
		return isEnabled;
	}

	public static boolean setMode(boolean Mode) {
		return isEnabled = Mode;
	}
}