package org.apache.maven.model;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import junit.framework.TestCase;

/**
 * Tests {@code Model}.
 * 
 * @author Benjamin Bentmann
 * @version $Id: ModelTest.java 793311 2009-07-12 10:29:57Z bentmann $
 */
public class ModelTest
    extends TestCase
{

    public void testHashCodeNullSafe()
    {
        new Model().hashCode();
    }

    public void testEqualsNullSafe()
    {
        assertFalse( new Model().equals( null ) );

        new Model().equals( new Model() );
    }

    public void testEqualsIdentity()
    {
        Model thing = new Model();
        assertTrue( thing.equals( thing ) );
    }

    public void testToStringNullSafe()
    {
        assertNotNull( new Model().toString() );
    }

}
