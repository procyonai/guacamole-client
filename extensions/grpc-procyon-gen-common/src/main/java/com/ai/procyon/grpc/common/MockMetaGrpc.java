package com.ai.procyon.grpc.common;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * fake service definition to keep grpc-swift compiler happy
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: common.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MockMetaGrpc {

  private MockMetaGrpc() {}

  public static final java.lang.String SERVICE_NAME = "model.MockMeta";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ai.procyon.grpc.common.ObjectMeta,
      com.ai.procyon.grpc.common.ObjectMeta> getGetMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMeta",
      requestType = com.ai.procyon.grpc.common.ObjectMeta.class,
      responseType = com.ai.procyon.grpc.common.ObjectMeta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ai.procyon.grpc.common.ObjectMeta,
      com.ai.procyon.grpc.common.ObjectMeta> getGetMetaMethod() {
    io.grpc.MethodDescriptor<com.ai.procyon.grpc.common.ObjectMeta, com.ai.procyon.grpc.common.ObjectMeta> getGetMetaMethod;
    if ((getGetMetaMethod = MockMetaGrpc.getGetMetaMethod) == null) {
      synchronized (MockMetaGrpc.class) {
        if ((getGetMetaMethod = MockMetaGrpc.getGetMetaMethod) == null) {
          MockMetaGrpc.getGetMetaMethod = getGetMetaMethod =
              io.grpc.MethodDescriptor.<com.ai.procyon.grpc.common.ObjectMeta, com.ai.procyon.grpc.common.ObjectMeta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ai.procyon.grpc.common.ObjectMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ai.procyon.grpc.common.ObjectMeta.getDefaultInstance()))
              .setSchemaDescriptor(new MockMetaMethodDescriptorSupplier("GetMeta"))
              .build();
        }
      }
    }
    return getGetMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ai.procyon.grpc.common.ObjectRef,
      com.ai.procyon.grpc.common.ObjectRef> getGetRefMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRef",
      requestType = com.ai.procyon.grpc.common.ObjectRef.class,
      responseType = com.ai.procyon.grpc.common.ObjectRef.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ai.procyon.grpc.common.ObjectRef,
      com.ai.procyon.grpc.common.ObjectRef> getGetRefMethod() {
    io.grpc.MethodDescriptor<com.ai.procyon.grpc.common.ObjectRef, com.ai.procyon.grpc.common.ObjectRef> getGetRefMethod;
    if ((getGetRefMethod = MockMetaGrpc.getGetRefMethod) == null) {
      synchronized (MockMetaGrpc.class) {
        if ((getGetRefMethod = MockMetaGrpc.getGetRefMethod) == null) {
          MockMetaGrpc.getGetRefMethod = getGetRefMethod =
              io.grpc.MethodDescriptor.<com.ai.procyon.grpc.common.ObjectRef, com.ai.procyon.grpc.common.ObjectRef>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRef"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ai.procyon.grpc.common.ObjectRef.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ai.procyon.grpc.common.ObjectRef.getDefaultInstance()))
              .setSchemaDescriptor(new MockMetaMethodDescriptorSupplier("GetRef"))
              .build();
        }
      }
    }
    return getGetRefMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MockMetaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MockMetaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MockMetaStub>() {
        @java.lang.Override
        public MockMetaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MockMetaStub(channel, callOptions);
        }
      };
    return MockMetaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MockMetaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MockMetaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MockMetaBlockingStub>() {
        @java.lang.Override
        public MockMetaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MockMetaBlockingStub(channel, callOptions);
        }
      };
    return MockMetaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MockMetaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MockMetaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MockMetaFutureStub>() {
        @java.lang.Override
        public MockMetaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MockMetaFutureStub(channel, callOptions);
        }
      };
    return MockMetaFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * fake service definition to keep grpc-swift compiler happy
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getMeta(com.ai.procyon.grpc.common.ObjectMeta request,
        io.grpc.stub.StreamObserver<com.ai.procyon.grpc.common.ObjectMeta> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetaMethod(), responseObserver);
    }

    /**
     */
    default void getRef(com.ai.procyon.grpc.common.ObjectRef request,
        io.grpc.stub.StreamObserver<com.ai.procyon.grpc.common.ObjectRef> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRefMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MockMeta.
   * <pre>
   * fake service definition to keep grpc-swift compiler happy
   * </pre>
   */
  public static abstract class MockMetaImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MockMetaGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MockMeta.
   * <pre>
   * fake service definition to keep grpc-swift compiler happy
   * </pre>
   */
  public static final class MockMetaStub
      extends io.grpc.stub.AbstractAsyncStub<MockMetaStub> {
    private MockMetaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MockMetaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MockMetaStub(channel, callOptions);
    }

    /**
     */
    public void getMeta(com.ai.procyon.grpc.common.ObjectMeta request,
        io.grpc.stub.StreamObserver<com.ai.procyon.grpc.common.ObjectMeta> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRef(com.ai.procyon.grpc.common.ObjectRef request,
        io.grpc.stub.StreamObserver<com.ai.procyon.grpc.common.ObjectRef> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRefMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MockMeta.
   * <pre>
   * fake service definition to keep grpc-swift compiler happy
   * </pre>
   */
  public static final class MockMetaBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MockMetaBlockingStub> {
    private MockMetaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MockMetaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MockMetaBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ai.procyon.grpc.common.ObjectMeta getMeta(com.ai.procyon.grpc.common.ObjectMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ai.procyon.grpc.common.ObjectRef getRef(com.ai.procyon.grpc.common.ObjectRef request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRefMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MockMeta.
   * <pre>
   * fake service definition to keep grpc-swift compiler happy
   * </pre>
   */
  public static final class MockMetaFutureStub
      extends io.grpc.stub.AbstractFutureStub<MockMetaFutureStub> {
    private MockMetaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MockMetaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MockMetaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ai.procyon.grpc.common.ObjectMeta> getMeta(
        com.ai.procyon.grpc.common.ObjectMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ai.procyon.grpc.common.ObjectRef> getRef(
        com.ai.procyon.grpc.common.ObjectRef request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRefMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_META = 0;
  private static final int METHODID_GET_REF = 1;

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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_META:
          serviceImpl.getMeta((com.ai.procyon.grpc.common.ObjectMeta) request,
              (io.grpc.stub.StreamObserver<com.ai.procyon.grpc.common.ObjectMeta>) responseObserver);
          break;
        case METHODID_GET_REF:
          serviceImpl.getRef((com.ai.procyon.grpc.common.ObjectRef) request,
              (io.grpc.stub.StreamObserver<com.ai.procyon.grpc.common.ObjectRef>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
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
          getGetMetaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ai.procyon.grpc.common.ObjectMeta,
              com.ai.procyon.grpc.common.ObjectMeta>(
                service, METHODID_GET_META)))
        .addMethod(
          getGetRefMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ai.procyon.grpc.common.ObjectRef,
              com.ai.procyon.grpc.common.ObjectRef>(
                service, METHODID_GET_REF)))
        .build();
  }

  private static abstract class MockMetaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MockMetaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ai.procyon.grpc.common.CommonProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MockMeta");
    }
  }

  private static final class MockMetaFileDescriptorSupplier
      extends MockMetaBaseDescriptorSupplier {
    MockMetaFileDescriptorSupplier() {}
  }

  private static final class MockMetaMethodDescriptorSupplier
      extends MockMetaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MockMetaMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MockMetaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MockMetaFileDescriptorSupplier())
              .addMethod(getGetMetaMethod())
              .addMethod(getGetRefMethod())
              .build();
        }
      }
    }
    return result;
  }
}
