/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lealone.cluster.metrics;

import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.Counter;

/**
 * Metrics related to Storage.
 */
public class StorageMetrics {
    private static final MetricNameFactory factory = new DefaultNameFactory("Storage");

    public static final Counter load = Metrics.newCounter(factory.createMetricName("Load"));
    public static final Counter exceptions = Metrics.newCounter(factory.createMetricName("Exceptions"));
    public static final Counter totalHintsInProgress = Metrics.newCounter(factory.createMetricName("TotalHintsInProgress"));
    public static final Counter totalHints = Metrics.newCounter(factory.createMetricName("TotalHints"));
}
