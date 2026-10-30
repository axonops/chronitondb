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

// Semgrep self-test fixture for non-ascii-identifiers.yml, never compiled.
// Each "ruleid" line marks the next line as a finding the rule must report,
// each "ok" line one it must not report. The identifiers below start with
// CYRILLIC SMALL LETTER ER (U+0440) and CYRILLIC SMALL LETTER A (U+0430),
// which look like the Latin "p" and "a".
package org.chronitondb.selftest;

class NonAsciiIdentifiers
{
  // ruleid: chronitondb-non-ascii-identifier
  private String рassword = "secret";

  // ruleid: chronitondb-non-ascii-identifier
  boolean check(String аttempt)
  {
    // ok: chronitondb-non-ascii-identifier
    String greeting = "grüße, café, データ";
    // ok: chronitondb-non-ascii-identifier
    char accent = 'é';
    // ok: chronitondb-non-ascii-identifier
    String block = """
        naïve résumé
        """;
    // ok: chronitondb-non-ascii-identifier
    int count = 0; // compté, a comment
    /* ok: chronitondb-non-ascii-identifier */
    int other = 1; /* über */
    return greeting.equals(block) && accent != 'x' && count < other;
  }
}
