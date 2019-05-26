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
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word(getString(R.string.One),"lutti"));
        words.add(new Word(getString(R.string.Two), "otiiko"));
        words.add(new Word(getString(R.string.Three),"lolookosu"));
        words.add(new Word(getString(R.string.Four),"oyyisa"));
        words.add(new Word(getString(R.string.Five),"massokka"));
        words.add(new Word(getString(R.string.Six), "temmokka"));
        words.add(new Word(getString(R.string.Seven),"kenekaku"));
        words.add(new Word(getString(R.string.Eight),"kawinta"));
        words.add(new Word(getString(R.string.Nine),"wo'e"));
        words.add(new Word(getString(R.string.Ten),"na'aacha"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
