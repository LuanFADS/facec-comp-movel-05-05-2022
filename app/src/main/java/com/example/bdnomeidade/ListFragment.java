package com.example.bdnomeidade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View v = inflater.inflate(R.layout.content_list, container, false);

        //AQUI VAI O CÓDIGO DO BANCO DE DADOS QUE VAI FAZER DEPOIS
        return v;
    }
}
