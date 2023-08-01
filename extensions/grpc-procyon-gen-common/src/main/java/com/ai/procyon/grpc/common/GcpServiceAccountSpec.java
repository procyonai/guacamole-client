// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.ai.procyon.grpc.common;

/**
 * Protobuf type {@code model.GcpServiceAccountSpec}
 */
public final class GcpServiceAccountSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.GcpServiceAccountSpec)
    GcpServiceAccountSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcpServiceAccountSpec.newBuilder() to construct.
  private GcpServiceAccountSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcpServiceAccountSpec() {
    name_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcpServiceAccountSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GcpServiceAccountSpec(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.ai.procyon.grpc.common.ObjectRef.Builder subBuilder = null;
            if (project_ != null) {
              subBuilder = project_.toBuilder();
            }
            project_ = input.readMessage(com.ai.procyon.grpc.common.ObjectRef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(project_);
              project_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ai.procyon.grpc.common.CommonProto.internal_static_model_GcpServiceAccountSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ai.procyon.grpc.common.CommonProto.internal_static_model_GcpServiceAccountSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ai.procyon.grpc.common.GcpServiceAccountSpec.class, com.ai.procyon.grpc.common.GcpServiceAccountSpec.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 1;
  private com.ai.procyon.grpc.common.ObjectRef project_;
  /**
   * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
   * @return Whether the project field is set.
   */
  @java.lang.Override
  public boolean hasProject() {
    return project_ != null;
  }
  /**
   * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
   * @return The project.
   */
  @java.lang.Override
  public com.ai.procyon.grpc.common.ObjectRef getProject() {
    return project_ == null ? com.ai.procyon.grpc.common.ObjectRef.getDefaultInstance() : project_;
  }
  /**
   * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
   */
  @java.lang.Override
  public com.ai.procyon.grpc.common.ObjectRefOrBuilder getProjectOrBuilder() {
    return getProject();
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string Name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string Name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <code>string Description = 3;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string Description = 3;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (project_ != null) {
      output.writeMessage(1, getProject());
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (project_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProject());
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ai.procyon.grpc.common.GcpServiceAccountSpec)) {
      return super.equals(obj);
    }
    com.ai.procyon.grpc.common.GcpServiceAccountSpec other = (com.ai.procyon.grpc.common.GcpServiceAccountSpec) obj;

    if (hasProject() != other.hasProject()) return false;
    if (hasProject()) {
      if (!getProject()
          .equals(other.getProject())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasProject()) {
      hash = (37 * hash) + PROJECT_FIELD_NUMBER;
      hash = (53 * hash) + getProject().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ai.procyon.grpc.common.GcpServiceAccountSpec prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code model.GcpServiceAccountSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.GcpServiceAccountSpec)
      com.ai.procyon.grpc.common.GcpServiceAccountSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ai.procyon.grpc.common.CommonProto.internal_static_model_GcpServiceAccountSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ai.procyon.grpc.common.CommonProto.internal_static_model_GcpServiceAccountSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ai.procyon.grpc.common.GcpServiceAccountSpec.class, com.ai.procyon.grpc.common.GcpServiceAccountSpec.Builder.class);
    }

    // Construct using com.ai.procyon.grpc.common.GcpServiceAccountSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (projectBuilder_ == null) {
        project_ = null;
      } else {
        project_ = null;
        projectBuilder_ = null;
      }
      name_ = "";

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ai.procyon.grpc.common.CommonProto.internal_static_model_GcpServiceAccountSpec_descriptor;
    }

    @java.lang.Override
    public com.ai.procyon.grpc.common.GcpServiceAccountSpec getDefaultInstanceForType() {
      return com.ai.procyon.grpc.common.GcpServiceAccountSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.ai.procyon.grpc.common.GcpServiceAccountSpec build() {
      com.ai.procyon.grpc.common.GcpServiceAccountSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ai.procyon.grpc.common.GcpServiceAccountSpec buildPartial() {
      com.ai.procyon.grpc.common.GcpServiceAccountSpec result = new com.ai.procyon.grpc.common.GcpServiceAccountSpec(this);
      if (projectBuilder_ == null) {
        result.project_ = project_;
      } else {
        result.project_ = projectBuilder_.build();
      }
      result.name_ = name_;
      result.description_ = description_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ai.procyon.grpc.common.GcpServiceAccountSpec) {
        return mergeFrom((com.ai.procyon.grpc.common.GcpServiceAccountSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ai.procyon.grpc.common.GcpServiceAccountSpec other) {
      if (other == com.ai.procyon.grpc.common.GcpServiceAccountSpec.getDefaultInstance()) return this;
      if (other.hasProject()) {
        mergeProject(other.getProject());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.ai.procyon.grpc.common.GcpServiceAccountSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ai.procyon.grpc.common.GcpServiceAccountSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.ai.procyon.grpc.common.ObjectRef project_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ai.procyon.grpc.common.ObjectRef, com.ai.procyon.grpc.common.ObjectRef.Builder, com.ai.procyon.grpc.common.ObjectRefOrBuilder> projectBuilder_;
    /**
     * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
     * @return Whether the project field is set.
     */
    public boolean hasProject() {
      return projectBuilder_ != null || project_ != null;
    }
    /**
     * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
     * @return The project.
     */
    public com.ai.procyon.grpc.common.ObjectRef getProject() {
      if (projectBuilder_ == null) {
        return project_ == null ? com.ai.procyon.grpc.common.ObjectRef.getDefaultInstance() : project_;
      } else {
        return projectBuilder_.getMessage();
      }
    }
    /**
     * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
     */
    public Builder setProject(com.ai.procyon.grpc.common.ObjectRef value) {
      if (projectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        project_ = value;
        onChanged();
      } else {
        projectBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
     */
    public Builder setProject(
        com.ai.procyon.grpc.common.ObjectRef.Builder builderForValue) {
      if (projectBuilder_ == null) {
        project_ = builderForValue.build();
        onChanged();
      } else {
        projectBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
     */
    public Builder mergeProject(com.ai.procyon.grpc.common.ObjectRef value) {
      if (projectBuilder_ == null) {
        if (project_ != null) {
          project_ =
            com.ai.procyon.grpc.common.ObjectRef.newBuilder(project_).mergeFrom(value).buildPartial();
        } else {
          project_ = value;
        }
        onChanged();
      } else {
        projectBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
     */
    public Builder clearProject() {
      if (projectBuilder_ == null) {
        project_ = null;
        onChanged();
      } else {
        project_ = null;
        projectBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
     */
    public com.ai.procyon.grpc.common.ObjectRef.Builder getProjectBuilder() {
      
      onChanged();
      return getProjectFieldBuilder().getBuilder();
    }
    /**
     * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
     */
    public com.ai.procyon.grpc.common.ObjectRefOrBuilder getProjectOrBuilder() {
      if (projectBuilder_ != null) {
        return projectBuilder_.getMessageOrBuilder();
      } else {
        return project_ == null ?
            com.ai.procyon.grpc.common.ObjectRef.getDefaultInstance() : project_;
      }
    }
    /**
     * <code>.model.ObjectRef Project = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:project_&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ai.procyon.grpc.common.ObjectRef, com.ai.procyon.grpc.common.ObjectRef.Builder, com.ai.procyon.grpc.common.ObjectRefOrBuilder> 
        getProjectFieldBuilder() {
      if (projectBuilder_ == null) {
        projectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ai.procyon.grpc.common.ObjectRef, com.ai.procyon.grpc.common.ObjectRef.Builder, com.ai.procyon.grpc.common.ObjectRefOrBuilder>(
                getProject(),
                getParentForChildren(),
                isClean());
        project_ = null;
      }
      return projectBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string Name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string Name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string Description = 3;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Description = 3;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string Description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:model.GcpServiceAccountSpec)
  }

  // @@protoc_insertion_point(class_scope:model.GcpServiceAccountSpec)
  private static final com.ai.procyon.grpc.common.GcpServiceAccountSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ai.procyon.grpc.common.GcpServiceAccountSpec();
  }

  public static com.ai.procyon.grpc.common.GcpServiceAccountSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcpServiceAccountSpec>
      PARSER = new com.google.protobuf.AbstractParser<GcpServiceAccountSpec>() {
    @java.lang.Override
    public GcpServiceAccountSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GcpServiceAccountSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GcpServiceAccountSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcpServiceAccountSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ai.procyon.grpc.common.GcpServiceAccountSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

