/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/audit/audit_log.proto

package com.google.cloud.audit;

public interface OrgPolicyViolationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.audit.OrgPolicyViolationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Resource payload that is currently in scope and is subjected to orgpolicy
   * conditions. This payload may be the subset of the actual Resource that may
   * come in the request. This payload should not contain any core content.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Optional. Resource payload that is currently in scope and is subjected to orgpolicy
   * conditions. This payload may be the subset of the actual Resource that may
   * come in the request. This payload should not contain any core content.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   *
   *
   * <pre>
   * Optional. Resource payload that is currently in scope and is subjected to orgpolicy
   * conditions. This payload may be the subset of the actual Resource that may
   * come in the request. This payload should not contain any core content.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Resource type that the orgpolicy is checked against.
   * Example: compute.googleapis.com/Instance, store.googleapis.com/bucket
   * </pre>
   *
   * <code>string resource_type = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The resourceType.
   */
  java.lang.String getResourceType();
  /**
   *
   *
   * <pre>
   * Optional. Resource type that the orgpolicy is checked against.
   * Example: compute.googleapis.com/Instance, store.googleapis.com/bucket
   * </pre>
   *
   * <code>string resource_type = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for resourceType.
   */
  com.google.protobuf.ByteString getResourceTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Tags referenced on the resource at the time of evaluation. These also
   * include the federated tags, if they are supplied in the CheckOrgPolicy
   * or CheckCustomConstraints Requests.
   * Optional field as of now. These tags are the Cloud tags that are
   * available on the resource during the policy evaluation and will
   * be available as part of the OrgPolicy check response for logging purposes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_tags = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getResourceTagsCount();
  /**
   *
   *
   * <pre>
   * Optional. Tags referenced on the resource at the time of evaluation. These also
   * include the federated tags, if they are supplied in the CheckOrgPolicy
   * or CheckCustomConstraints Requests.
   * Optional field as of now. These tags are the Cloud tags that are
   * available on the resource during the policy evaluation and will
   * be available as part of the OrgPolicy check response for logging purposes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_tags = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsResourceTags(java.lang.String key);
  /** Use {@link #getResourceTagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getResourceTags();
  /**
   *
   *
   * <pre>
   * Optional. Tags referenced on the resource at the time of evaluation. These also
   * include the federated tags, if they are supplied in the CheckOrgPolicy
   * or CheckCustomConstraints Requests.
   * Optional field as of now. These tags are the Cloud tags that are
   * available on the resource during the policy evaluation and will
   * be available as part of the OrgPolicy check response for logging purposes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_tags = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getResourceTagsMap();
  /**
   *
   *
   * <pre>
   * Optional. Tags referenced on the resource at the time of evaluation. These also
   * include the federated tags, if they are supplied in the CheckOrgPolicy
   * or CheckCustomConstraints Requests.
   * Optional field as of now. These tags are the Cloud tags that are
   * available on the resource during the policy evaluation and will
   * be available as part of the OrgPolicy check response for logging purposes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_tags = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */

  /* nullable */
  java.lang.String getResourceTagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Tags referenced on the resource at the time of evaluation. These also
   * include the federated tags, if they are supplied in the CheckOrgPolicy
   * or CheckCustomConstraints Requests.
   * Optional field as of now. These tags are the Cloud tags that are
   * available on the resource during the policy evaluation and will
   * be available as part of the OrgPolicy check response for logging purposes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_tags = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getResourceTagsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Policy violations
   * </pre>
   *
   * <code>
   * repeated .google.cloud.audit.ViolationInfo violation_info = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.audit.ViolationInfo> getViolationInfoList();
  /**
   *
   *
   * <pre>
   * Optional. Policy violations
   * </pre>
   *
   * <code>
   * repeated .google.cloud.audit.ViolationInfo violation_info = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.audit.ViolationInfo getViolationInfo(int index);
  /**
   *
   *
   * <pre>
   * Optional. Policy violations
   * </pre>
   *
   * <code>
   * repeated .google.cloud.audit.ViolationInfo violation_info = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getViolationInfoCount();
  /**
   *
   *
   * <pre>
   * Optional. Policy violations
   * </pre>
   *
   * <code>
   * repeated .google.cloud.audit.ViolationInfo violation_info = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.audit.ViolationInfoOrBuilder>
      getViolationInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Policy violations
   * </pre>
   *
   * <code>
   * repeated .google.cloud.audit.ViolationInfo violation_info = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.audit.ViolationInfoOrBuilder getViolationInfoOrBuilder(int index);
}
