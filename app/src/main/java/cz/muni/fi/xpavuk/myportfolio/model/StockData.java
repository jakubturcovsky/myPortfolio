package cz.muni.fi.xpavuk.myportfolio.model;

/**
 * author: Tomas Pavuk
 * date: 29.4.2018
 */
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class StockData extends RealmObject {

    @SerializedName("1. open")
    Double open;
    @SerializedName("2. high")
    Double high;
    @SerializedName("3. low")
    Double low;
    @SerializedName("4. close")
    Double close;
    @SerializedName("5. volume")
    Double volume;


    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}