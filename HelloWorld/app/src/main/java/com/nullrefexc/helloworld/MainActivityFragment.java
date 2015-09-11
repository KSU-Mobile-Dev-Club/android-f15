package com.nullrefexc.helloworld;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    TextView tvHelloWorld;
    EditText etSaySomething;
    Button buttonSaySomething;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);

        tvHelloWorld = (TextView) rootView.findViewById(R.id.textViewHelloWorld);
        etSaySomething = (EditText) rootView.findViewById(R.id.editTextHelloWorld);
        buttonSaySomething = (Button) rootView.findViewById(R.id.buttonSaySomething);

        buttonSaySomething.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextValue = etSaySomething.getText().toString();
                tvHelloWorld.setText(editTextValue);

                Toast.makeText(getActivity(), editTextValue, Toast.LENGTH_SHORT).show();
            }
        });


        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
