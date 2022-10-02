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
// source: google/api/consumer.proto

package com.google.api;

/**
 *
 *
 * <pre>
 * A descriptor for defining project properties for a service. One service may
 * have many consumer projects, and the service may want to behave differently
 * depending on some properties on the project. For example, a project may be
 * associated with a school, or a business, or a government agency, a business
 * type property on the project may affect how a service responds to the client.
 * This descriptor defines which properties are allowed to be set on a project.
 * Example:
 *    project_properties:
 *      properties:
 *      - name: NO_WATERMARK
 *        type: BOOL
 *        description: Allows usage of the API without watermarks.
 *      - name: EXTENDED_TILE_CACHE_PERIOD
 *        type: INT64
 * </pre>
 *
 * Protobuf type {@code google.api.ProjectProperties}
 */
public final class ProjectProperties extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.ProjectProperties)
    ProjectPropertiesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProjectProperties.newBuilder() to construct.
  private ProjectProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProjectProperties() {
    properties_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProjectProperties();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.ConsumerProto.internal_static_google_api_ProjectProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.ConsumerProto
        .internal_static_google_api_ProjectProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.ProjectProperties.class, com.google.api.ProjectProperties.Builder.class);
  }

  public static final int PROPERTIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.api.Property> properties_;
  /**
   *
   *
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.Property> getPropertiesList() {
    return properties_;
  }
  /**
   *
   *
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.PropertyOrBuilder> getPropertiesOrBuilderList() {
    return properties_;
  }
  /**
   *
   *
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  @java.lang.Override
  public int getPropertiesCount() {
    return properties_.size();
  }
  /**
   *
   *
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  @java.lang.Override
  public com.google.api.Property getProperties(int index) {
    return properties_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  @java.lang.Override
  public com.google.api.PropertyOrBuilder getPropertiesOrBuilder(int index) {
    return properties_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < properties_.size(); i++) {
      output.writeMessage(1, properties_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < properties_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, properties_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.ProjectProperties)) {
      return super.equals(obj);
    }
    com.google.api.ProjectProperties other = (com.google.api.ProjectProperties) obj;

    if (!getPropertiesList().equals(other.getPropertiesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPropertiesCount() > 0) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getPropertiesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.ProjectProperties parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.ProjectProperties parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.ProjectProperties parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.ProjectProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.ProjectProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.ProjectProperties parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.ProjectProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.ProjectProperties parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.ProjectProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.ProjectProperties parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.ProjectProperties parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.ProjectProperties parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.api.ProjectProperties prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A descriptor for defining project properties for a service. One service may
   * have many consumer projects, and the service may want to behave differently
   * depending on some properties on the project. For example, a project may be
   * associated with a school, or a business, or a government agency, a business
   * type property on the project may affect how a service responds to the client.
   * This descriptor defines which properties are allowed to be set on a project.
   * Example:
   *    project_properties:
   *      properties:
   *      - name: NO_WATERMARK
   *        type: BOOL
   *        description: Allows usage of the API without watermarks.
   *      - name: EXTENDED_TILE_CACHE_PERIOD
   *        type: INT64
   * </pre>
   *
   * Protobuf type {@code google.api.ProjectProperties}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.ProjectProperties)
      com.google.api.ProjectPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.ConsumerProto.internal_static_google_api_ProjectProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.ConsumerProto
          .internal_static_google_api_ProjectProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.ProjectProperties.class,
              com.google.api.ProjectProperties.Builder.class);
    }

    // Construct using com.google.api.ProjectProperties.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (propertiesBuilder_ == null) {
        properties_ = java.util.Collections.emptyList();
      } else {
        properties_ = null;
        propertiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.ConsumerProto.internal_static_google_api_ProjectProperties_descriptor;
    }

    @java.lang.Override
    public com.google.api.ProjectProperties getDefaultInstanceForType() {
      return com.google.api.ProjectProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.ProjectProperties build() {
      com.google.api.ProjectProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.ProjectProperties buildPartial() {
      com.google.api.ProjectProperties result = new com.google.api.ProjectProperties(this);
      int from_bitField0_ = bitField0_;
      if (propertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          properties_ = java.util.Collections.unmodifiableList(properties_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.properties_ = properties_;
      } else {
        result.properties_ = propertiesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.ProjectProperties) {
        return mergeFrom((com.google.api.ProjectProperties) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.ProjectProperties other) {
      if (other == com.google.api.ProjectProperties.getDefaultInstance()) return this;
      if (propertiesBuilder_ == null) {
        if (!other.properties_.isEmpty()) {
          if (properties_.isEmpty()) {
            properties_ = other.properties_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePropertiesIsMutable();
            properties_.addAll(other.properties_);
          }
          onChanged();
        }
      } else {
        if (!other.properties_.isEmpty()) {
          if (propertiesBuilder_.isEmpty()) {
            propertiesBuilder_.dispose();
            propertiesBuilder_ = null;
            properties_ = other.properties_;
            bitField0_ = (bitField0_ & ~0x00000001);
            propertiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPropertiesFieldBuilder()
                    : null;
          } else {
            propertiesBuilder_.addAllMessages(other.properties_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.api.Property m =
                    input.readMessage(com.google.api.Property.parser(), extensionRegistry);
                if (propertiesBuilder_ == null) {
                  ensurePropertiesIsMutable();
                  properties_.add(m);
                } else {
                  propertiesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.api.Property> properties_ = java.util.Collections.emptyList();

    private void ensurePropertiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        properties_ = new java.util.ArrayList<com.google.api.Property>(properties_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.Property,
            com.google.api.Property.Builder,
            com.google.api.PropertyOrBuilder>
        propertiesBuilder_;

    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public java.util.List<com.google.api.Property> getPropertiesList() {
      if (propertiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(properties_);
      } else {
        return propertiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public int getPropertiesCount() {
      if (propertiesBuilder_ == null) {
        return properties_.size();
      } else {
        return propertiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public com.google.api.Property getProperties(int index) {
      if (propertiesBuilder_ == null) {
        return properties_.get(index);
      } else {
        return propertiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder setProperties(int index, com.google.api.Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.set(index, value);
        onChanged();
      } else {
        propertiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder setProperties(int index, com.google.api.Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.set(index, builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(com.google.api.Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.add(value);
        onChanged();
      } else {
        propertiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(int index, com.google.api.Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.add(index, value);
        onChanged();
      } else {
        propertiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(com.google.api.Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.add(builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(int index, com.google.api.Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.add(index, builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addAllProperties(java.lang.Iterable<? extends com.google.api.Property> values) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, properties_);
        onChanged();
      } else {
        propertiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder clearProperties() {
      if (propertiesBuilder_ == null) {
        properties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        propertiesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder removeProperties(int index) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.remove(index);
        onChanged();
      } else {
        propertiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public com.google.api.Property.Builder getPropertiesBuilder(int index) {
      return getPropertiesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public com.google.api.PropertyOrBuilder getPropertiesOrBuilder(int index) {
      if (propertiesBuilder_ == null) {
        return properties_.get(index);
      } else {
        return propertiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public java.util.List<? extends com.google.api.PropertyOrBuilder> getPropertiesOrBuilderList() {
      if (propertiesBuilder_ != null) {
        return propertiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(properties_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public com.google.api.Property.Builder addPropertiesBuilder() {
      return getPropertiesFieldBuilder().addBuilder(com.google.api.Property.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public com.google.api.Property.Builder addPropertiesBuilder(int index) {
      return getPropertiesFieldBuilder()
          .addBuilder(index, com.google.api.Property.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public java.util.List<com.google.api.Property.Builder> getPropertiesBuilderList() {
      return getPropertiesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.Property,
            com.google.api.Property.Builder,
            com.google.api.PropertyOrBuilder>
        getPropertiesFieldBuilder() {
      if (propertiesBuilder_ == null) {
        propertiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.api.Property,
                com.google.api.Property.Builder,
                com.google.api.PropertyOrBuilder>(
                properties_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        properties_ = null;
      }
      return propertiesBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.ProjectProperties)
  }

  // @@protoc_insertion_point(class_scope:google.api.ProjectProperties)
  private static final com.google.api.ProjectProperties DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.ProjectProperties();
  }

  public static com.google.api.ProjectProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectProperties> PARSER =
      new com.google.protobuf.AbstractParser<ProjectProperties>() {
        @java.lang.Override
        public ProjectProperties parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ProjectProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.ProjectProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
