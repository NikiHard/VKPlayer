/*
 * Copyright (C) 2016 IRA-Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.irateam.vkplayer.util.extension

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors

private val UI_HANDLER = Handler(Looper.getMainLooper())

//Should be configured
private val ASYNC_EXECUTOR = Executors.newFixedThreadPool(4)

fun runAsync(block: () -> Unit) {
    ASYNC_EXECUTOR.submit(block)
}

fun runOnUI(block: () -> Unit) {
    UI_HANDLER.post(block)
}