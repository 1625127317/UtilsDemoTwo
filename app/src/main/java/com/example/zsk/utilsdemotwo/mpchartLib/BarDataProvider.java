package com.example.zsk.utilsdemotwo.mpchartLib;

import com.example.zsk.utilsdemotwo.mpchartLib.BarLineScatterCandleBubbleDataProvider;

public interface BarDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BarData getBarData();
    boolean isDrawBarShadowEnabled();
    boolean isDrawValueAboveBarEnabled();
    boolean isHighlightFullBarEnabled();
}
