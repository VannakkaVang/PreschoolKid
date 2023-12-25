package kh.edu.rupp.ite.ite.preschool.UI.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import kh.edu.rupp.ite.ite.preschool.R;
import kh.edu.rupp.ite.ite.preschool.UI.Fragment.LearnFragment;
import kh.edu.rupp.ite.ite.preschool.databinding.ActivityAbcBinding;

public class AbcActivity extends AppCompatActivity {
    private ActivityAbcBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                binding = ActivityAbcBinding.inflate(getLayoutInflater());
                setContentView(binding.getRoot());
                setContentView(R.layout.activity_abc);

                binding.imgBackButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // Handle button click
                            loadYFragment();
                        }
                });
    }

    private void loadYFragment() {
        // Create a new instance of Fragment
        LearnFragment fragment = new LearnFragment();

        // Use FragmentManager to replace the current fragment with Fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.lytFragment, fragment)
                .addToBackStack(null)  //  Add the transaction to the back stack
                .commit();
    }


    
}