package kh.edu.rupp.ite.ite.preschool.UI.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kh.edu.rupp.ite.ite.preschool.R;
import kh.edu.rupp.ite.ite.preschool.UI.Activity.AbcActivity;
import kh.edu.rupp.ite.ite.preschool.UI.Activity.MainActivity;
import kh.edu.rupp.ite.ite.preschool.UI.Activity.NumberActivity;
import kh.edu.rupp.ite.ite.preschool.databinding.FragmentLearnBinding;


public class LearnFragment extends Fragment {
    private FragmentLearnBinding binding;
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        binding = FragmentLearnBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        binding.imgABC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToAbcActivity();
            }
        });

        binding.imgNumberEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            navigateToNumberActivity();
            }
        });



        return view;
    }


        private void navigateToAbcActivity() {
            Intent intent = new Intent(getActivity(), AbcActivity.class);
            startActivity(intent);
    }
        private void navigateToNumberActivity(){
        Intent num = new Intent(getActivity(), NumberActivity.class);
        startActivity(num);

        }

    private void firstActivity(){

    }






}
