package cn.georgeyang.fragment.api11;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import cn.georgeyang.fragment.R;
import cn.georgeyang.lib.api11.FragmentOnlySupportActivity;

/**
 * Created by george.yang on 2016-4-12.
 */
public class Api11TestFragment extends Fragment {
    FragmentOnlySupportActivity activity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test,null);
        activity = (FragmentOnlySupportActivity) getActivity();
        view.findViewById(R.id.push).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data","this is data!");
                activity.pushMsgToSubFragments(false,123,intent);
                Toast.makeText(getActivity(),"push ok!",Toast.LENGTH_SHORT).show();
            }
        });
        view.findViewById(R.id.remove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.removeFragment(Api11MainFragment.class);
                Toast.makeText(getActivity(),"remove done!",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.i("test","i'm api11 test,i got message:" + data.getStringExtra("data"));
    }
}
