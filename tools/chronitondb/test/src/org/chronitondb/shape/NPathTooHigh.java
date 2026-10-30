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

/**
 * Fixture for shape-check.sh --self-test: eight ifs in a row give NPath 256 with cyclomatic complexity 9.
 */
public class NPathTooHigh
{
    public int count(boolean[] flags)
    {
        int count = 0;
        if (flags[0])
            count++;
        if (flags[1])
            count++;
        if (flags[2])
            count++;
        if (flags[3])
            count++;
        if (flags[4])
            count++;
        if (flags[5])
            count++;
        if (flags[6])
            count++;
        if (flags[7])
            count++;
        return count;
    }
}
