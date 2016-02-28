package com.coded2.wearheartmonitor;

import android.app.Fragment;
import android.content.Context;
import android.app.FragmentManager;
import android.support.wearable.view.FragmentGridPagerAdapter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rogerio on 2/8/16.
 */
public class GridFragmentAdapter extends FragmentGridPagerAdapter {

    List<Row> rows;
    Context context;

    public GridFragmentAdapter(FragmentManager fm) {
        super(fm);
        rows = new ArrayList<Row>();
    }

    @Override
    public Fragment getFragment(int row, int col) {
        Row adapterRow = rows.get(row);
        return adapterRow.getColumn(col);
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount(int i) {
        return rows.get(i).getColumnCount();
    }

    public class Row {
        final List<Fragment> columns = new ArrayList<Fragment>();

        public Row(Fragment... fragments) {
            for (Fragment f : fragments) {
                add(f);
            }
        }

        public void add(Fragment f) {
            columns.add(f);
        }

        Fragment getColumn(int i) {
            return columns.get(i);
        }

        public int getColumnCount() {
            return columns.size();
        }
    }


    public void addRow(Fragment...frags)   {
        Row row = new Row(frags);
        rows.add(row);
    }
}
