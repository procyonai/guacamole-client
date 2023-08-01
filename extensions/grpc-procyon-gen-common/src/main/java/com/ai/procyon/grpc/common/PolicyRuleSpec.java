// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.ai.procyon.grpc.common;

/**
 * Protobuf type {@code model.PolicyRuleSpec}
 */
public final class PolicyRuleSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.PolicyRuleSpec)
    PolicyRuleSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicyRuleSpec.newBuilder() to construct.
  private PolicyRuleSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyRuleSpec() {
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PolicyRuleSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PolicyRuleSpec(
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
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              actionMap_ = com.google.protobuf.MapField.newMapField(
                  ActionMapDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.ai.procyon.grpc.common.PolicyRules>
            actionMap__ = input.readMessage(
                ActionMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            actionMap_.getMutableMap().put(
                actionMap__.getKey(), actionMap__.getValue());
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
    return com.ai.procyon.grpc.common.CommonProto.internal_static_model_PolicyRuleSpec_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetActionMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ai.procyon.grpc.common.CommonProto.internal_static_model_PolicyRuleSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ai.procyon.grpc.common.PolicyRuleSpec.class, com.ai.procyon.grpc.common.PolicyRuleSpec.Builder.class);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object description_;
  /**
   * <code>string Description = 1;</code>
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
   * <code>string Description = 1;</code>
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

  public static final int ACTIONMAP_FIELD_NUMBER = 2;
  private static final class ActionMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.ai.procyon.grpc.common.PolicyRules> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.ai.procyon.grpc.common.PolicyRules>newDefaultInstance(
                com.ai.procyon.grpc.common.CommonProto.internal_static_model_PolicyRuleSpec_ActionMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.ai.procyon.grpc.common.PolicyRules.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.ai.procyon.grpc.common.PolicyRules> actionMap_;
  private com.google.protobuf.MapField<java.lang.String, com.ai.procyon.grpc.common.PolicyRules>
  internalGetActionMap() {
    if (actionMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ActionMapDefaultEntryHolder.defaultEntry);
    }
    return actionMap_;
  }

  public int getActionMapCount() {
    return internalGetActionMap().getMap().size();
  }
  /**
   * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
   */

  @java.lang.Override
  public boolean containsActionMap(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetActionMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getActionMapMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> getActionMap() {
    return getActionMapMap();
  }
  /**
   * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> getActionMapMap() {
    return internalGetActionMap().getMap();
  }
  /**
   * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
   */
  @java.lang.Override

  public com.ai.procyon.grpc.common.PolicyRules getActionMapOrDefault(
      java.lang.String key,
      com.ai.procyon.grpc.common.PolicyRules defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> map =
        internalGetActionMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
   */
  @java.lang.Override

  public com.ai.procyon.grpc.common.PolicyRules getActionMapOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> map =
        internalGetActionMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetActionMap(),
        ActionMapDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
    }
    for (java.util.Map.Entry<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> entry
         : internalGetActionMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.ai.procyon.grpc.common.PolicyRules>
      actionMap__ = ActionMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, actionMap__);
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
    if (!(obj instanceof com.ai.procyon.grpc.common.PolicyRuleSpec)) {
      return super.equals(obj);
    }
    com.ai.procyon.grpc.common.PolicyRuleSpec other = (com.ai.procyon.grpc.common.PolicyRuleSpec) obj;

    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!internalGetActionMap().equals(
        other.internalGetActionMap())) return false;
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
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (!internalGetActionMap().getMap().isEmpty()) {
      hash = (37 * hash) + ACTIONMAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetActionMap().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ai.procyon.grpc.common.PolicyRuleSpec parseFrom(
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
  public static Builder newBuilder(com.ai.procyon.grpc.common.PolicyRuleSpec prototype) {
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
   * Protobuf type {@code model.PolicyRuleSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.PolicyRuleSpec)
      com.ai.procyon.grpc.common.PolicyRuleSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ai.procyon.grpc.common.CommonProto.internal_static_model_PolicyRuleSpec_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetActionMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableActionMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ai.procyon.grpc.common.CommonProto.internal_static_model_PolicyRuleSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ai.procyon.grpc.common.PolicyRuleSpec.class, com.ai.procyon.grpc.common.PolicyRuleSpec.Builder.class);
    }

    // Construct using com.ai.procyon.grpc.common.PolicyRuleSpec.newBuilder()
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
      description_ = "";

      internalGetMutableActionMap().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ai.procyon.grpc.common.CommonProto.internal_static_model_PolicyRuleSpec_descriptor;
    }

    @java.lang.Override
    public com.ai.procyon.grpc.common.PolicyRuleSpec getDefaultInstanceForType() {
      return com.ai.procyon.grpc.common.PolicyRuleSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.ai.procyon.grpc.common.PolicyRuleSpec build() {
      com.ai.procyon.grpc.common.PolicyRuleSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ai.procyon.grpc.common.PolicyRuleSpec buildPartial() {
      com.ai.procyon.grpc.common.PolicyRuleSpec result = new com.ai.procyon.grpc.common.PolicyRuleSpec(this);
      int from_bitField0_ = bitField0_;
      result.description_ = description_;
      result.actionMap_ = internalGetActionMap();
      result.actionMap_.makeImmutable();
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
      if (other instanceof com.ai.procyon.grpc.common.PolicyRuleSpec) {
        return mergeFrom((com.ai.procyon.grpc.common.PolicyRuleSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ai.procyon.grpc.common.PolicyRuleSpec other) {
      if (other == com.ai.procyon.grpc.common.PolicyRuleSpec.getDefaultInstance()) return this;
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      internalGetMutableActionMap().mergeFrom(
          other.internalGetActionMap());
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
      com.ai.procyon.grpc.common.PolicyRuleSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ai.procyon.grpc.common.PolicyRuleSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object description_ = "";
    /**
     * <code>string Description = 1;</code>
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
     * <code>string Description = 1;</code>
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
     * <code>string Description = 1;</code>
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
     * <code>string Description = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string Description = 1;</code>
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

    private com.google.protobuf.MapField<
        java.lang.String, com.ai.procyon.grpc.common.PolicyRules> actionMap_;
    private com.google.protobuf.MapField<java.lang.String, com.ai.procyon.grpc.common.PolicyRules>
    internalGetActionMap() {
      if (actionMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ActionMapDefaultEntryHolder.defaultEntry);
      }
      return actionMap_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.ai.procyon.grpc.common.PolicyRules>
    internalGetMutableActionMap() {
      onChanged();;
      if (actionMap_ == null) {
        actionMap_ = com.google.protobuf.MapField.newMapField(
            ActionMapDefaultEntryHolder.defaultEntry);
      }
      if (!actionMap_.isMutable()) {
        actionMap_ = actionMap_.copy();
      }
      return actionMap_;
    }

    public int getActionMapCount() {
      return internalGetActionMap().getMap().size();
    }
    /**
     * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
     */

    @java.lang.Override
    public boolean containsActionMap(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetActionMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getActionMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> getActionMap() {
      return getActionMapMap();
    }
    /**
     * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> getActionMapMap() {
      return internalGetActionMap().getMap();
    }
    /**
     * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
     */
    @java.lang.Override

    public com.ai.procyon.grpc.common.PolicyRules getActionMapOrDefault(
        java.lang.String key,
        com.ai.procyon.grpc.common.PolicyRules defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> map =
          internalGetActionMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
     */
    @java.lang.Override

    public com.ai.procyon.grpc.common.PolicyRules getActionMapOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> map =
          internalGetActionMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearActionMap() {
      internalGetMutableActionMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
     */

    public Builder removeActionMap(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableActionMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules>
    getMutableActionMap() {
      return internalGetMutableActionMap().getMutableMap();
    }
    /**
     * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
     */
    public Builder putActionMap(
        java.lang.String key,
        com.ai.procyon.grpc.common.PolicyRules value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableActionMap().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .model.PolicyRules&gt; ActionMap = 2;</code>
     */

    public Builder putAllActionMap(
        java.util.Map<java.lang.String, com.ai.procyon.grpc.common.PolicyRules> values) {
      internalGetMutableActionMap().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:model.PolicyRuleSpec)
  }

  // @@protoc_insertion_point(class_scope:model.PolicyRuleSpec)
  private static final com.ai.procyon.grpc.common.PolicyRuleSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ai.procyon.grpc.common.PolicyRuleSpec();
  }

  public static com.ai.procyon.grpc.common.PolicyRuleSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyRuleSpec>
      PARSER = new com.google.protobuf.AbstractParser<PolicyRuleSpec>() {
    @java.lang.Override
    public PolicyRuleSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PolicyRuleSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PolicyRuleSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyRuleSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ai.procyon.grpc.common.PolicyRuleSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

