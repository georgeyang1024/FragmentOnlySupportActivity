package cn.georgeyang.fragment.api11;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.georgeyang.fragment.R;
import cn.georgeyang.lib.api11.AnimType;
import cn.georgeyang.lib.api11.FragmentOnlySupportActivity;

/**
 * Created by george.yang on 2016-4-12.
 */
public class Api11MainFragment extends Fragment {
    FragmentOnlySupportActivity activity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,null);
        activity = (FragmentOnlySupportActivity) getActivity();
        view.findViewById(R.id.load).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.loadFragment(new Api11TestFragment(),AnimType.NONE);
            }
        });
        view.findViewById(R.id.load2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.loadFragment(new Api11TestFragment(), AnimType.ZoomFragment);
            }
        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.i("test","i'm main fragment,i got message:" + data.getStringExtra("data"));
    }
}
