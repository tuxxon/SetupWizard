package com.touchizen.setupwizard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.setupwizardlib.SetupWizardListLayout;
import com.android.setupwizardlib.view.NavigationBar;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Meiji on 2017/9/9.
 */

public class ThirdActivity extends AppCompatActivity {

    SetupWizardListLayout layout;
    Integer[] integers = {0, 1, 2, 3, 4, 5, 6, 7};
    List<Integer> items = Arrays.asList(integers);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        layout = findViewById(R.id.setup);

        ArrayAdapter<Integer> itemsAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        layout.setAdapter(itemsAdapter);
        layout.setHeaderText("SetupWizardListLayout");
        layout.setIllustration(getResources().getDrawable(R.drawable.bg2));
        layout.setIllustrationAspectRatio(4f);
        layout.getNavigationBar().setNavigationBarListener(new NavigationBar.NavigationBarListener() {
            @Override
            public void onNavigateBack() {
                onBackPressed();
            }

            @Override
            public void onNavigateNext() {
                startActivity(new Intent(ThirdActivity.this, SecondActivity.class));
            }
        });
    }
}
