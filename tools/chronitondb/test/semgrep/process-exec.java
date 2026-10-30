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

// Semgrep self-test fixture for process-exec.yml, never compiled. Each
// "ruleid" line marks the next line as a finding the rule must report, each
// "ok" line one it must not report.
package org.chronitondb.selftest;

import java.util.List;

class ProcessExec
{
  void run(String input, List<String> command, Runtime runtime) throws Exception
  {
    // ruleid: chronitondb-runtime-exec-on-input
    Runtime.getRuntime().exec(input);
    // ruleid: chronitondb-runtime-exec-on-input
    runtime.exec(new String[] {"sh", "-c", input});
    // ok: chronitondb-runtime-exec-on-input
    Runtime.getRuntime().exec("uptime");
    // ruleid: chronitondb-process-builder-on-input
    new ProcessBuilder("ls", input).start();
    // ruleid: chronitondb-process-builder-on-input
    new ProcessBuilder(command).start();
    // ruleid: chronitondb-process-builder-on-input
    new ProcessBuilder().command(command);
    // ok: chronitondb-process-builder-on-input
    new ProcessBuilder("uptime").start();
  }
}
