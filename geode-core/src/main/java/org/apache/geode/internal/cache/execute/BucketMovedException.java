/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.geode.internal.cache.execute;

import org.apache.geode.GemFireException;

public class BucketMovedException extends GemFireException {
  private static final long serialVersionUID = 4893171227542647452L;

  /**
   * Creates new function exception with given error message.
   * 
   * @param msg
   * @since GemFire 6.0
   */
  public BucketMovedException(String msg) {
    super(msg);
  }

  /**
   * Creates new function exception with given error message and optional nested exception.
   * 
   * @param msg
   * @param cause
   * @since GemFire 6.0
   */
  public BucketMovedException(String msg, Throwable cause) {
    super(msg, cause);
  }

  /**
   * Creates new function exception given throwable as a cause and source of error message.
   * 
   * @param cause
   * @since GemFire 6.0
   */
  public BucketMovedException(Throwable cause) {
    super(cause);
  }
}

