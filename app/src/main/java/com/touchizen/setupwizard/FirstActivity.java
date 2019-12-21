package com.touchizen.setupwizard;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.setupwizardlib.SetupWizardLayout;
import com.android.setupwizardlib.view.NavigationBar;


/**
 * Created by Meiji on 2017/9/9.
 */

public class FirstActivity extends AppCompatActivity {

    SetupWizardLayout layout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        layout = findViewById(R.id.setup);

        layout.setHeaderText("Tap & Go");
        layout.setIllustration(getResources().getDrawable(R.drawable.bg1));
        layout.setIllustrationAspectRatio(4f);
        layout.getNavigationBar().setNavigationBarListener(new NavigationBar.NavigationBarListener() {
            @Override
            public void onNavigateBack() {
                onBackPressed();
            }

            @Override
            public void onNavigateNext() {
                startActivity(new Intent(FirstActivity.this,SecondActivity.class));
            }
        });
    }
}
