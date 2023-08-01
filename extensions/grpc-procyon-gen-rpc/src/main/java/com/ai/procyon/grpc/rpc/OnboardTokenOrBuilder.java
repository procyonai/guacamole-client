// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notary.proto

package com.ai.procyon.grpc.rpc;

public interface OnboardTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.OnboardToken)
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
   * <pre>
   * Device User Name
   * </pre>
   *
   * <code>string UserName = 3;</code>
   * @return The userName.
   */
  String getUserName();
  /**
   * <pre>
   * Device User Name
   * </pre>
   *
   * <code>string UserName = 3;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <pre>
   * onboarding Token
   * </pre>
   *
   * <code>string Token = 4;</code>
   * @return The token.
   */
  String getToken();
  /**
   * <pre>
   * onboarding Token
   * </pre>
   *
   * <code>string Token = 4;</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * onboarding Token ID  
   * </pre>
   *
   * <code>string TokenID = 5;</code>
   * @return The tokenID.
   */
  String getTokenID();
  /**
   * <pre>
   * onboarding Token ID  
   * </pre>
   *
   * <code>string TokenID = 5;</code>
   * @return The bytes for tokenID.
   */
  com.google.protobuf.ByteString
      getTokenIDBytes();

  /**
   * <pre>
   * expiration time
   * </pre>
   *
   * <code>string Expiry = 6;</code>
   * @return The expiry.
   */
  String getExpiry();
  /**
   * <pre>
   * expiration time
   * </pre>
   *
   * <code>string Expiry = 6;</code>
   * @return The bytes for expiry.
   */
  com.google.protobuf.ByteString
      getExpiryBytes();
}
