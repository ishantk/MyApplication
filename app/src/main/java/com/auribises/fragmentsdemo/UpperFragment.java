package com.auribises.fragmentsdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpperFragment extends Fragment implements View.OnClickListener{


    Button btnSubmit;
    EditText eTxtName;


    public UpperFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = null;

        view =  inflater.inflate(R.layout.fragment_upper, container, false);

        btnSubmit = (Button)view.findViewById(R.id.button);
        eTxtName = (EditText)view.findViewById(R.id.editText);

        btnSubmit.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id == R.id.button){
            //Toast.makeText(getContext(),"You Clicked Button: "+eTxtName.getText().toString(),Toast.LENGTH_LONG).show();
            Toast.makeText(getActivity(),"You Clicked Button: "+eTxtName.getText().toString(),Toast.LENGTH_LONG).show();
        }
    }
}
