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
 * Fixture for shape-check.sh --self-test: cognitive complexity 18 in a test, the limit is 15, a warning only.
 */
public class CognitiveTest
{
    public int hits(boolean[] flags, int rounds)
    {
        int hits = 0;
        for (int round = 0; round < rounds; round++)
        {
            if (flags[0])
            {
                if (flags[1])
                {
                    if (flags[2])
                        hits++;
                }
            }
            while (hits < rounds)
            {
                if (flags[3])
                    hits++;
                if (flags[4])
                    hits += 2;
            }
        }
        return hits;
    }
}
