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

package com.google.samples.apps.nowinandroid.feature.topic

import com.google.samples.apps.nowinandroid.feature.topic.TopicDestinationsArgs.TOPIC_ID_ARG
import com.google.samples.apps.nowinandroid.feature.topic.TopicScreens.TOPIC_SCREEN

object TopicDestinations {
    const val TOPICS_ROUTE = "topics"
    const val TOPIC_ROUTE = "$TOPIC_SCREEN/{$TOPIC_ID_ARG}"
}

object TopicDestinationsArgs {
    const val TOPIC_ID_ARG = "topicId"
}

object TopicScreens {
    const val TOPIC_SCREEN = "topic"
}
