package kh.edu.rupp.ite.ite.preschool.UI.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import kh.edu.rupp.ite.ite.preschool.R;
import kh.edu.rupp.ite.ite.preschool.UI.Fragment.LearnFragment;
import kh.edu.rupp.ite.ite.preschool.databinding.ActivityAbcBinding;
import kh.edu.rupp.ite.ite.preschool.databinding.ActivityNumberBinding;


public class NumberActivity extends AppCompatActivity {

    private ActivityNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_number);

        binding.imgBackButtonNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment();
            }
        });

    }

    private void loadFragment() {
        // Create a new instance of Fragment
        LearnFragment fragment = new LearnFragment();

        // Use FragmentManager to replace the current fragment with Fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.lytFragment, fragment)
                .addToBackStack(null)  //  Add the transaction to the back stack
                .commit();
    }
}