// ============================================================================
//
// Copyright (C) 2006-2017 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.component.api.configuration.constraint;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collection;

import org.talend.component.api.configuration.constraint.meta.Validation;
import org.talend.component.api.meta.Documentation;

@Validation(expectedTypes = Collection.class, name = "uniqueItems")
@Target({ FIELD, PARAMETER })
@Retention(RUNTIME)
@Documentation("Ensure the elements of the collection must be distinct (kind of set).")
public @interface Uniques {
}