package com.example.zsk.utilsdemotwo.other;

import com.example.zsk.utilsdemotwo.mpchartLib.YAxis;

import java.text.DecimalFormat;

public class MyYValueFormatter implements YAxisValueFormatter {

    private DecimalFormat mFormat;

    public MyYValueFormatter() {
        mFormat = new DecimalFormat("###,###,###,##0");
    }

    @Override
    public String getFormattedValue(float value, YAxis yAxis) {
        return mFormat.format(value);
    }
}
