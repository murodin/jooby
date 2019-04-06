/**
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
 *
 * Copyright 2014 Edgar Espina
 */
package io.jooby.di;

import io.jooby.Registry;
import org.jboss.weld.environment.se.WeldContainer;

import javax.annotation.Nonnull;
import javax.enterprise.inject.literal.NamedLiteral;

import static javax.enterprise.inject.Any.Literal.INSTANCE;

public class WeldRegistry implements Registry {

  private WeldContainer container;

  public WeldRegistry(WeldContainer container) {
    this.container = container;
  }

  @Nonnull @Override public <T> T require(@Nonnull Class<T> type) {

    return container.select(type, INSTANCE).get();
  }

  @Nonnull @Override public <T> T require(@Nonnull Class<T> type, @Nonnull String name) {
    return container.select(type, NamedLiteral.of(name)).get();
  }
}