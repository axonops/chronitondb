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
 * Fixture for shape-check.sh --self-test: cyclomatic complexity 11 from ten catch clauses, NPath stays at 11.
 */
public class CyclomaticTooHigh
{
    public int parse(String text)
    {
        try
        {
            return Integer.parseInt(text);
        }
        catch (IllegalArgumentException e)
        {
            return 0;
        }
        catch (IllegalStateException e)
        {
            return 1;
        }
        catch (ArithmeticException e)
        {
            return 2;
        }
        catch (ArrayStoreException e)
        {
            return 3;
        }
        catch (ClassCastException e)
        {
            return 4;
        }
        catch (NegativeArraySizeException e)
        {
            return 5;
        }
        catch (NullPointerException e)
        {
            return 6;
        }
        catch (NumberFormatException e)
        {
            return 7;
        }
        catch (UnsupportedOperationException e)
        {
            return 8;
        }
        catch (IndexOutOfBoundsException e)
        {
            return 9;
        }
    }
}
