/*
 * Copyright 2026 AxonOps Limited
 * SPDX-License-Identifier: Apache-2.0
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

package org.chronitondb.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Fixture for shape-check.sh --self-test: one half of a duplicated block shared with the other DuplicateTest fixture, a warning only.
 */
public class DuplicateATest
{
    private final List<String> rows = new ArrayList<>();

    public void load()
    {
        rows.add("r-1");
        rows.add("r-2");
        rows.add("r-3");
        rows.add("r-4");
        rows.add("r-5");
        rows.add("r-6");
        rows.add("r-7");
        rows.add("r-8");
        rows.add("r-9");
        rows.add("r-10");
        rows.add("r-11");
        rows.add("r-12");
        rows.add("r-13");
        rows.add("r-14");
    }
}
