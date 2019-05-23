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

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        String[] numberWords = new String[10];
        numberWords[0]=getString(R.string.One);
        numberWords[1]=getString(R.string.Two);
        numberWords[2]=getString(R.string.Three);
        numberWords[3]=getString(R.string.Four);
        numberWords[4]=getString(R.string.Five);
        numberWords[5]=getString(R.string.Six);
        numberWords[6]=getString(R.string.Seven);
        numberWords[7]=getString(R.string.Eight);
        numberWords[8]=getString(R.string.Nine);
        numberWords[9]=getString(R.string.Ten);

    }
}
