package com.ai.procyon.grpc.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: notary.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NotaryOpenServiceGrpc {

  private NotaryOpenServiceGrpc() {}

  public static final String SERVICE_NAME = "rpc.NotaryOpenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ProxyCertReq,
      ProxyCertRes> getGenProxyCertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenProxyCert",
      requestType = ProxyCertReq.class,
      responseType = ProxyCertRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProxyCertReq,
      ProxyCertRes> getGenProxyCertMethod() {
    io.grpc.MethodDescriptor<ProxyCertReq, ProxyCertRes> getGenProxyCertMethod;
    if ((getGenProxyCertMethod = NotaryOpenServiceGrpc.getGenProxyCertMethod) == null) {
      synchronized (NotaryOpenServiceGrpc.class) {
        if ((getGenProxyCertMethod = NotaryOpenServiceGrpc.getGenProxyCertMethod) == null) {
          NotaryOpenServiceGrpc.getGenProxyCertMethod = getGenProxyCertMethod =
              io.grpc.MethodDescriptor.<ProxyCertReq, ProxyCertRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenProxyCert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProxyCertReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProxyCertRes.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryOpenServiceMethodDescriptorSupplier("GenProxyCert"))
              .build();
        }
      }
    }
    return getGenProxyCertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TargetCertReq,
      TargetCertRes> getGenTargetCertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenTargetCert",
      requestType = TargetCertReq.class,
      responseType = TargetCertRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TargetCertReq,
      TargetCertRes> getGenTargetCertMethod() {
    io.grpc.MethodDescriptor<TargetCertReq, TargetCertRes> getGenTargetCertMethod;
    if ((getGenTargetCertMethod = NotaryOpenServiceGrpc.getGenTargetCertMethod) == null) {
      synchronized (NotaryOpenServiceGrpc.class) {
        if ((getGenTargetCertMethod = NotaryOpenServiceGrpc.getGenTargetCertMethod) == null) {
          NotaryOpenServiceGrpc.getGenTargetCertMethod = getGenTargetCertMethod =
              io.grpc.MethodDescriptor.<TargetCertReq, TargetCertRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenTargetCert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TargetCertReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TargetCertRes.getDefaultInstance()))
              .setSchemaDescriptor(new NotaryOpenServiceMethodDescriptorSupplier("GenTargetCert"))
              .build();
        }
      }
    }
    return getGenTargetCertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotaryOpenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotaryOpenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotaryOpenServiceStub>() {
        @Override
        public NotaryOpenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotaryOpenServiceStub(channel, callOptions);
        }
      };
    return NotaryOpenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotaryOpenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotaryOpenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotaryOpenServiceBlockingStub>() {
        @Override
        public NotaryOpenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotaryOpenServiceBlockingStub(channel, callOptions);
        }
      };
    return NotaryOpenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotaryOpenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotaryOpenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotaryOpenServiceFutureStub>() {
        @Override
        public NotaryOpenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotaryOpenServiceFutureStub(channel, callOptions);
        }
      };
    return NotaryOpenServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * generate cert for proxy
     * </pre>
     */
    default void genProxyCert(ProxyCertReq request,
                              io.grpc.stub.StreamObserver<ProxyCertRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenProxyCertMethod(), responseObserver);
    }

    /**
     * <pre>
     * generate cert for target
     * </pre>
     */
    default void genTargetCert(TargetCertReq request,
                               io.grpc.stub.StreamObserver<TargetCertRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenTargetCertMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NotaryOpenService.
   */
  public static abstract class NotaryOpenServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return NotaryOpenServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NotaryOpenService.
   */
  public static final class NotaryOpenServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NotaryOpenServiceStub> {
    private NotaryOpenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NotaryOpenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotaryOpenServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * generate cert for proxy
     * </pre>
     */
    public void genProxyCert(ProxyCertReq request,
                             io.grpc.stub.StreamObserver<ProxyCertRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenProxyCertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * generate cert for target
     * </pre>
     */
    public void genTargetCert(TargetCertReq request,
                              io.grpc.stub.StreamObserver<TargetCertRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenTargetCertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NotaryOpenService.
   */
  public static final class NotaryOpenServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NotaryOpenServiceBlockingStub> {
    private NotaryOpenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NotaryOpenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotaryOpenServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * generate cert for proxy
     * </pre>
     */
    public ProxyCertRes genProxyCert(ProxyCertReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenProxyCertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * generate cert for target
     * </pre>
     */
    public TargetCertRes genTargetCert(TargetCertReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenTargetCertMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NotaryOpenService.
   */
  public static final class NotaryOpenServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NotaryOpenServiceFutureStub> {
    private NotaryOpenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NotaryOpenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotaryOpenServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * generate cert for proxy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ProxyCertRes> genProxyCert(
        ProxyCertReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenProxyCertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * generate cert for target
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<TargetCertRes> genTargetCert(
        TargetCertReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenTargetCertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GEN_PROXY_CERT = 0;
  private static final int METHODID_GEN_TARGET_CERT = 1;

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
        case METHODID_GEN_PROXY_CERT:
          serviceImpl.genProxyCert((ProxyCertReq) request,
              (io.grpc.stub.StreamObserver<ProxyCertRes>) responseObserver);
          break;
        case METHODID_GEN_TARGET_CERT:
          serviceImpl.genTargetCert((TargetCertReq) request,
              (io.grpc.stub.StreamObserver<TargetCertRes>) responseObserver);
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
          getGenProxyCertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ProxyCertReq,
              ProxyCertRes>(
                service, METHODID_GEN_PROXY_CERT)))
        .addMethod(
          getGenTargetCertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              TargetCertReq,
              TargetCertRes>(
                service, METHODID_GEN_TARGET_CERT)))
        .build();
  }

  private static abstract class NotaryOpenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotaryOpenServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return RPCProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotaryOpenService");
    }
  }

  private static final class NotaryOpenServiceFileDescriptorSupplier
      extends NotaryOpenServiceBaseDescriptorSupplier {
    NotaryOpenServiceFileDescriptorSupplier() {}
  }

  private static final class NotaryOpenServiceMethodDescriptorSupplier
      extends NotaryOpenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotaryOpenServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotaryOpenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotaryOpenServiceFileDescriptorSupplier())
              .addMethod(getGenProxyCertMethod())
              .addMethod(getGenTargetCertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
