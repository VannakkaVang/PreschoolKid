package kh.edu.rupp.ite.ite.preschool.UI.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import kh.edu.rupp.ite.ite.preschool.databinding.FragmentVideosBinding;

public class VideosFragment extends Fragment {
    private FragmentVideosBinding binding;

    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        binding = FragmentVideosBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}
