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

package org.kie.server.services.taskassigning.planning.test.model;

import java.util.List;

import org.kie.server.services.taskassigning.user.system.api.Group;
import org.kie.server.services.taskassigning.user.system.api.User;
import org.kie.server.services.taskassigning.user.system.api.UserSystemService;

/**
 * Base test class for the UserSystemServiceLoaderTest
 */
public abstract class AbstractUserSystemService implements UserSystemService {

    protected String name;

    public AbstractUserSystemService(String name) {
        this.name = name;
    }

    @Override
    public void start() {

    }

    @Override
    public void test() throws Exception {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public List<Group> findAllGroups() {
        return null;
    }

    @Override
    public User findUser(String id) {
        return null;
    }
}
