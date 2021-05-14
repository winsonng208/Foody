package com.example.foody.home.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.foody.R
import com.example.foody.database.FoodCourt

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //insert  foodcourt data in database

        val foodcourtList = ArrayList<FoodCourt>()

        foodcourtList.add(FoodCourt(0, 1, "China Town Food Court","Jalan Putra, Bandar Alor Setar, 05150 Alor Setar, Kedah", "Alor Setar"))
        foodcourtList.add(FoodCourt(0, 2, "Food Court Darul Aman", "Taman Mutiara, 05100 Alor Setar, Kedah", "Alor Setar"))
        foodcourtList.add(FoodCourt(0, 3, "Hai Tao Kee Food Court", "Jalan Dato' Wan Mat Saman, Taman Pesisiran Tanjung Chali, 05050 Alor Setar, Kedah", "Alor Setar"))
        foodcourtList.add(FoodCourt(0, 4, "River View Food Court", "610, Sultan Abdul Halim Highway, 05400 Alor Setar, Kedah", "Alor Setar"))
        foodcourtList.add(FoodCourt(0, 5, "Lot Seven Food Court", "Jalan Sekerat, Kampung Lubok Peringgi, 05100 Alor Setar, Kedah", "Alor Setar"))
        foodcourtList.add(FoodCourt(0, 6, "Esplande Park Food Court", "Jalan Padang Kota Lama, George Town, 10450 George Town, Pulau Pinang", "Goerge Town"))
        foodcourtList.add(FoodCourt(0, 7, "Fisherman's Wharf Food Corner Penang", "No 92A, Lbh Sungai Pinang 1, Sungai Pinang, 11600 Jelutong, Pulau Pinang", "Goerge Town"))

        for(i in 0 until foodcourtList.size){
            homeViewModel.insert(foodcourtList[i])
        }



        return view
    }


}