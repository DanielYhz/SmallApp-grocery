package com.gohool.mygrocerylist.mygrocerylist.Model;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gohool.mygrocerylist.mygrocerylist.R;

public class ListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsanceState) {
        return inflater.inflate(R.layout.fragment_list,container, false);
    }
}
