// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notary.proto

package com.ai.procyon.grpc.rpc;

/**
 * Protobuf type {@code rpc.TenantApiIn}
 */
public final class TenantApiIn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.TenantApiIn)
    TenantApiInOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TenantApiIn.newBuilder() to construct.
  private TenantApiIn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TenantApiIn() {
    tenant_ = "";
    nameSpace_ = "";
    tag_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new TenantApiIn();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TenantApiIn(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            tenant_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            nameSpace_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            tag_ = s;
            break;
          }
          case 32: {

            refresh_ = input.readBool();
            break;
          }
          case 40: {

            timeDuration_ = input.readUInt32();
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
    return RPCProto.internal_static_rpc_TenantApiIn_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RPCProto.internal_static_rpc_TenantApiIn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TenantApiIn.class, Builder.class);
  }

  public static final int TENANT_FIELD_NUMBER = 1;
  private volatile Object tenant_;
  /**
   * <pre>
   * Device Tenant Name
   * </pre>
   *
   * <code>string Tenant = 1;</code>
   * @return The tenant.
   */
  @Override
  public String getTenant() {
    Object ref = tenant_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      tenant_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Device Tenant Name
   * </pre>
   *
   * <code>string Tenant = 1;</code>
   * @return The bytes for tenant.
   */
  @Override
  public com.google.protobuf.ByteString
      getTenantBytes() {
    Object ref = tenant_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      tenant_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMESPACE_FIELD_NUMBER = 2;
  private volatile Object nameSpace_;
  /**
   * <pre>
   * Device Namespace Name
   * </pre>
   *
   * <code>string NameSpace = 2;</code>
   * @return The nameSpace.
   */
  @Override
  public String getNameSpace() {
    Object ref = nameSpace_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      nameSpace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Device Namespace Name
   * </pre>
   *
   * <code>string NameSpace = 2;</code>
   * @return The bytes for nameSpace.
   */
  @Override
  public com.google.protobuf.ByteString
      getNameSpaceBytes() {
    Object ref = nameSpace_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      nameSpace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_FIELD_NUMBER = 3;
  private volatile Object tag_;
  /**
   * <code>string Tag = 3;</code>
   * @return The tag.
   */
  @Override
  public String getTag() {
    Object ref = tag_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   * <code>string Tag = 3;</code>
   * @return The bytes for tag.
   */
  @Override
  public com.google.protobuf.ByteString
      getTagBytes() {
    Object ref = tag_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFRESH_FIELD_NUMBER = 4;
  private boolean refresh_;
  /**
   * <code>bool Refresh = 4;</code>
   * @return The refresh.
   */
  @Override
  public boolean getRefresh() {
    return refresh_;
  }

  public static final int TIMEDURATION_FIELD_NUMBER = 5;
  private int timeDuration_;
  /**
   * <pre>
   *days
   * </pre>
   *
   * <code>uint32 TimeDuration = 5;</code>
   * @return The timeDuration.
   */
  @Override
  public int getTimeDuration() {
    return timeDuration_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTenantBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tenant_);
    }
    if (!getNameSpaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nameSpace_);
    }
    if (!getTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tag_);
    }
    if (refresh_ != false) {
      output.writeBool(4, refresh_);
    }
    if (timeDuration_ != 0) {
      output.writeUInt32(5, timeDuration_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTenantBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tenant_);
    }
    if (!getNameSpaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nameSpace_);
    }
    if (!getTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tag_);
    }
    if (refresh_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, refresh_);
    }
    if (timeDuration_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, timeDuration_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof TenantApiIn)) {
      return super.equals(obj);
    }
    TenantApiIn other = (TenantApiIn) obj;

    if (!getTenant()
        .equals(other.getTenant())) return false;
    if (!getNameSpace()
        .equals(other.getNameSpace())) return false;
    if (!getTag()
        .equals(other.getTag())) return false;
    if (getRefresh()
        != other.getRefresh()) return false;
    if (getTimeDuration()
        != other.getTimeDuration()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TENANT_FIELD_NUMBER;
    hash = (53 * hash) + getTenant().hashCode();
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNameSpace().hashCode();
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    hash = (37 * hash) + REFRESH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRefresh());
    hash = (37 * hash) + TIMEDURATION_FIELD_NUMBER;
    hash = (53 * hash) + getTimeDuration();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static TenantApiIn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TenantApiIn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TenantApiIn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TenantApiIn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TenantApiIn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TenantApiIn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TenantApiIn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TenantApiIn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static TenantApiIn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static TenantApiIn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static TenantApiIn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TenantApiIn parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TenantApiIn prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rpc.TenantApiIn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.TenantApiIn)
      TenantApiInOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RPCProto.internal_static_rpc_TenantApiIn_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RPCProto.internal_static_rpc_TenantApiIn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TenantApiIn.class, Builder.class);
    }

    // Construct using com.ai.procyon.grpc.rpc.TenantApiIn.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      tenant_ = "";

      nameSpace_ = "";

      tag_ = "";

      refresh_ = false;

      timeDuration_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RPCProto.internal_static_rpc_TenantApiIn_descriptor;
    }

    @Override
    public TenantApiIn getDefaultInstanceForType() {
      return TenantApiIn.getDefaultInstance();
    }

    @Override
    public TenantApiIn build() {
      TenantApiIn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public TenantApiIn buildPartial() {
      TenantApiIn result = new TenantApiIn(this);
      result.tenant_ = tenant_;
      result.nameSpace_ = nameSpace_;
      result.tag_ = tag_;
      result.refresh_ = refresh_;
      result.timeDuration_ = timeDuration_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof TenantApiIn) {
        return mergeFrom((TenantApiIn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TenantApiIn other) {
      if (other == TenantApiIn.getDefaultInstance()) return this;
      if (!other.getTenant().isEmpty()) {
        tenant_ = other.tenant_;
        onChanged();
      }
      if (!other.getNameSpace().isEmpty()) {
        nameSpace_ = other.nameSpace_;
        onChanged();
      }
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        onChanged();
      }
      if (other.getRefresh() != false) {
        setRefresh(other.getRefresh());
      }
      if (other.getTimeDuration() != 0) {
        setTimeDuration(other.getTimeDuration());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      TenantApiIn parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TenantApiIn) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object tenant_ = "";
    /**
     * <pre>
     * Device Tenant Name
     * </pre>
     *
     * <code>string Tenant = 1;</code>
     * @return The tenant.
     */
    public String getTenant() {
      Object ref = tenant_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tenant_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Device Tenant Name
     * </pre>
     *
     * <code>string Tenant = 1;</code>
     * @return The bytes for tenant.
     */
    public com.google.protobuf.ByteString
        getTenantBytes() {
      Object ref = tenant_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tenant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Device Tenant Name
     * </pre>
     *
     * <code>string Tenant = 1;</code>
     * @param value The tenant to set.
     * @return This builder for chaining.
     */
    public Builder setTenant(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tenant_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device Tenant Name
     * </pre>
     *
     * <code>string Tenant = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenant() {
      
      tenant_ = getDefaultInstance().getTenant();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device Tenant Name
     * </pre>
     *
     * <code>string Tenant = 1;</code>
     * @param value The bytes for tenant to set.
     * @return This builder for chaining.
     */
    public Builder setTenantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tenant_ = value;
      onChanged();
      return this;
    }

    private Object nameSpace_ = "";
    /**
     * <pre>
     * Device Namespace Name
     * </pre>
     *
     * <code>string NameSpace = 2;</code>
     * @return The nameSpace.
     */
    public String getNameSpace() {
      Object ref = nameSpace_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        nameSpace_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Device Namespace Name
     * </pre>
     *
     * <code>string NameSpace = 2;</code>
     * @return The bytes for nameSpace.
     */
    public com.google.protobuf.ByteString
        getNameSpaceBytes() {
      Object ref = nameSpace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        nameSpace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Device Namespace Name
     * </pre>
     *
     * <code>string NameSpace = 2;</code>
     * @param value The nameSpace to set.
     * @return This builder for chaining.
     */
    public Builder setNameSpace(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nameSpace_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device Namespace Name
     * </pre>
     *
     * <code>string NameSpace = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNameSpace() {
      
      nameSpace_ = getDefaultInstance().getNameSpace();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device Namespace Name
     * </pre>
     *
     * <code>string NameSpace = 2;</code>
     * @param value The bytes for nameSpace to set.
     * @return This builder for chaining.
     */
    public Builder setNameSpaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nameSpace_ = value;
      onChanged();
      return this;
    }

    private Object tag_ = "";
    /**
     * <code>string Tag = 3;</code>
     * @return The tag.
     */
    public String getTag() {
      Object ref = tag_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string Tag = 3;</code>
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Tag = 3;</code>
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Tag = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      
      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     * <code>string Tag = 3;</code>
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tag_ = value;
      onChanged();
      return this;
    }

    private boolean refresh_ ;
    /**
     * <code>bool Refresh = 4;</code>
     * @return The refresh.
     */
    @Override
    public boolean getRefresh() {
      return refresh_;
    }
    /**
     * <code>bool Refresh = 4;</code>
     * @param value The refresh to set.
     * @return This builder for chaining.
     */
    public Builder setRefresh(boolean value) {
      
      refresh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool Refresh = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRefresh() {
      
      refresh_ = false;
      onChanged();
      return this;
    }

    private int timeDuration_ ;
    /**
     * <pre>
     *days
     * </pre>
     *
     * <code>uint32 TimeDuration = 5;</code>
     * @return The timeDuration.
     */
    @Override
    public int getTimeDuration() {
      return timeDuration_;
    }
    /**
     * <pre>
     *days
     * </pre>
     *
     * <code>uint32 TimeDuration = 5;</code>
     * @param value The timeDuration to set.
     * @return This builder for chaining.
     */
    public Builder setTimeDuration(int value) {
      
      timeDuration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *days
     * </pre>
     *
     * <code>uint32 TimeDuration = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeDuration() {
      
      timeDuration_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rpc.TenantApiIn)
  }

  // @@protoc_insertion_point(class_scope:rpc.TenantApiIn)
  private static final TenantApiIn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TenantApiIn();
  }

  public static TenantApiIn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TenantApiIn>
      PARSER = new com.google.protobuf.AbstractParser<TenantApiIn>() {
    @Override
    public TenantApiIn parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TenantApiIn(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TenantApiIn> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<TenantApiIn> getParserForType() {
    return PARSER;
  }

  @Override
  public TenantApiIn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

