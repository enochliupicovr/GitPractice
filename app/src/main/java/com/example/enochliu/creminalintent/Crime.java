package com.example.enochliu.creminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by enoch.liu on 2017/6/19.
 */
public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime()
    {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public UUID getId() {
        return mID;
    }

    public void setTitle(String title) {

        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
