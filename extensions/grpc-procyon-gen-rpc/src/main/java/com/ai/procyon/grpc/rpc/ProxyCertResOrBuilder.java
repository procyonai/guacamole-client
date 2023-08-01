// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notary.proto

package com.ai.procyon.grpc.rpc;

public interface ProxyCertResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.ProxyCertRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * certificate (x509 pem)
   * </pre>
   *
   * <code>string Cert = 1;</code>
   * @return The cert.
   */
  String getCert();
  /**
   * <pre>
   * certificate (x509 pem)
   * </pre>
   *
   * <code>string Cert = 1;</code>
   * @return The bytes for cert.
   */
  com.google.protobuf.ByteString
      getCertBytes();

  /**
   * <pre>
   * certchain (pem)
   * </pre>
   *
   * <code>string CertChain = 2;</code>
   * @return The certChain.
   */
  String getCertChain();
  /**
   * <pre>
   * certchain (pem)
   * </pre>
   *
   * <code>string CertChain = 2;</code>
   * @return The bytes for certChain.
   */
  com.google.protobuf.ByteString
      getCertChainBytes();

  /**
   * <pre>
   * tenant root ca (pem)
   * </pre>
   *
   * <code>string TenantRoot = 3;</code>
   * @return The tenantRoot.
   */
  String getTenantRoot();
  /**
   * <pre>
   * tenant root ca (pem)
   * </pre>
   *
   * <code>string TenantRoot = 3;</code>
   * @return The bytes for tenantRoot.
   */
  com.google.protobuf.ByteString
      getTenantRootBytes();
}
