/*
 * Copyright (c) 2013, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.webkit.dom;

import org.w3c.dom.html.HTMLOListElement;

public class HTMLOListElementImpl extends HTMLElementImpl implements HTMLOListElement {
    HTMLOListElementImpl(long peer) {
        super(peer);
    }

    static HTMLOListElement getImpl(long peer) {
        return (HTMLOListElement)create(peer);
    }


// Attributes
    @Override
    public boolean getCompact() {
        return getCompactImpl(getPeer());
    }
    native static boolean getCompactImpl(long peer);

    @Override
    public void setCompact(boolean value) {
        setCompactImpl(getPeer(), value);
    }
    native static void setCompactImpl(long peer, boolean value);

    @Override
    public int getStart() {
        return getStartImpl(getPeer());
    }
    native static int getStartImpl(long peer);

    @Override
    public void setStart(int value) {
        setStartImpl(getPeer(), value);
    }
    native static void setStartImpl(long peer, int value);

    public boolean getReversed() {
        return getReversedImpl(getPeer());
    }
    native static boolean getReversedImpl(long peer);

    public void setReversed(boolean value) {
        setReversedImpl(getPeer(), value);
    }
    native static void setReversedImpl(long peer, boolean value);

    @Override
    public String getType() {
        return getTypeImpl(getPeer());
    }
    native static String getTypeImpl(long peer);

    @Override
    public void setType(String value) {
        setTypeImpl(getPeer(), value);
    }
    native static void setTypeImpl(long peer, String value);

}

