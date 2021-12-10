package com.kolin.applicationfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AboutmoneyFragment : Fragment() {
    lateinit var aboutmoneyRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_aboutmoney, container, false)

        val MoneyNames: List<String> = listOf(
            "1. U.S. Dollar (USD)",
            "2. European Euro (EUR)",
            "3. Japanese Yen (JPY)",
            "4. British Pound (GBP)",
            "5. Swiss Franc (CHF)",
            "6. Canadian Dollar (CAD)",
            "7. Australian/New Zealand Dollar",
            "8. South African Rand (ZAR)"
        )

        aboutmoneyRecyclerView = view.findViewById(R.id.about_money_recycler)
        aboutmoneyRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        aboutmoneyRecyclerView.adapter = MoneyAdapter(MoneyNames)


        return view
    }
}
