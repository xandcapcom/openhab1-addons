/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.weather.internal.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import org.openhab.binding.weather.internal.annotation.Provider;
import org.openhab.binding.weather.internal.annotation.ProviderMappings;

/**
 * Common provider model for temperature data.
 *
 * @author Gerhard Riegler
 * @since 1.6.0
 */
public class Temperature {

    @ProviderMappings({ @Provider(name = ProviderName.OPENWEATHERMAP, property = "main.temp"),
            @Provider(name = ProviderName.OPENWEATHERMAP, property = "temp.day"),
            @Provider(name = ProviderName.FORECASTIO, property = "currently.temperature"),
            @Provider(name = ProviderName.WORLDWEATHERONLINE, property = "temp_C"),
            @Provider(name = ProviderName.HAMWEATHER, property = "tempC"),
            @Provider(name = ProviderName.METEOBLUE, property = "temperature"),
            @Provider(name = ProviderName.APIXU, property = "temp_c"),
            @Provider(name = ProviderName.WEATHERBIT, property = "temp") })
    private Double current;

    @ProviderMappings({ @Provider(name = ProviderName.OPENWEATHERMAP, property = "main.temp_min"),
            @Provider(name = ProviderName.OPENWEATHERMAP, property = "temp.min"),
            @Provider(name = ProviderName.FORECASTIO, property = "temperatureMin"),
            @Provider(name = ProviderName.WORLDWEATHERONLINE, property = "tempMinC"),
            @Provider(name = ProviderName.HAMWEATHER, property = "minTempC"),
            @Provider(name = ProviderName.METEOBLUE, property = "temperature_min"),
            @Provider(name = ProviderName.APIXU, property = "mintemp_c"),
            @Provider(name = ProviderName.WEATHERBIT, property = "min_temp") })
    private Double min;

    @ProviderMappings({ @Provider(name = ProviderName.OPENWEATHERMAP, property = "main.temp_max"),
            @Provider(name = ProviderName.OPENWEATHERMAP, property = "temp.max"),
            @Provider(name = ProviderName.FORECASTIO, property = "temperatureMax"),
            @Provider(name = ProviderName.WORLDWEATHERONLINE, property = "tempMaxC"),
            @Provider(name = ProviderName.HAMWEATHER, property = "maxTempC"),
            @Provider(name = ProviderName.METEOBLUE, property = "temperature_max"),
            @Provider(name = ProviderName.APIXU, property = "maxtemp_c"),
            @Provider(name = ProviderName.WEATHERBIT, property = "max_temp") })
    private Double max;

    @ProviderMappings({ @Provider(name = ProviderName.FORECASTIO, property = "apparentTemperature"),
            @Provider(name = ProviderName.HAMWEATHER, property = "feelslikeC"),
            @Provider(name = ProviderName.APIXU, property = "feelslike_c"),
            @Provider(name = ProviderName.WEATHERBIT, property = "app_temp") })
    private Double feel;

    @ProviderMappings({ @Provider(name = ProviderName.FORECASTIO, property = "dewPoint"),
            @Provider(name = ProviderName.HAMWEATHER, property = "dewpointC"),
            @Provider(name = ProviderName.WORLDWEATHERONLINE, property = "DewPointC"),
            @Provider(name = ProviderName.WEATHERBIT, property = "dewpt") })
    private Double dewpoint;

    /**
     * Returns the current temperature in degrees.
     */
    public Double getCurrent() {
        return current;
    }

    /**
     * Sets the current temperature in degrees.
     */
    public void setCurrent(Double current) {
        this.current = current;
    }

    /**
     * Returns the min forecast temperature in degrees.
     */
    public Double getMin() {
        return min;
    }

    /**
     * Sets the min forecast temperature in degrees.
     */
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * Returns the max forecast temperature in degrees.
     */
    public Double getMax() {
        return max;
    }

    /**
     * Sets the min forecast temperature in degrees.
     */
    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * Returns the current feels like temperature in degrees.
     */
    public Double getFeel() {
        return feel;
    }

    /**
     * Sets the current feels like temperature in degrees.
     */
    public void setFeel(Double feel) {
        this.feel = feel;
    }

    /**
     * Returns the dewpoint in degrees.
     */
    public Double getDewpoint() {
        return dewpoint;
    }

    /**
     * Sets the dewpoint in degrees.
     */
    public void setDewpoint(Double dewpoint) {
        this.dewpoint = dewpoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("current", current).append("min", min)
                .append("max", max).append("feel", feel).append("dewpoint", dewpoint).toString();
    }
}
