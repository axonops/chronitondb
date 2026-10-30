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

// Semgrep self-test fixture for banned-apis.yml, never compiled. Each
// "ruleid" line marks the next line as a finding the rule must report, each
// "ok" line one it must not report.
package org.chronitondb.selftest;

// ruleid: chronitondb-banned-import
import java.io.File;
// ruleid: chronitondb-banned-import
import java.util.concurrent.CompletableFuture;
// ruleid: chronitondb-banned-import
import junit.framework.TestCase;
// ok: chronitondb-banned-import
import java.util.concurrent.TimeUnit;

class BannedApis
{
  void calls(java.nio.file.Path path) throws Exception
  {
    // ruleid: chronitondb-banned-system-clock
    long a = System.currentTimeMillis();
    // ruleid: chronitondb-banned-system-clock
    long b = System.nanoTime();
    // ruleid: chronitondb-banned-instant-now
    Object c = Instant.now();
    // ruleid: chronitondb-banned-executors
    Object d = Executors.newFixedThreadPool(2);
    // ruleid: chronitondb-banned-direct-executor
    Object e = MoreExecutors.directExecutor();
    // ruleid: chronitondb-banned-instantiation
    Thread f = new Thread(() -> {});
    // ruleid: chronitondb-banned-instantiation
    Object g = new ObjectMapper();
    // ruleid: chronitondb-banned-instantiation
    Object h = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, null);
    // ruleid: chronitondb-banned-path-to-file
    Object i = path.toFile();
    // ruleid: chronitondb-banned-boxing-constructor
    Integer j = new Integer(1);
    // ruleid: chronitondb-banned-system-property
    String k = System.getProperty("cassandra.config");
    // ruleid: chronitondb-banned-system-property
    String l = System.getenv("HOME");
    // ruleid: chronitondb-banned-var
    var m = "text";
    // ok: chronitondb-banned-boxing-constructor
    Integer n = Integer.valueOf(1);
    // ruleid: chronitondb-banned-case-conversion
    String o = l.toLowerCase();
    // ok: chronitondb-banned-case-conversion
    String p = LocalizeString.toLowerCaseLocalized(l);
  }
}
