/*
 * Copyright 2017 Pronghorn Technology LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tech.pronghorn.plugins

import org.jctools.queues.MpscArrayQueue
import org.jctools.queues.MpscUnboundedArrayQueue
import tech.pronghorn.plugins.mpscQueue.MpscQueuePlugin
import java.util.Queue

object JCToolsMpscQueuePlugin : MpscQueuePlugin {
    override fun <T> getBounded(capacity: Int): Queue<T> = MpscArrayQueue(capacity)

    override fun <T> getUnbounded(): Queue<T> = MpscUnboundedArrayQueue(1024)
}
