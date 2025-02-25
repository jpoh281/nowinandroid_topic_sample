/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.core.network

import com.google.samples.apps.nowinandroid.core.network.model.NetworkAuthor
import com.google.samples.apps.nowinandroid.core.network.model.NetworkNewsResource
import com.google.samples.apps.nowinandroid.core.network.model.NetworkTopic

/**
 * Interface representing network calls to the NIA backend
 */
interface NiANetwork {
    suspend fun getTopics(itemsPerPage: Int = 200): List<NetworkTopic>

    suspend fun getAuthors(itemsPerPage: Int = 200): List<NetworkAuthor>

    suspend fun getNewsResources(itemsPerPage: Int = 200): List<NetworkNewsResource>
}
