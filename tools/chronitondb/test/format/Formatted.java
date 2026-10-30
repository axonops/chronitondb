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

/** Fixture for format-check.sh --self-test: a class already in Google Java Style. */
public class Formatted {
  private final List<String> names = new ArrayList<>();

  public void add(String name) {
    if (name != null) {
      names.add(name);
    }
  }

  public int size() {
    return names.size();
  }
}
