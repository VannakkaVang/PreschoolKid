package kh.edu.rupp.ite.ite.preschool.UI.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kh.edu.rupp.ite.ite.preschool.R;
import kh.edu.rupp.ite.ite.preschool.UI.Fragment.LearnFragment;
import kh.edu.rupp.ite.ite.preschool.UI.Fragment.PLayFragment;
import kh.edu.rupp.ite.ite.preschool.UI.Fragment.SettingFragment;
import kh.edu.rupp.ite.ite.preschool.UI.Fragment.VideosFragment;
import kh.edu.rupp.ite.ite.preschool.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        showFragment(new LearnFragment());

         binding.bottomNavigationView.setOnItemSelectedListener(item -> {
             if(item.getItemId() == R.id.mnuLearn){
                 showFragment(new LearnFragment());
             }else if(item.getItemId() == R.id.mnuProfile){
                 showFragment(new SettingFragment());
             }else if(item.getItemId() == R.id.mnuPlay){
                 showFragment(new PLayFragment());
             }else{
                 showFragment(new VideosFragment());
             }
             return true;
         });
         
    }

    private void showFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lytFragment,fragment);
        fragmentTransaction.commit();

    }


    

}
