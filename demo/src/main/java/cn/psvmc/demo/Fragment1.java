package cn.psvmc.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String LIST_TYPE = "type";

    // TODO: Rename and change types of parameters
    private String type;

    public static Fragment1 newInstance(String type) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(LIST_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            type = getArguments().getString(LIST_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        if (getArguments() != null) {
            type = getArguments().getString(LIST_TYPE);
            ((TextView)view.findViewById(R.id.fragment)).setText("页面"+type);
        }

        return view;
    }

}
