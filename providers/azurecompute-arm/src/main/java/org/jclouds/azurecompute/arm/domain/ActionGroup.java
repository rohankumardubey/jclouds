/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.azurecompute.arm.domain;

import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ActionGroup {
	@Nullable
	public abstract String actionGroupId();

	@Nullable
	public abstract Object webhookProperties();

	@SerializedNames({ "actionGroupId", "webhookProperties" })
	public static ActionGroup create(final String actionGroupId, final Object webhookProperties) {
		return builder().actionGroupId(actionGroupId).webhookProperties(webhookProperties).build();
	}

	public abstract Builder toBuilder();

	public static Builder builder() {
		return new AutoValue_ActionGroup.Builder();
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder actionGroupId(String actionGroupId);

		public abstract Builder webhookProperties(Object webhookProperties);

		public abstract ActionGroup build();

	}
}
