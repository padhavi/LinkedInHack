package hk.ust.cse.comp107x.linkedinhack;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class home extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Home");
        myView = inflater.inflate(R.layout.home, container, false);
        return myView;

    }
}
