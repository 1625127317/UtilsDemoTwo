package com.example.zsk.utilsdemotwo.other;

import com.example.zsk.utilsdemotwo.mpchartLib.AxisBase;
import com.example.zsk.utilsdemotwo.mpchartLib.Entry;
import com.example.zsk.utilsdemotwo.mpchartLib.IAxisValueFormatter;
import com.example.zsk.utilsdemotwo.mpchartLib.IValueFormatter;
import com.example.zsk.utilsdemotwo.mpchartLib.ViewPortHandler;

import java.text.DecimalFormat;

/**
 * This IValueFormatter is just for convenience and simply puts a "%" sign after
 * each value. (Recommeded for PieChart)
 *
 * @author Philipp Jahoda
 */
public class PercentFormatter implements IValueFormatter, IAxisValueFormatter
{

    protected DecimalFormat mFormat;

    public PercentFormatter() {
        mFormat = new DecimalFormat("###,###,##0.0");
    }

    /**
     * Allow a custom decimalformat
     *
     * @param format
     */
    public PercentFormatter(DecimalFormat format) {
        this.mFormat = format;
    }

    // IAxisValueFormatter
    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        return mFormat.format(value) + " %";
    }

    public int getDecimalDigits() {
        return 1;
    }

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return mFormat.format(value) + " %";
    }
}
