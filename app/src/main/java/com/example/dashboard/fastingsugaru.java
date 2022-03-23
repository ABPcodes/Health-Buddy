package com.example.dashboard;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class fastingsugaru {




String fastingsugardb;


    public fastingsugaru() {
    }

    public fastingsugaru(String fastingsugardb) {
        this.fastingsugardb = fastingsugardb;
    }

    public String getFastingsugardb() {
        return fastingsugardb;
    }

    public void setFastingsugardb(String fastingsugardb) {
        this.fastingsugardb = fastingsugardb;
    }
}
