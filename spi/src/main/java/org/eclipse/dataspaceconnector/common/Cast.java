/*
 * Copyright (c) Microsoft Corporation.
 *  All rights reserved.
 *
 */

package org.eclipse.dataspaceconnector.common;

/**
 * Utility for performing typesafe casts.
 */
public class Cast {

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object type) {
        return (T) type;
    }
}