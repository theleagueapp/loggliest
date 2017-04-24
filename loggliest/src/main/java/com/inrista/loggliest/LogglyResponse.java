package com.inrista.loggliest;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shayla on 2017-04-24.
 */

public class LogglyResponse {
    @SerializedName("response")
    public String response;

    public boolean isSuccess() {

        try {
            return response.toLowerCase().equals("ok");
        } catch (Exception e) {
            // Oof.
        }

        return false;
    }
}
