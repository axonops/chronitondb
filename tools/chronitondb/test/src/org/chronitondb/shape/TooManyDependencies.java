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

import java.util.BitSet;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Dictionary;
import java.util.EnumMap;
import java.util.Formatter;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Stack;
import java.util.StringJoiner;
import java.util.Timer;
import java.util.TimeZone;
import java.util.UUID;
import java.util.Vector;

/**
 * Fixture for shape-check.sh --self-test: a class that depends on 24 other classes, the limit is 20.
 */
public class TooManyDependencies
{
    private BitSet f0;
    private Calendar f1;
    private Comparator f2;
    private Currency f3;
    private Date f4;
    private Dictionary f5;
    private EnumMap f6;
    private Formatter f7;
    private Hashtable f8;
    private IdentityHashMap f9;
    private Iterator f10;
    private ListIterator f11;
    private Locale f12;
    private PriorityQueue f13;
    private Properties f14;
    private Random f15;
    private Scanner f16;
    private Spliterator f17;
    private Stack f18;
    private StringJoiner f19;
    private Timer f20;
    private TimeZone f21;
    private UUID f22;
    private Vector f23;
}
