// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notary.proto

package com.ai.procyon.grpc.rpc;

public interface ProxyCertReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.ProxyCertReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Proxy Token ID
   * </pre>
   *
   * <code>string TokenID = 1;</code>
   * @return The tokenID.
   */
  String getTokenID();
  /**
   * <pre>
   * Proxy Token ID
   * </pre>
   *
   * <code>string TokenID = 1;</code>
   * @return The bytes for tokenID.
   */
  com.google.protobuf.ByteString
      getTokenIDBytes();

  /**
   * <pre>
   * Encrypted CSR
   * </pre>
   *
   * <code>string EncCSR = 2;</code>
   * @return The encCSR.
   */
  String getEncCSR();
  /**
   * <pre>
   * Encrypted CSR
   * </pre>
   *
   * <code>string EncCSR = 2;</code>
   * @return The bytes for encCSR.
   */
  com.google.protobuf.ByteString
      getEncCSRBytes();
}
