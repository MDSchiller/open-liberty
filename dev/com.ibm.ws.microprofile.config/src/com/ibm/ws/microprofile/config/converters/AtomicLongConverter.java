/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.microprofile.config.converters;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 */
public class AtomicLongConverter extends BuiltInConverter {

    public AtomicLongConverter() {
        super(AtomicLong.class);
    }

    /** {@inheritDoc} */
    @Override
    public AtomicLong convert(String value) {
        if (value == null) {
            return null;
        }
        return new AtomicLong(Long.parseLong(value));
    }
}
