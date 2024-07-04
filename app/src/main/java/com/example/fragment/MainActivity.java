package com.example.fragment;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.btn_frag);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            {

                replaceFragment(new Fragment());

                btn.setVisibility(View.GONE);
            }
        });
    }


    public void replaceFragment(Fragment fragment)
    {
        androidx.fragment.app
                .FragmentManager fragmentManager
                = getSupportFragmentManager();

        androidx.fragment.app
                .FragmentTransaction fragmentTransaction
                = fragmentManager.beginTransaction();


        fragmentTransaction.replace(R.id.frame_layout,
                fragment);

        fragmentTransaction.commit();
    }
}

