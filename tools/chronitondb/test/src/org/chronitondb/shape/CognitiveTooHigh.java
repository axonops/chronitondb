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
 * Fixture for shape-check.sh --self-test: cognitive complexity 18, the limit is 15, with cyclomatic complexity 8 and NPath 21.
 */
public class CognitiveTooHigh
{
    public int count(boolean[] f, int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (f[0])
            {
                if (f[1])
                {
                    if (f[2])
                        count++;
                }
            }
            while (count < n)
            {
                if (f[3])
                    count++;
                if (f[4])
                    count += 2;
            }
        }
        return count;
    }
}
