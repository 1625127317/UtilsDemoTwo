package com.example.zsk.utilsdemotwo.other;

import com.example.zsk.utilsdemotwo.mpchartLib.Entry;
import com.example.zsk.utilsdemotwo.mpchartLib.IValueFormatter;
import com.example.zsk.utilsdemotwo.mpchartLib.ViewPortHandler;

import java.text.DecimalFormat;

public class MyValueFormatter implements IValueFormatter
{

    private DecimalFormat mFormat;

    public MyValueFormatter() {
        mFormat = new DecimalFormat("###,###,###,##0.0");
    }

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return mFormat.format(value) + " $";
    }
}
