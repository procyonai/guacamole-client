// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.ai.procyon.grpc.common;

public interface AzureServiceAccountSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.AzureServiceAccountSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.model.ObjectRef Account = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:account_&#92;""];</code>
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   * <code>.model.ObjectRef Account = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:account_&#92;""];</code>
   * @return The account.
   */
  com.ai.procyon.grpc.common.ObjectRef getAccount();
  /**
   * <code>.model.ObjectRef Account = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "gorm:&#92;"embedded;embedded_prefix:account_&#92;""];</code>
   */
  com.ai.procyon.grpc.common.ObjectRefOrBuilder getAccountOrBuilder();

  /**
   * <code>string DisplayName = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <code>string DisplayName = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();
}
