package kh.edu.rupp.ite.ite.preschool.UI.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kh.edu.rupp.ite.ite.preschool.databinding.FragmentSettingBinding;
import kh.edu.rupp.ite.ite.preschool.databinding.FragmentVideosBinding;

public class SettingFragment extends Fragment {

  private FragmentSettingBinding binding;


    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        binding = FragmentSettingBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }


}
