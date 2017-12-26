package com.example.zsk.utilsdemotwo.mpchartLib;

import com.example.zsk.utilsdemotwo.mpchartLib.BarLineScatterCandleBubbleData;
import com.example.zsk.utilsdemotwo.mpchartLib.ILineDataSet;

import java.util.List;

/**
 * Data object that encapsulates all data associated with a LineChart.
 *
 * @author Philipp Jahoda
 */
public class LineData extends BarLineScatterCandleBubbleData<ILineDataSet> {

    public LineData() {
        super();
    }

    public LineData(ILineDataSet... dataSets) {
        super(dataSets);
    }

    public LineData(List<ILineDataSet> dataSets) {
        super(dataSets);
    }
}
