//©2016 Casey Hayes & Tanner McIntyre. All Rights Reserved.

package chtm.objects;

import java.io.Serializable;

public class User implements Serializable{
    
    private String amount;
    private String rate;
    private String years;
    private String futureValue;

    public User() {
        amount = "";
        rate = "";
        years = "";
        futureValue = "";
    }

    public User(String amount, String rate, String years, String futureValue) {
        this.amount = amount;
        this.rate = rate;
        this.years = years;
        this.futureValue = futureValue;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }
    
     public String getFutureValue() {
        return futureValue;
    }

    public void setFutureValue(String futureValue) {
        this.futureValue = futureValue;
    }
}

