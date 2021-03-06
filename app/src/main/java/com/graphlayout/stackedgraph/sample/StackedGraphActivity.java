package com.graphlayout.stackedgraph.sample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.graphlayout.stackedgraph.R;
import com.graphlayout.stackedgraph.graphfactory.StackGraphGenerator;
import com.graphlayout.stackedgraph.model.StackGraphModel;

import java.util.ArrayList;


public class StackedGraphActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_view);

        final RelativeLayout relativeLayout;
        relativeLayout = (RelativeLayout) findViewById(R.id.mainLayout);

        StackGraphModel stackGraphModel = new StackGraphModel();
        ArrayList xUpSeries = new ArrayList();
        xUpSeries.add(12);
        xUpSeries.add(24);
        xUpSeries.add(36);

        ArrayList xDownSeries = new ArrayList();
        xDownSeries.add(11);
        xDownSeries.add(22);
        xDownSeries.add(32);

        StackGraphGenerator stackgen = new StackGraphGenerator(context);
        relativeLayout.addView(stackgen.generateStackedGraph(stackGraphModel, xUpSeries, xDownSeries));

    }

}
