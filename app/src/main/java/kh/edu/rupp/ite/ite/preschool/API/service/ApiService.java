package kh.edu.rupp.ite.ite.preschool.API.service;

import java.util.List;

import kh.edu.rupp.ite.ite.preschool.API.model.Alphabet;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/abc_host/alphabets.json")
    static Call<List<Alphabet>> loadAlphabetList() {
        return null;
    }
}
