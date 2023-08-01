// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.ai.procyon.grpc.common;

/**
 * <pre>
 * list of MFAResponse
 * </pre>
 *
 * Protobuf type {@code model.MFAResponses}
 */
public final class MFAResponses extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.MFAResponses)
    MFAResponsesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MFAResponses.newBuilder() to construct.
  private MFAResponses(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MFAResponses() {
    mFAResponses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MFAResponses();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MFAResponses(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mFAResponses_ = new java.util.ArrayList<com.ai.procyon.grpc.common.MFAResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            mFAResponses_.add(
                input.readMessage(com.ai.procyon.grpc.common.MFAResponse.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        mFAResponses_ = java.util.Collections.unmodifiableList(mFAResponses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ai.procyon.grpc.common.CommonProto.internal_static_model_MFAResponses_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ai.procyon.grpc.common.CommonProto.internal_static_model_MFAResponses_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ai.procyon.grpc.common.MFAResponses.class, com.ai.procyon.grpc.common.MFAResponses.Builder.class);
  }

  public static final int MFARESPONSES_FIELD_NUMBER = 1;
  private java.util.List<com.ai.procyon.grpc.common.MFAResponse> mFAResponses_;
  /**
   * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.ai.procyon.grpc.common.MFAResponse> getMFAResponsesList() {
    return mFAResponses_;
  }
  /**
   * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.ai.procyon.grpc.common.MFAResponseOrBuilder> 
      getMFAResponsesOrBuilderList() {
    return mFAResponses_;
  }
  /**
   * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getMFAResponsesCount() {
    return mFAResponses_.size();
  }
  /**
   * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ai.procyon.grpc.common.MFAResponse getMFAResponses(int index) {
    return mFAResponses_.get(index);
  }
  /**
   * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ai.procyon.grpc.common.MFAResponseOrBuilder getMFAResponsesOrBuilder(
      int index) {
    return mFAResponses_.get(index);
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
    for (int i = 0; i < mFAResponses_.size(); i++) {
      output.writeMessage(1, mFAResponses_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mFAResponses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mFAResponses_.get(i));
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
    if (!(obj instanceof com.ai.procyon.grpc.common.MFAResponses)) {
      return super.equals(obj);
    }
    com.ai.procyon.grpc.common.MFAResponses other = (com.ai.procyon.grpc.common.MFAResponses) obj;

    if (!getMFAResponsesList()
        .equals(other.getMFAResponsesList())) return false;
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
    if (getMFAResponsesCount() > 0) {
      hash = (37 * hash) + MFARESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getMFAResponsesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ai.procyon.grpc.common.MFAResponses parseFrom(
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
  public static Builder newBuilder(com.ai.procyon.grpc.common.MFAResponses prototype) {
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
   * <pre>
   * list of MFAResponse
   * </pre>
   *
   * Protobuf type {@code model.MFAResponses}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.MFAResponses)
      com.ai.procyon.grpc.common.MFAResponsesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ai.procyon.grpc.common.CommonProto.internal_static_model_MFAResponses_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ai.procyon.grpc.common.CommonProto.internal_static_model_MFAResponses_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ai.procyon.grpc.common.MFAResponses.class, com.ai.procyon.grpc.common.MFAResponses.Builder.class);
    }

    // Construct using com.ai.procyon.grpc.common.MFAResponses.newBuilder()
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
        getMFAResponsesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mFAResponsesBuilder_ == null) {
        mFAResponses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mFAResponsesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ai.procyon.grpc.common.CommonProto.internal_static_model_MFAResponses_descriptor;
    }

    @java.lang.Override
    public com.ai.procyon.grpc.common.MFAResponses getDefaultInstanceForType() {
      return com.ai.procyon.grpc.common.MFAResponses.getDefaultInstance();
    }

    @java.lang.Override
    public com.ai.procyon.grpc.common.MFAResponses build() {
      com.ai.procyon.grpc.common.MFAResponses result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ai.procyon.grpc.common.MFAResponses buildPartial() {
      com.ai.procyon.grpc.common.MFAResponses result = new com.ai.procyon.grpc.common.MFAResponses(this);
      int from_bitField0_ = bitField0_;
      if (mFAResponsesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mFAResponses_ = java.util.Collections.unmodifiableList(mFAResponses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mFAResponses_ = mFAResponses_;
      } else {
        result.mFAResponses_ = mFAResponsesBuilder_.build();
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
      if (other instanceof com.ai.procyon.grpc.common.MFAResponses) {
        return mergeFrom((com.ai.procyon.grpc.common.MFAResponses)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ai.procyon.grpc.common.MFAResponses other) {
      if (other == com.ai.procyon.grpc.common.MFAResponses.getDefaultInstance()) return this;
      if (mFAResponsesBuilder_ == null) {
        if (!other.mFAResponses_.isEmpty()) {
          if (mFAResponses_.isEmpty()) {
            mFAResponses_ = other.mFAResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMFAResponsesIsMutable();
            mFAResponses_.addAll(other.mFAResponses_);
          }
          onChanged();
        }
      } else {
        if (!other.mFAResponses_.isEmpty()) {
          if (mFAResponsesBuilder_.isEmpty()) {
            mFAResponsesBuilder_.dispose();
            mFAResponsesBuilder_ = null;
            mFAResponses_ = other.mFAResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mFAResponsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMFAResponsesFieldBuilder() : null;
          } else {
            mFAResponsesBuilder_.addAllMessages(other.mFAResponses_);
          }
        }
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
      com.ai.procyon.grpc.common.MFAResponses parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ai.procyon.grpc.common.MFAResponses) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.ai.procyon.grpc.common.MFAResponse> mFAResponses_ =
      java.util.Collections.emptyList();
    private void ensureMFAResponsesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mFAResponses_ = new java.util.ArrayList<com.ai.procyon.grpc.common.MFAResponse>(mFAResponses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ai.procyon.grpc.common.MFAResponse, com.ai.procyon.grpc.common.MFAResponse.Builder, com.ai.procyon.grpc.common.MFAResponseOrBuilder> mFAResponsesBuilder_;

    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.ai.procyon.grpc.common.MFAResponse> getMFAResponsesList() {
      if (mFAResponsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mFAResponses_);
      } else {
        return mFAResponsesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public int getMFAResponsesCount() {
      if (mFAResponsesBuilder_ == null) {
        return mFAResponses_.size();
      } else {
        return mFAResponsesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public com.ai.procyon.grpc.common.MFAResponse getMFAResponses(int index) {
      if (mFAResponsesBuilder_ == null) {
        return mFAResponses_.get(index);
      } else {
        return mFAResponsesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setMFAResponses(
        int index, com.ai.procyon.grpc.common.MFAResponse value) {
      if (mFAResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMFAResponsesIsMutable();
        mFAResponses_.set(index, value);
        onChanged();
      } else {
        mFAResponsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setMFAResponses(
        int index, com.ai.procyon.grpc.common.MFAResponse.Builder builderForValue) {
      if (mFAResponsesBuilder_ == null) {
        ensureMFAResponsesIsMutable();
        mFAResponses_.set(index, builderForValue.build());
        onChanged();
      } else {
        mFAResponsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addMFAResponses(com.ai.procyon.grpc.common.MFAResponse value) {
      if (mFAResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMFAResponsesIsMutable();
        mFAResponses_.add(value);
        onChanged();
      } else {
        mFAResponsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addMFAResponses(
        int index, com.ai.procyon.grpc.common.MFAResponse value) {
      if (mFAResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMFAResponsesIsMutable();
        mFAResponses_.add(index, value);
        onChanged();
      } else {
        mFAResponsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addMFAResponses(
        com.ai.procyon.grpc.common.MFAResponse.Builder builderForValue) {
      if (mFAResponsesBuilder_ == null) {
        ensureMFAResponsesIsMutable();
        mFAResponses_.add(builderForValue.build());
        onChanged();
      } else {
        mFAResponsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addMFAResponses(
        int index, com.ai.procyon.grpc.common.MFAResponse.Builder builderForValue) {
      if (mFAResponsesBuilder_ == null) {
        ensureMFAResponsesIsMutable();
        mFAResponses_.add(index, builderForValue.build());
        onChanged();
      } else {
        mFAResponsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAllMFAResponses(
        java.lang.Iterable<? extends com.ai.procyon.grpc.common.MFAResponse> values) {
      if (mFAResponsesBuilder_ == null) {
        ensureMFAResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mFAResponses_);
        onChanged();
      } else {
        mFAResponsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearMFAResponses() {
      if (mFAResponsesBuilder_ == null) {
        mFAResponses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mFAResponsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder removeMFAResponses(int index) {
      if (mFAResponsesBuilder_ == null) {
        ensureMFAResponsesIsMutable();
        mFAResponses_.remove(index);
        onChanged();
      } else {
        mFAResponsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public com.ai.procyon.grpc.common.MFAResponse.Builder getMFAResponsesBuilder(
        int index) {
      return getMFAResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public com.ai.procyon.grpc.common.MFAResponseOrBuilder getMFAResponsesOrBuilder(
        int index) {
      if (mFAResponsesBuilder_ == null) {
        return mFAResponses_.get(index);  } else {
        return mFAResponsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.ai.procyon.grpc.common.MFAResponseOrBuilder> 
         getMFAResponsesOrBuilderList() {
      if (mFAResponsesBuilder_ != null) {
        return mFAResponsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mFAResponses_);
      }
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public com.ai.procyon.grpc.common.MFAResponse.Builder addMFAResponsesBuilder() {
      return getMFAResponsesFieldBuilder().addBuilder(
          com.ai.procyon.grpc.common.MFAResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public com.ai.procyon.grpc.common.MFAResponse.Builder addMFAResponsesBuilder(
        int index) {
      return getMFAResponsesFieldBuilder().addBuilder(
          index, com.ai.procyon.grpc.common.MFAResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .model.MFAResponse MFAResponses = 1 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.ai.procyon.grpc.common.MFAResponse.Builder> 
         getMFAResponsesBuilderList() {
      return getMFAResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ai.procyon.grpc.common.MFAResponse, com.ai.procyon.grpc.common.MFAResponse.Builder, com.ai.procyon.grpc.common.MFAResponseOrBuilder> 
        getMFAResponsesFieldBuilder() {
      if (mFAResponsesBuilder_ == null) {
        mFAResponsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ai.procyon.grpc.common.MFAResponse, com.ai.procyon.grpc.common.MFAResponse.Builder, com.ai.procyon.grpc.common.MFAResponseOrBuilder>(
                mFAResponses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mFAResponses_ = null;
      }
      return mFAResponsesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:model.MFAResponses)
  }

  // @@protoc_insertion_point(class_scope:model.MFAResponses)
  private static final com.ai.procyon.grpc.common.MFAResponses DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ai.procyon.grpc.common.MFAResponses();
  }

  public static com.ai.procyon.grpc.common.MFAResponses getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MFAResponses>
      PARSER = new com.google.protobuf.AbstractParser<MFAResponses>() {
    @java.lang.Override
    public MFAResponses parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MFAResponses(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MFAResponses> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MFAResponses> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ai.procyon.grpc.common.MFAResponses getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

