/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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

package org.kie.server.services.taskassigning.planning.data;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.kie.server.api.model.taskassigning.TaskData;

/**
 * Example value extractor for the LabelValueExtractorRegistryTest.
 */
public class TestTaskDataLabelValueExtractor extends AbstractLabelValueExtractor<TaskData> {

    public static final String TEST_LABEL = "TEST_LABEL";
    public static final String EXAMPLE_LABEL_VALUE1 = "EXAMPLE_LABEL_VALUE1";

    public TestTaskDataLabelValueExtractor() {
        super(TaskData.class, TEST_LABEL, 1);
    }

    @Override
    public Set<Object> extract(TaskData source) {
        return new HashSet<>(Collections.singleton(EXAMPLE_LABEL_VALUE1));
    }
}
