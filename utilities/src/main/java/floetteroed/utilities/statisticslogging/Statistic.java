/*
 * Copyright 2015, 2016 Gunnar Flötteröd
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * contact: gunnar.floetteroed@abe.kth.se
 *
 */
package floetteroed.utilities.statisticslogging;

/**
 * 
 * @author Gunnar Flötteröd
 * 
 * @param D
 *            the data type from which the statistic is to be extracted
 *
 */
public interface Statistic<D extends Object> {

	public static String toString(Object arg) {
		if (arg == null) {
			return "";
		} else {
			return arg.toString();
		}
	}

	public String label();

	public String value(D data);

}
