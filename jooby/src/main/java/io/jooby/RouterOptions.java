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
package io.jooby;

/**
 * Router options.
 *
 * <pre>{@code
 *  {
 *    setRouterOptions(new RouterOptions()
 *        .setCaseSensitive(false)
 *    )
 *  }
 * }</pre>
 *
 * @author edgar
 * @since 2.0.0
 */
public class RouterOptions {
  private boolean caseSensitive = true;

  private boolean ignoreTrailingSlash = true;

  /**
   * Indicates whenever routing algorithm does case-sensitive matching or not on path pattern.
   * This flag is on by default, so <code>/FOO</code> and <code>/foo</code> are not the same.
   *
   * @return Whenever do case-sensitive matching.
   */
  public boolean isCaseSensitive() {
    return caseSensitive;
  }

  /**
   * Turn on/off case-sensitive matching.
   *
   * @param caseSensitive True for case-sensitive matching.
   * @return This options.
   */
  public RouterOptions setCaseSensitive(boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * Indicates whenever a trailing slash is ignored or not. This enabled by default so <code>/foo</code>
   * and <code>/foo/</code> represent the same route/handler.
   *
   * @return Whenever trailing slash on path pattern is ignored.
   */
  public boolean isIgnoreTrailingSlash() {
    return ignoreTrailingSlash;
  }

  /**
   * Turn on/off support for trailing slash.
   *
   * @param ignoreTrailingSlash True for turning on.
   * @return This options.
   */
  public RouterOptions setIgnoreTrailingSlash(boolean ignoreTrailingSlash) {
    this.ignoreTrailingSlash = ignoreTrailingSlash;
    return this;
  }
}
