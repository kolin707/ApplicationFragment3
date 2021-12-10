package com.kolin.applicationfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlin.random.Random


class MoneyFragment : Fragment() {
    lateinit var moneyImageView: ImageView
    lateinit var putButton: Button

    private val moneyImageList: List<Int> = listOf(
        R.drawable.obverse,
        R.drawable.reverse
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_money, container, false)


        moneyImageView = view.findViewById(R.id.money_image_view)
        putButton = view.findViewById(R.id.put_button)

        putButton.setOnClickListener {
            val randomInt = Random.nextInt ( 1, 2)
            moneyImageView.setImageResource(moneyImageList.random())
        }


        return view    }
}
