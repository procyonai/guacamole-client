// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notary.proto

package com.ai.procyon.grpc.rpc;

public interface TenantApiInOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.TenantApiIn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Device Tenant Name
   * </pre>
   *
   * <code>string Tenant = 1;</code>
   * @return The tenant.
   */
  String getTenant();
  /**
   * <pre>
   * Device Tenant Name
   * </pre>
   *
   * <code>string Tenant = 1;</code>
   * @return The bytes for tenant.
   */
  com.google.protobuf.ByteString
      getTenantBytes();

  /**
   * <pre>
   * Device Namespace Name
   * </pre>
   *
   * <code>string NameSpace = 2;</code>
   * @return The nameSpace.
   */
  String getNameSpace();
  /**
   * <pre>
   * Device Namespace Name
   * </pre>
   *
   * <code>string NameSpace = 2;</code>
   * @return The bytes for nameSpace.
   */
  com.google.protobuf.ByteString
      getNameSpaceBytes();

  /**
   * <code>string Tag = 3;</code>
   * @return The tag.
   */
  String getTag();
  /**
   * <code>string Tag = 3;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <code>bool Refresh = 4;</code>
   * @return The refresh.
   */
  boolean getRefresh();

  /**
   * <pre>
   *days
   * </pre>
   *
   * <code>uint32 TimeDuration = 5;</code>
   * @return The timeDuration.
   */
  int getTimeDuration();
}
