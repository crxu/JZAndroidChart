package cn.jingzhuan.lib.chart.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;

import cn.jingzhuan.lib.chart.BaseChart;
import cn.jingzhuan.lib.chart.renderer.LineRenderer;
import cn.jingzhuan.lib.chart.value.Line;

/**
 * Created by Donglua on 17/7/19.
 */

public class LineChart extends BaseChart {
    public LineChart(Context context) {
        super(context);
    }

    public LineChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LineChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public LineChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void initChart() {
        super.initChart();

        mRenderer = new LineRenderer(this);

    }

    public void addLine(Line line) {

        line.setChart(this);

        mRenderer.addDataSet(line);
    }

    public void setLine(Line line) {
        mRenderer.getDataSet().clear();
        addLine(line);
    }
}
