package com.tct.crimerecord;

import android.support.v4.app.Fragment;

/**
 * Created by tct on 16/8/2.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
