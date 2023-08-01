package com.ai.procyon.grpc.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: notary.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NotaryServiceGrpc {

  private NotaryServiceGrpc() {}

  public static final String SERVICE_NAME = "rpc.NotaryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<KeyPairMsg,
      KeyPairMsg> getCreateKeyPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateKeyPair",
      requestType = KeyPairMsg.class,
      responseType = KeyPairMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<KeyPairMsg,
      KeyPairMsg> getCreateKeyPairMethod() {
    io.grpc.MethodDescriptor<KeyPairMsg, KeyPairMsg> getCreateKeyPairMethod;
    if ((getCreateKeyPairMethod = NotaryServiceGrpc.getCreateKeyPairMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getCreateKeyPairMethod = NotaryServiceGrpc.getCreateKeyPairMethod) == null) {
          NotaryServiceGrpc.getCreateKeyPairMethod = getCreateKeyPairMethod =
              io.grpc.MethodDescriptor.<KeyPairMsg, KeyPairMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateKeyPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  KeyPairMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  KeyPairMsg.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("CreateKeyPair"))
              .build();
        }
      }
    }
    return getCreateKeyPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<KeyPairMsg,
      KeyPairMsg> getGetKeyInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKeyInfo",
      requestType = KeyPairMsg.class,
      responseType = KeyPairMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<KeyPairMsg,
      KeyPairMsg> getGetKeyInfoMethod() {
    io.grpc.MethodDescriptor<KeyPairMsg, KeyPairMsg> getGetKeyInfoMethod;
    if ((getGetKeyInfoMethod = NotaryServiceGrpc.getGetKeyInfoMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGetKeyInfoMethod = NotaryServiceGrpc.getGetKeyInfoMethod) == null) {
          NotaryServiceGrpc.getGetKeyInfoMethod = getGetKeyInfoMethod =
              io.grpc.MethodDescriptor.<KeyPairMsg, KeyPairMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKeyInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  KeyPairMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  KeyPairMsg.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GetKeyInfo"))
              .build();
        }
      }
    }
    return getGetKeyInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SignCertReq,
      SignResp> getSignCertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignCert",
      requestType = SignCertReq.class,
      responseType = SignResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SignCertReq,
      SignResp> getSignCertMethod() {
    io.grpc.MethodDescriptor<SignCertReq, SignResp> getSignCertMethod;
    if ((getSignCertMethod = NotaryServiceGrpc.getSignCertMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getSignCertMethod = NotaryServiceGrpc.getSignCertMethod) == null) {
          NotaryServiceGrpc.getSignCertMethod = getSignCertMethod =
              io.grpc.MethodDescriptor.<SignCertReq, SignResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignCert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignCertReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignResp.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("SignCert"))
              .build();
        }
      }
    }
    return getSignCertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SignCertReq,
      SignResp> getSignSSHCertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignSSHCert",
      requestType = SignCertReq.class,
      responseType = SignResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SignCertReq,
      SignResp> getSignSSHCertMethod() {
    io.grpc.MethodDescriptor<SignCertReq, SignResp> getSignSSHCertMethod;
    if ((getSignSSHCertMethod = NotaryServiceGrpc.getSignSSHCertMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getSignSSHCertMethod = NotaryServiceGrpc.getSignSSHCertMethod) == null) {
          NotaryServiceGrpc.getSignSSHCertMethod = getSignSSHCertMethod =
              io.grpc.MethodDescriptor.<SignCertReq, SignResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignSSHCert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignCertReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignResp.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("SignSSHCert"))
              .build();
        }
      }
    }
    return getSignSSHCertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SignDigestReq,
      SignResp> getSignDigestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignDigest",
      requestType = SignDigestReq.class,
      responseType = SignResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SignDigestReq,
      SignResp> getSignDigestMethod() {
    io.grpc.MethodDescriptor<SignDigestReq, SignResp> getSignDigestMethod;
    if ((getSignDigestMethod = NotaryServiceGrpc.getSignDigestMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getSignDigestMethod = NotaryServiceGrpc.getSignDigestMethod) == null) {
          NotaryServiceGrpc.getSignDigestMethod = getSignDigestMethod =
              io.grpc.MethodDescriptor.<SignDigestReq, SignResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignDigest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignDigestReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignResp.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("SignDigest"))
              .build();
        }
      }
    }
    return getSignDigestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SignDigestReq,
      SignResp> getSignJWTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignJWT",
      requestType = SignDigestReq.class,
      responseType = SignResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SignDigestReq,
      SignResp> getSignJWTMethod() {
    io.grpc.MethodDescriptor<SignDigestReq, SignResp> getSignJWTMethod;
    if ((getSignJWTMethod = NotaryServiceGrpc.getSignJWTMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getSignJWTMethod = NotaryServiceGrpc.getSignJWTMethod) == null) {
          NotaryServiceGrpc.getSignJWTMethod = getSignJWTMethod =
              io.grpc.MethodDescriptor.<SignDigestReq, SignResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignJWT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignDigestReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SignResp.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("SignJWT"))
              .build();
        }
      }
    }
    return getSignJWTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<KeyPairMsg,
      KeyPairMsg> getDeleteKeyPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteKeyPair",
      requestType = KeyPairMsg.class,
      responseType = KeyPairMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<KeyPairMsg,
      KeyPairMsg> getDeleteKeyPairMethod() {
    io.grpc.MethodDescriptor<KeyPairMsg, KeyPairMsg> getDeleteKeyPairMethod;
    if ((getDeleteKeyPairMethod = NotaryServiceGrpc.getDeleteKeyPairMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getDeleteKeyPairMethod = NotaryServiceGrpc.getDeleteKeyPairMethod) == null) {
          NotaryServiceGrpc.getDeleteKeyPairMethod = getDeleteKeyPairMethod =
              io.grpc.MethodDescriptor.<KeyPairMsg, KeyPairMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteKeyPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  KeyPairMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  KeyPairMsg.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("DeleteKeyPair"))
              .build();
        }
      }
    }
    return getDeleteKeyPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<InfraCertReq,
      InfraCertResp> getGenerateInfraCertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateInfraCert",
      requestType = InfraCertReq.class,
      responseType = InfraCertResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<InfraCertReq,
      InfraCertResp> getGenerateInfraCertMethod() {
    io.grpc.MethodDescriptor<InfraCertReq, InfraCertResp> getGenerateInfraCertMethod;
    if ((getGenerateInfraCertMethod = NotaryServiceGrpc.getGenerateInfraCertMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGenerateInfraCertMethod = NotaryServiceGrpc.getGenerateInfraCertMethod) == null) {
          NotaryServiceGrpc.getGenerateInfraCertMethod = getGenerateInfraCertMethod =
              io.grpc.MethodDescriptor.<InfraCertReq, InfraCertResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateInfraCert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  InfraCertReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  InfraCertResp.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GenerateInfraCert"))
              .build();
        }
      }
    }
    return getGenerateInfraCertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProxyTokenReq,
      ProxyTokenResp> getGenerateProxyTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateProxyToken",
      requestType = ProxyTokenReq.class,
      responseType = ProxyTokenResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProxyTokenReq,
      ProxyTokenResp> getGenerateProxyTokenMethod() {
    io.grpc.MethodDescriptor<ProxyTokenReq, ProxyTokenResp> getGenerateProxyTokenMethod;
    if ((getGenerateProxyTokenMethod = NotaryServiceGrpc.getGenerateProxyTokenMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGenerateProxyTokenMethod = NotaryServiceGrpc.getGenerateProxyTokenMethod) == null) {
          NotaryServiceGrpc.getGenerateProxyTokenMethod = getGenerateProxyTokenMethod =
              io.grpc.MethodDescriptor.<ProxyTokenReq, ProxyTokenResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateProxyToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProxyTokenReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProxyTokenResp.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GenerateProxyToken"))
              .build();
        }
      }
    }
    return getGenerateProxyTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DeviceTokenMeta,
      DeviceToken> getGenerateDeviceTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateDeviceToken",
      requestType = DeviceTokenMeta.class,
      responseType = DeviceToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DeviceTokenMeta,
      DeviceToken> getGenerateDeviceTokenMethod() {
    io.grpc.MethodDescriptor<DeviceTokenMeta, DeviceToken> getGenerateDeviceTokenMethod;
    if ((getGenerateDeviceTokenMethod = NotaryServiceGrpc.getGenerateDeviceTokenMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGenerateDeviceTokenMethod = NotaryServiceGrpc.getGenerateDeviceTokenMethod) == null) {
          NotaryServiceGrpc.getGenerateDeviceTokenMethod = getGenerateDeviceTokenMethod =
              io.grpc.MethodDescriptor.<DeviceTokenMeta, DeviceToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateDeviceToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeviceTokenMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeviceToken.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GenerateDeviceToken"))
              .build();
        }
      }
    }
    return getGenerateDeviceTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DeviceTokenID,
      DeviceTokenMeta> getGetDeviceTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeviceToken",
      requestType = DeviceTokenID.class,
      responseType = DeviceTokenMeta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DeviceTokenID,
      DeviceTokenMeta> getGetDeviceTokenMethod() {
    io.grpc.MethodDescriptor<DeviceTokenID, DeviceTokenMeta> getGetDeviceTokenMethod;
    if ((getGetDeviceTokenMethod = NotaryServiceGrpc.getGetDeviceTokenMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGetDeviceTokenMethod = NotaryServiceGrpc.getGetDeviceTokenMethod) == null) {
          NotaryServiceGrpc.getGetDeviceTokenMethod = getGetDeviceTokenMethod =
              io.grpc.MethodDescriptor.<DeviceTokenID, DeviceTokenMeta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeviceToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeviceTokenID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeviceTokenMeta.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GetDeviceToken"))
              .build();
        }
      }
    }
    return getGetDeviceTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OnboardToken,
      OnboardToken> getGenerateOnboardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateOnboardToken",
      requestType = OnboardToken.class,
      responseType = OnboardToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OnboardToken,
      OnboardToken> getGenerateOnboardTokenMethod() {
    io.grpc.MethodDescriptor<OnboardToken, OnboardToken> getGenerateOnboardTokenMethod;
    if ((getGenerateOnboardTokenMethod = NotaryServiceGrpc.getGenerateOnboardTokenMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGenerateOnboardTokenMethod = NotaryServiceGrpc.getGenerateOnboardTokenMethod) == null) {
          NotaryServiceGrpc.getGenerateOnboardTokenMethod = getGenerateOnboardTokenMethod =
              io.grpc.MethodDescriptor.<OnboardToken, OnboardToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateOnboardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OnboardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OnboardToken.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GenerateOnboardToken"))
              .build();
        }
      }
    }
    return getGenerateOnboardTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OnboardToken,
      OnboardToken> getGetOnboardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOnboardToken",
      requestType = OnboardToken.class,
      responseType = OnboardToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OnboardToken,
      OnboardToken> getGetOnboardTokenMethod() {
    io.grpc.MethodDescriptor<OnboardToken, OnboardToken> getGetOnboardTokenMethod;
    if ((getGetOnboardTokenMethod = NotaryServiceGrpc.getGetOnboardTokenMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGetOnboardTokenMethod = NotaryServiceGrpc.getGetOnboardTokenMethod) == null) {
          NotaryServiceGrpc.getGetOnboardTokenMethod = getGetOnboardTokenMethod =
              io.grpc.MethodDescriptor.<OnboardToken, OnboardToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOnboardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OnboardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OnboardToken.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GetOnboardToken"))
              .build();
        }
      }
    }
    return getGetOnboardTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<InfraRootIn,
      InfraRootOut> getGetInfraRootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfraRoot",
      requestType = InfraRootIn.class,
      responseType = InfraRootOut.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<InfraRootIn,
      InfraRootOut> getGetInfraRootMethod() {
    io.grpc.MethodDescriptor<InfraRootIn, InfraRootOut> getGetInfraRootMethod;
    if ((getGetInfraRootMethod = NotaryServiceGrpc.getGetInfraRootMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGetInfraRootMethod = NotaryServiceGrpc.getGetInfraRootMethod) == null) {
          NotaryServiceGrpc.getGetInfraRootMethod = getGetInfraRootMethod =
              io.grpc.MethodDescriptor.<InfraRootIn, InfraRootOut>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInfraRoot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  InfraRootIn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  InfraRootOut.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GetInfraRoot"))
              .build();
        }
      }
    }
    return getGetInfraRootMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TenantApiIn,
      TenantApiOut> getGetTenantAPIKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTenantAPIKey",
      requestType = TenantApiIn.class,
      responseType = TenantApiOut.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TenantApiIn,
      TenantApiOut> getGetTenantAPIKeyMethod() {
    io.grpc.MethodDescriptor<TenantApiIn, TenantApiOut> getGetTenantAPIKeyMethod;
    if ((getGetTenantAPIKeyMethod = NotaryServiceGrpc.getGetTenantAPIKeyMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGetTenantAPIKeyMethod = NotaryServiceGrpc.getGetTenantAPIKeyMethod) == null) {
          NotaryServiceGrpc.getGetTenantAPIKeyMethod = getGetTenantAPIKeyMethod =
              io.grpc.MethodDescriptor.<TenantApiIn, TenantApiOut>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTenantAPIKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TenantApiIn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TenantApiOut.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GetTenantAPIKey"))
              .build();
        }
      }
    }
    return getGetTenantAPIKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ClientReq,
      TenantApiOut> getDeleteClientCredsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClientCreds",
      requestType = ClientReq.class,
      responseType = TenantApiOut.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ClientReq,
      TenantApiOut> getDeleteClientCredsMethod() {
    io.grpc.MethodDescriptor<ClientReq, TenantApiOut> getDeleteClientCredsMethod;
    if ((getDeleteClientCredsMethod = NotaryServiceGrpc.getDeleteClientCredsMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getDeleteClientCredsMethod = NotaryServiceGrpc.getDeleteClientCredsMethod) == null) {
          NotaryServiceGrpc.getDeleteClientCredsMethod = getDeleteClientCredsMethod =
              io.grpc.MethodDescriptor.<ClientReq, TenantApiOut>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteClientCreds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TenantApiOut.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("DeleteClientCreds"))
              .build();
        }
      }
    }
    return getDeleteClientCredsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ClientReq,
      TenantApiOut> getGetClientDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientData",
      requestType = ClientReq.class,
      responseType = TenantApiOut.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ClientReq,
      TenantApiOut> getGetClientDataMethod() {
    io.grpc.MethodDescriptor<ClientReq, TenantApiOut> getGetClientDataMethod;
    if ((getGetClientDataMethod = NotaryServiceGrpc.getGetClientDataMethod) == null) {
      synchronized (NotaryServiceGrpc.class) {
        if ((getGetClientDataMethod = NotaryServiceGrpc.getGetClientDataMethod) == null) {
          NotaryServiceGrpc.getGetClientDataMethod = getGetClientDataMethod =
              io.grpc.MethodDescriptor.<ClientReq, TenantApiOut>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClientData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TenantApiOut.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryServiceMethodDescriptorSupplier("GetClientData"))
              .build();
        }
      }
    }
    return getGetClientDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotaryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotaryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotaryServiceStub>() {
        @Override
        public NotaryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotaryServiceStub(channel, callOptions);
        }
      };
    return NotaryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotaryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotaryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotaryServiceBlockingStub>() {
        @Override
        public NotaryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotaryServiceBlockingStub(channel, callOptions);
        }
      };
    return NotaryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotaryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotaryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotaryServiceFutureStub>() {
        @Override
        public NotaryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotaryServiceFutureStub(channel, callOptions);
        }
      };
    return NotaryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * create a new key pair
     * </pre>
     */
    default void createKeyPair(KeyPairMsg request,
                               io.grpc.stub.StreamObserver<KeyPairMsg> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateKeyPairMethod(), responseObserver);
    }

    /**
     * <pre>
     * get infor about the key 
     * </pre>
     */
    default void getKeyInfo(KeyPairMsg request,
                            io.grpc.stub.StreamObserver<KeyPairMsg> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKeyInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * sign a certificate using an existing key-pair
     * </pre>
     */
    default void signCert(SignCertReq request,
                          io.grpc.stub.StreamObserver<SignResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignCertMethod(), responseObserver);
    }

    /**
     * <pre>
     * sign a SSH certificate using an existing key-pair
     * </pre>
     */
    default void signSSHCert(SignCertReq request,
                             io.grpc.stub.StreamObserver<SignResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignSSHCertMethod(), responseObserver);
    }

    /**
     * <pre>
     * sign a digest
     * </pre>
     */
    default void signDigest(SignDigestReq request,
                            io.grpc.stub.StreamObserver<SignResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignDigestMethod(), responseObserver);
    }

    /**
     * <pre>
     * sign a digest
     * </pre>
     */
    default void signJWT(SignDigestReq request,
                         io.grpc.stub.StreamObserver<SignResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignJWTMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete a key pair
     * </pre>
     */
    default void deleteKeyPair(KeyPairMsg request,
                               io.grpc.stub.StreamObserver<KeyPairMsg> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteKeyPairMethod(), responseObserver);
    }

    /**
     * <pre>
     *Infra cert generation
     * </pre>
     */
    default void generateInfraCert(InfraCertReq request,
                                   io.grpc.stub.StreamObserver<InfraCertResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateInfraCertMethod(), responseObserver);
    }

    /**
     * <pre>
     * generate ProxyToken
     * </pre>
     */
    default void generateProxyToken(ProxyTokenReq request,
                                    io.grpc.stub.StreamObserver<ProxyTokenResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateProxyTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * generate DeviceToken
     * </pre>
     */
    default void generateDeviceToken(DeviceTokenMeta request,
                                     io.grpc.stub.StreamObserver<DeviceToken> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateDeviceTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * get DeviceToken Meta
     * </pre>
     */
    default void getDeviceToken(DeviceTokenID request,
                                io.grpc.stub.StreamObserver<DeviceTokenMeta> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * generate OnboardToken
     * </pre>
     */
    default void generateOnboardToken(OnboardToken request,
                                      io.grpc.stub.StreamObserver<OnboardToken> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateOnboardTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * get OnboardToken
     * </pre>
     */
    default void getOnboardToken(OnboardToken request,
                                 io.grpc.stub.StreamObserver<OnboardToken> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOnboardTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     *Infra root ca
     * </pre>
     */
    default void getInfraRoot(InfraRootIn request,
                              io.grpc.stub.StreamObserver<InfraRootOut> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInfraRootMethod(), responseObserver);
    }

    /**
     * <pre>
     *Tenant API
     * </pre>
     */
    default void getTenantAPIKey(TenantApiIn request,
                                 io.grpc.stub.StreamObserver<TenantApiOut> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTenantAPIKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete client creds for workload identity
     * </pre>
     */
    default void deleteClientCreds(ClientReq request,
                                   io.grpc.stub.StreamObserver<TenantApiOut> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteClientCredsMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets client data for workload identity using client ID
     * </pre>
     */
    default void getClientData(ClientReq request,
                               io.grpc.stub.StreamObserver<TenantApiOut> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NotaryService.
   */
  public static abstract class NotaryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return NotaryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NotaryService.
   */
  public static final class NotaryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NotaryServiceStub> {
    private NotaryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NotaryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotaryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * create a new key pair
     * </pre>
     */
    public void createKeyPair(KeyPairMsg request,
                              io.grpc.stub.StreamObserver<KeyPairMsg> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateKeyPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get infor about the key 
     * </pre>
     */
    public void getKeyInfo(KeyPairMsg request,
                           io.grpc.stub.StreamObserver<KeyPairMsg> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKeyInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * sign a certificate using an existing key-pair
     * </pre>
     */
    public void signCert(SignCertReq request,
                         io.grpc.stub.StreamObserver<SignResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignCertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * sign a SSH certificate using an existing key-pair
     * </pre>
     */
    public void signSSHCert(SignCertReq request,
                            io.grpc.stub.StreamObserver<SignResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignSSHCertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * sign a digest
     * </pre>
     */
    public void signDigest(SignDigestReq request,
                           io.grpc.stub.StreamObserver<SignResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignDigestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * sign a digest
     * </pre>
     */
    public void signJWT(SignDigestReq request,
                        io.grpc.stub.StreamObserver<SignResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignJWTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete a key pair
     * </pre>
     */
    public void deleteKeyPair(KeyPairMsg request,
                              io.grpc.stub.StreamObserver<KeyPairMsg> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteKeyPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Infra cert generation
     * </pre>
     */
    public void generateInfraCert(InfraCertReq request,
                                  io.grpc.stub.StreamObserver<InfraCertResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateInfraCertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * generate ProxyToken
     * </pre>
     */
    public void generateProxyToken(ProxyTokenReq request,
                                   io.grpc.stub.StreamObserver<ProxyTokenResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateProxyTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * generate DeviceToken
     * </pre>
     */
    public void generateDeviceToken(DeviceTokenMeta request,
                                    io.grpc.stub.StreamObserver<DeviceToken> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateDeviceTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get DeviceToken Meta
     * </pre>
     */
    public void getDeviceToken(DeviceTokenID request,
                               io.grpc.stub.StreamObserver<DeviceTokenMeta> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * generate OnboardToken
     * </pre>
     */
    public void generateOnboardToken(OnboardToken request,
                                     io.grpc.stub.StreamObserver<OnboardToken> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateOnboardTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get OnboardToken
     * </pre>
     */
    public void getOnboardToken(OnboardToken request,
                                io.grpc.stub.StreamObserver<OnboardToken> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOnboardTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Infra root ca
     * </pre>
     */
    public void getInfraRoot(InfraRootIn request,
                             io.grpc.stub.StreamObserver<InfraRootOut> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInfraRootMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Tenant API
     * </pre>
     */
    public void getTenantAPIKey(TenantApiIn request,
                                io.grpc.stub.StreamObserver<TenantApiOut> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTenantAPIKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete client creds for workload identity
     * </pre>
     */
    public void deleteClientCreds(ClientReq request,
                                  io.grpc.stub.StreamObserver<TenantApiOut> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteClientCredsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets client data for workload identity using client ID
     * </pre>
     */
    public void getClientData(ClientReq request,
                              io.grpc.stub.StreamObserver<TenantApiOut> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NotaryService.
   */
  public static final class NotaryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NotaryServiceBlockingStub> {
    private NotaryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NotaryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotaryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * create a new key pair
     * </pre>
     */
    public KeyPairMsg createKeyPair(KeyPairMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateKeyPairMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get infor about the key 
     * </pre>
     */
    public KeyPairMsg getKeyInfo(KeyPairMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKeyInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * sign a certificate using an existing key-pair
     * </pre>
     */
    public SignResp signCert(SignCertReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignCertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * sign a SSH certificate using an existing key-pair
     * </pre>
     */
    public SignResp signSSHCert(SignCertReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignSSHCertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * sign a digest
     * </pre>
     */
    public SignResp signDigest(SignDigestReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignDigestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * sign a digest
     * </pre>
     */
    public SignResp signJWT(SignDigestReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignJWTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete a key pair
     * </pre>
     */
    public KeyPairMsg deleteKeyPair(KeyPairMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteKeyPairMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Infra cert generation
     * </pre>
     */
    public InfraCertResp generateInfraCert(InfraCertReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateInfraCertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * generate ProxyToken
     * </pre>
     */
    public ProxyTokenResp generateProxyToken(ProxyTokenReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateProxyTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * generate DeviceToken
     * </pre>
     */
    public DeviceToken generateDeviceToken(DeviceTokenMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateDeviceTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get DeviceToken Meta
     * </pre>
     */
    public DeviceTokenMeta getDeviceToken(DeviceTokenID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * generate OnboardToken
     * </pre>
     */
    public OnboardToken generateOnboardToken(OnboardToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateOnboardTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get OnboardToken
     * </pre>
     */
    public OnboardToken getOnboardToken(OnboardToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOnboardTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Infra root ca
     * </pre>
     */
    public InfraRootOut getInfraRoot(InfraRootIn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInfraRootMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Tenant API
     * </pre>
     */
    public TenantApiOut getTenantAPIKey(TenantApiIn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTenantAPIKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete client creds for workload identity
     * </pre>
     */
    public TenantApiOut deleteClientCreds(ClientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteClientCredsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets client data for workload identity using client ID
     * </pre>
     */
    public TenantApiOut getClientData(ClientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NotaryService.
   */
  public static final class NotaryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NotaryServiceFutureStub> {
    private NotaryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NotaryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotaryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * create a new key pair
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<KeyPairMsg> createKeyPair(
        KeyPairMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateKeyPairMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get infor about the key 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<KeyPairMsg> getKeyInfo(
        KeyPairMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKeyInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * sign a certificate using an existing key-pair
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SignResp> signCert(
        SignCertReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignCertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * sign a SSH certificate using an existing key-pair
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SignResp> signSSHCert(
        SignCertReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignSSHCertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * sign a digest
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SignResp> signDigest(
        SignDigestReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignDigestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * sign a digest
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SignResp> signJWT(
        SignDigestReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignJWTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete a key pair
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<KeyPairMsg> deleteKeyPair(
        KeyPairMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteKeyPairMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Infra cert generation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<InfraCertResp> generateInfraCert(
        InfraCertReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateInfraCertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * generate ProxyToken
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ProxyTokenResp> generateProxyToken(
        ProxyTokenReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateProxyTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * generate DeviceToken
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DeviceToken> generateDeviceToken(
        DeviceTokenMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateDeviceTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get DeviceToken Meta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DeviceTokenMeta> getDeviceToken(
        DeviceTokenID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * generate OnboardToken
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<OnboardToken> generateOnboardToken(
        OnboardToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateOnboardTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get OnboardToken
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<OnboardToken> getOnboardToken(
        OnboardToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOnboardTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Infra root ca
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<InfraRootOut> getInfraRoot(
        InfraRootIn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInfraRootMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Tenant API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TenantApiOut> getTenantAPIKey(
        TenantApiIn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTenantAPIKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete client creds for workload identity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TenantApiOut> deleteClientCreds(
        ClientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteClientCredsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets client data for workload identity using client ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TenantApiOut> getClientData(
        ClientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_KEY_PAIR = 0;
  private static final int METHODID_GET_KEY_INFO = 1;
  private static final int METHODID_SIGN_CERT = 2;
  private static final int METHODID_SIGN_SSHCERT = 3;
  private static final int METHODID_SIGN_DIGEST = 4;
  private static final int METHODID_SIGN_JWT = 5;
  private static final int METHODID_DELETE_KEY_PAIR = 6;
  private static final int METHODID_GENERATE_INFRA_CERT = 7;
  private static final int METHODID_GENERATE_PROXY_TOKEN = 8;
  private static final int METHODID_GENERATE_DEVICE_TOKEN = 9;
  private static final int METHODID_GET_DEVICE_TOKEN = 10;
  private static final int METHODID_GENERATE_ONBOARD_TOKEN = 11;
  private static final int METHODID_GET_ONBOARD_TOKEN = 12;
  private static final int METHODID_GET_INFRA_ROOT = 13;
  private static final int METHODID_GET_TENANT_APIKEY = 14;
  private static final int METHODID_DELETE_CLIENT_CREDS = 15;
  private static final int METHODID_GET_CLIENT_DATA = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_KEY_PAIR:
          serviceImpl.createKeyPair((KeyPairMsg) request,
              (io.grpc.stub.StreamObserver<KeyPairMsg>) responseObserver);
          break;
        case METHODID_GET_KEY_INFO:
          serviceImpl.getKeyInfo((KeyPairMsg) request,
              (io.grpc.stub.StreamObserver<KeyPairMsg>) responseObserver);
          break;
        case METHODID_SIGN_CERT:
          serviceImpl.signCert((SignCertReq) request,
              (io.grpc.stub.StreamObserver<SignResp>) responseObserver);
          break;
        case METHODID_SIGN_SSHCERT:
          serviceImpl.signSSHCert((SignCertReq) request,
              (io.grpc.stub.StreamObserver<SignResp>) responseObserver);
          break;
        case METHODID_SIGN_DIGEST:
          serviceImpl.signDigest((SignDigestReq) request,
              (io.grpc.stub.StreamObserver<SignResp>) responseObserver);
          break;
        case METHODID_SIGN_JWT:
          serviceImpl.signJWT((SignDigestReq) request,
              (io.grpc.stub.StreamObserver<SignResp>) responseObserver);
          break;
        case METHODID_DELETE_KEY_PAIR:
          serviceImpl.deleteKeyPair((KeyPairMsg) request,
              (io.grpc.stub.StreamObserver<KeyPairMsg>) responseObserver);
          break;
        case METHODID_GENERATE_INFRA_CERT:
          serviceImpl.generateInfraCert((InfraCertReq) request,
              (io.grpc.stub.StreamObserver<InfraCertResp>) responseObserver);
          break;
        case METHODID_GENERATE_PROXY_TOKEN:
          serviceImpl.generateProxyToken((ProxyTokenReq) request,
              (io.grpc.stub.StreamObserver<ProxyTokenResp>) responseObserver);
          break;
        case METHODID_GENERATE_DEVICE_TOKEN:
          serviceImpl.generateDeviceToken((DeviceTokenMeta) request,
              (io.grpc.stub.StreamObserver<DeviceToken>) responseObserver);
          break;
        case METHODID_GET_DEVICE_TOKEN:
          serviceImpl.getDeviceToken((DeviceTokenID) request,
              (io.grpc.stub.StreamObserver<DeviceTokenMeta>) responseObserver);
          break;
        case METHODID_GENERATE_ONBOARD_TOKEN:
          serviceImpl.generateOnboardToken((OnboardToken) request,
              (io.grpc.stub.StreamObserver<OnboardToken>) responseObserver);
          break;
        case METHODID_GET_ONBOARD_TOKEN:
          serviceImpl.getOnboardToken((OnboardToken) request,
              (io.grpc.stub.StreamObserver<OnboardToken>) responseObserver);
          break;
        case METHODID_GET_INFRA_ROOT:
          serviceImpl.getInfraRoot((InfraRootIn) request,
              (io.grpc.stub.StreamObserver<InfraRootOut>) responseObserver);
          break;
        case METHODID_GET_TENANT_APIKEY:
          serviceImpl.getTenantAPIKey((TenantApiIn) request,
              (io.grpc.stub.StreamObserver<TenantApiOut>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT_CREDS:
          serviceImpl.deleteClientCreds((ClientReq) request,
              (io.grpc.stub.StreamObserver<TenantApiOut>) responseObserver);
          break;
        case METHODID_GET_CLIENT_DATA:
          serviceImpl.getClientData((ClientReq) request,
              (io.grpc.stub.StreamObserver<TenantApiOut>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateKeyPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              KeyPairMsg,
              KeyPairMsg>(
                service, METHODID_CREATE_KEY_PAIR)))
        .addMethod(
          getGetKeyInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              KeyPairMsg,
              KeyPairMsg>(
                service, METHODID_GET_KEY_INFO)))
        .addMethod(
          getSignCertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              SignCertReq,
              SignResp>(
                service, METHODID_SIGN_CERT)))
        .addMethod(
          getSignSSHCertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              SignCertReq,
              SignResp>(
                service, METHODID_SIGN_SSHCERT)))
        .addMethod(
          getSignDigestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              SignDigestReq,
              SignResp>(
                service, METHODID_SIGN_DIGEST)))
        .addMethod(
          getSignJWTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              SignDigestReq,
              SignResp>(
                service, METHODID_SIGN_JWT)))
        .addMethod(
          getDeleteKeyPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              KeyPairMsg,
              KeyPairMsg>(
                service, METHODID_DELETE_KEY_PAIR)))
        .addMethod(
          getGenerateInfraCertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              InfraCertReq,
              InfraCertResp>(
                service, METHODID_GENERATE_INFRA_CERT)))
        .addMethod(
          getGenerateProxyTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ProxyTokenReq,
              ProxyTokenResp>(
                service, METHODID_GENERATE_PROXY_TOKEN)))
        .addMethod(
          getGenerateDeviceTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              DeviceTokenMeta,
              DeviceToken>(
                service, METHODID_GENERATE_DEVICE_TOKEN)))
        .addMethod(
          getGetDeviceTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              DeviceTokenID,
              DeviceTokenMeta>(
                service, METHODID_GET_DEVICE_TOKEN)))
        .addMethod(
          getGenerateOnboardTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              OnboardToken,
              OnboardToken>(
                service, METHODID_GENERATE_ONBOARD_TOKEN)))
        .addMethod(
          getGetOnboardTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              OnboardToken,
              OnboardToken>(
                service, METHODID_GET_ONBOARD_TOKEN)))
        .addMethod(
          getGetInfraRootMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              InfraRootIn,
              InfraRootOut>(
                service, METHODID_GET_INFRA_ROOT)))
        .addMethod(
          getGetTenantAPIKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              TenantApiIn,
              TenantApiOut>(
                service, METHODID_GET_TENANT_APIKEY)))
        .addMethod(
          getDeleteClientCredsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ClientReq,
              TenantApiOut>(
                service, METHODID_DELETE_CLIENT_CREDS)))
        .addMethod(
          getGetClientDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ClientReq,
              TenantApiOut>(
                service, METHODID_GET_CLIENT_DATA)))
        .build();
  }

  private static abstract class NotaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotaryServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return RPCProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotaryService");
    }
  }

  private static final class NotaryServiceFileDescriptorSupplier
      extends NotaryServiceBaseDescriptorSupplier {
    NotaryServiceFileDescriptorSupplier() {}
  }

  private static final class NotaryServiceMethodDescriptorSupplier
      extends NotaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotaryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NotaryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotaryServiceFileDescriptorSupplier())
              .addMethod(getCreateKeyPairMethod())
              .addMethod(getGetKeyInfoMethod())
              .addMethod(getSignCertMethod())
              .addMethod(getSignSSHCertMethod())
              .addMethod(getSignDigestMethod())
              .addMethod(getSignJWTMethod())
              .addMethod(getDeleteKeyPairMethod())
              .addMethod(getGenerateInfraCertMethod())
              .addMethod(getGenerateProxyTokenMethod())
              .addMethod(getGenerateDeviceTokenMethod())
              .addMethod(getGetDeviceTokenMethod())
              .addMethod(getGenerateOnboardTokenMethod())
              .addMethod(getGetOnboardTokenMethod())
              .addMethod(getGetInfraRootMethod())
              .addMethod(getGetTenantAPIKeyMethod())
              .addMethod(getDeleteClientCredsMethod())
              .addMethod(getGetClientDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
