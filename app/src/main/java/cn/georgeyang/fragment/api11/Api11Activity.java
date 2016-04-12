package cn.georgeyang.fragment.api11;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import cn.georgeyang.lib.api11.AnimType;
import cn.georgeyang.lib.api11.FragmentOnlySupportActivity;

/**
 * Created by george.yang on 2016-4-12.
 */
public class Api11Activity extends FragmentOnlySupportActivity {
    @Override
    public int getContainerId() {
        return android.R.id.background;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout rootView = new FrameLayout(this);
        rootView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        rootView.setId(android.R.id.background);
        setContentView(rootView);

        loadFragment(new Api11MainFragment(), AnimType.NONE);
    }
}
