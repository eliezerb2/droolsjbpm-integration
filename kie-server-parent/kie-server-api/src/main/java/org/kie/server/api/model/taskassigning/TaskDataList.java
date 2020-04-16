/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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

package org.kie.server.api.model.taskassigning;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.kie.internal.jaxb.LocalDateTimeXmlAdapter;
import org.kie.server.api.model.ItemList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "task-assigning-task-data-list")
public class TaskDataList implements ItemList<TaskData> {

    @XmlElement(name = "dataItems")
    private TaskData[] dataItems;

    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    @XmlElement(name = "local-date-time")
    private LocalDateTime queryTime;

    public TaskDataList() {
        //marshalling constructor
    }

    public TaskDataList(TaskData[] dataItems) {
        this.dataItems = dataItems;
    }

    public TaskDataList(List<TaskData> dataItems) {
        this.dataItems = dataItems != null ? dataItems.toArray(new TaskData[0]) : null;
    }

    public TaskData[] getDataItems() {
        return dataItems;
    }

    public void setDataItems(TaskData[] dataItems) {
        this.dataItems = dataItems;
    }

    @Override
    public List<TaskData> getItems() {
        if (dataItems == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(dataItems);
    }

    public LocalDateTime getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(LocalDateTime queryTime) {
        this.queryTime = queryTime;
    }

    @Override
    public String toString() {
        return "TaskDataList{" +
                "dataItems=" + Arrays.toString(dataItems) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskDataList)) {
            return false;
        }
        TaskDataList that = (TaskDataList) o;
        return Arrays.equals(dataItems, that.dataItems);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(dataItems);
    }
}
