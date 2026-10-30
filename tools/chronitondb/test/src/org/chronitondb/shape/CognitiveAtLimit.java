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
 * Fixture for shape-check.sh --self-test: cognitive complexity of exactly 15, the limit, must not be reported.
 */
public class CognitiveAtLimit
{
    public int total(boolean[] on, int rounds)
    {
        int total = 0;
        for (int round = 0; round < rounds; round++)
        {
            if (on[0])
            {
                if (on[1])
                {
                    if (on[2])
                        total += 3;
                }
            }
            while (total < rounds)
            {
                if (on[3])
                    total += 3;
            }
        }
        return total;
    }
}
