/*
 * Copyright (C) 2020 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dagger.hilt.android.testing;

import android.app.Application;
import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * An annotation that creates an application with the given base type that can be used for any
 * test in the given build.
 *
 * <p>This annotation is useful for creating an application that can be used with instrumentation
 * tests in gradle, since every instrumentation test must share the same application type.
 *
 * <p>This annotation cannot be used within the same build as {@link CustomBaseTestApplication},
 * which is used to set the base application type for a single test.
 */
@Target({ElementType.TYPE})
@GeneratesRootInput
public @interface MergedTestApplication {

  /** Returns the base {@link Application} class. */
  Class<? extends Application> value();
}
