/*
 *     Copyright (C) 2015  higherfrequencytrading.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.openhft.chronicle.engine.eg;

import net.openhft.chronicle.core.util.SerializableBiFunction;

/**
 * Created by peter on 17/08/15.
 */
public enum PriceUpdater implements SerializableBiFunction<Price, Object, Price> {
    SET_BID_PRICE {
        @Override
        public Price apply(Price price, Object o) {
            // TODO You shouldn't need this cast. The type should be right from the start.
            price.bidPrice = Double.parseDouble((String) o);
            return price;
        }
    }
}
