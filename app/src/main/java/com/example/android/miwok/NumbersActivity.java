/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> numberWords = new ArrayList<>();

        numberWords.add(getString(R.string.One));
        numberWords.add(getString(R.string.Two));
        numberWords.add(getString(R.string.Three));
        numberWords.add(getString(R.string.Four));
        numberWords.add(getString(R.string.Five));
        numberWords.add(getString(R.string.Six));
        numberWords.add(getString(R.string.Seven));
        numberWords.add(getString(R.string.Eight));
        numberWords.add(getString(R.string.Nine));
        numberWords.add(getString(R.string.Ten));

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, numberWords);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
