package com.ajmack.beatbox;

import android.support.v4.app.Fragment;

public class BeatBoxAcitivty extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}