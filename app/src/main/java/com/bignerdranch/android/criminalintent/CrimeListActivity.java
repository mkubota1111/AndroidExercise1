package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by mke6
 * on 8/2/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
