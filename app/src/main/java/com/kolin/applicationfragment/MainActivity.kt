package com.kolin.applicationfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "item"

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView

      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)
          bottomNavigationView = findViewById(R.id.bottom_navigation_menu)
          bottomNavigationView.setOnItemSelectedListener { item->

              var fragment:Fragment?=null
              when(item.itemId){
                  R.id.fragment_1->{
                      fragment=MoneyFragment()

                  }
                  R.id.fragment_2->{
                      fragment=AboutmoneyFragment()
                  }

              }
              replaceFragment(fragment!!)

              true
          }
        bottomNavigationView.selectedItemId = if (savedInstanceState!=null) savedInstanceState.getInt(
            LAST_SELECTED_ITEM) else R.id. fragment_1
      }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_SELECTED_ITEM,bottomNavigationView.selectedItemId)

    }
    fun replaceFragment(fragment: Fragment){
              supportFragmentManager
             .beginTransaction()
             .replace(R.id.fragment_container, fragment)
             .commit()  }


}





















   // */
   // lateinit var bottomNavigationMenu: BottomNavigationView


  //  override fun onCreate(savedInstanceState: Bundle?) {
    //    super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)
//
  //      bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)
//
  //      bottomNavigationMenu.setOnItemSelectedListener { item ->
    //        var fragment: Fragment? =null
      //    /  when (item.itemId) {
       // /  //      R.id.fragment_1 -> {
         ///           fragment = AboutmoneyFragment()
          //      }
         // / /     R.id.fragment_2 -> {
         // /  /        fragment = SecondFragment()
             //   }

             //   R.id.fragment_3 -> {
          //          fragment = ThirdFragment()
            //    }

         //   }
       //     replaceFragment(fragment!!)

      //      true
//
      //      }


  //  }
  //  fun replaceFragment(fragment: Fragment){
  //      supportFragmentManager
       //     .beginTransaction()
       //     .replace(R.id.fragment_container, fragment)
        //    .addToBackStack(fragment.tag)
         //   .commit()

