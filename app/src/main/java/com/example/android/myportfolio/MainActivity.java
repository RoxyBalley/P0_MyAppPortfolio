package com.example.android.myportfolio;

/**
 * Created by abs on 9/22/2016.
 */

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bind butterknife to this activity
        ButterKnife.bind(this);

    }

    @OnClick(R.id.home_popular_movies_button)
    public void popularMoviesButtonClicked() {
        showToast("Popular Movies");
    }

    @OnClick(R.id.home_stock_hawk_button)
    public void stockHawkButtonClicked() {
        showToast("Stock Hawk");
    }

    @OnClick(R.id.home_build_it_bigger_button)
    public void buildItBiggerButtonClicked() {
        showToast("Build It Bigger");
    }

    @OnClick(R.id.home_make_your_app_material_button)
    public void makeYourAppMaterialButtonClicked() {
        showToast("Make Your App Material");
    }

    @OnClick(R.id.home_go_ubiquitous_button)
    public void goUbiquitousButtonClicked() {
        showToast("Go Ubiquitous");
    }

    @OnClick(R.id.home_capstone_button)
    public void onCapstoneClick() {
        showToast("Capstone");
    }

    private void showToast(String appTitle) {
        String toastText = "This button will launch my " + appTitle + " app!";
        Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT).show();
    }

}
