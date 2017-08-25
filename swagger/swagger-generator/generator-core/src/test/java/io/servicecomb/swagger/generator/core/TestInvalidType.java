/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.servicecomb.swagger.generator.core;

import org.junit.Test;

import io.servicecomb.swagger.generator.core.schema.InvalidType;
import io.servicecomb.swagger.generator.core.unittest.UnitTestSwaggerUtils;
import io.servicecomb.swagger.generator.pojo.PojoSwaggerGeneratorContext;

public class TestInvalidType {
  static SwaggerGeneratorContext context = new PojoSwaggerGeneratorContext();

  @Test
  public void testIntf() {
    UnitTestSwaggerUtils.testException(
        "generate operation swagger failed, io.servicecomb.swagger.generator.core.schema.InvalidType:testIntf",
        "[simple type, class io.servicecomb.swagger.generator.core.schema.InvalidType$InvalidIntf] is interface. Must be a concrete type.",
        context,
        InvalidType.class,
        "testIntf");
  }

  @Test
  public void testAbstractClass() {
    UnitTestSwaggerUtils.testException(
        "generate operation swagger failed, io.servicecomb.swagger.generator.core.schema.InvalidType:testAbstractClass",
        "[simple type, class io.servicecomb.swagger.generator.core.schema.InvalidType$InvalidClass] is abstract class. Must be a concrete type.",
        context,
        InvalidType.class,
        "testAbstractClass");
  }

  @Test
  public void testObject() {
    UnitTestSwaggerUtils.testException(
        "generate operation swagger failed, io.servicecomb.swagger.generator.core.schema.InvalidType:testObject",
        "java.lang.Object not support. Must be a concrete type.",
        context,
        InvalidType.class,
        "testObject");
  }

  @Test
  public void testNotClearList() {
    UnitTestSwaggerUtils.testException(
        "generate operation swagger failed, io.servicecomb.swagger.generator.core.schema.InvalidType:testNotClearList",
        "java.lang.Object not support. Must be a concrete type.",
        context,
        InvalidType.class,
        "testNotClearList");
  }

  @Test
  public void testNotClearSet() {
    UnitTestSwaggerUtils.testException(
        "generate operation swagger failed, io.servicecomb.swagger.generator.core.schema.InvalidType:testNotClearSet",
        "java.lang.Object not support. Must be a concrete type.",
        context,
        InvalidType.class,
        "testNotClearSet");
  }

  @Test
  public void testNotClearMap() {
    UnitTestSwaggerUtils.testException(
        "generate operation swagger failed, io.servicecomb.swagger.generator.core.schema.InvalidType:testNotClearMap",
        "java.lang.Object not support. Must be a concrete type.",
        context,
        InvalidType.class,
        "testNotClearMap");
  }

  @Test
  public void testInvalidFieldClass() {
    UnitTestSwaggerUtils.testException(
        "generate operation swagger failed, io.servicecomb.swagger.generator.core.schema.InvalidType:testInvalidFieldClass",
        "java.lang.Object not support. Must be a concrete type.",
        context,
        InvalidType.class,
        "testInvalidFieldClass");
  }
}
