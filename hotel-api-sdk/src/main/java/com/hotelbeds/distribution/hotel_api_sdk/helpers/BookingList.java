package com.hotelbeds.distribution.hotel_api_sdk.helpers;

/*
 * #%L
 * HotelAPI SDK
 * %%
 * Copyright (C) 2015 - 2016 HOTELBEDS TECHNOLOGY, S.L.U.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */


import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.hotelbeds.distribution.hotel_api_sdk.types.FilterType;

import lombok.Builder;
import lombok.ToString;
import lombok.Value;

@Builder
@Value
@ToString
public class BookingList {
    @NotNull
    private LocalDate fromDate;
    @NotNull
    private LocalDate toDate;

    private Integer from;
    private Integer to;

    private boolean excludeCancelled;

    private FilterType usingDate;

    public void validate() {
        // 0 < From < to
        // now < fromDate < toDate
        // usingDate mandatory or default?!?
    }
}
