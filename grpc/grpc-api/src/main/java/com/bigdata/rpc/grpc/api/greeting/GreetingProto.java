// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting.proto

package com.bigdata.rpc.grpc.api.greeting;

public final class GreetingProto {
  private GreetingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bigdata_rpc_grpc_api_GreetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bigdata_rpc_grpc_api_GreetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bigdata_rpc_grpc_api_GreetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bigdata_rpc_grpc_api_GreetingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016greeting.proto\022\030com.bigdata.rpc.grpc.a" +
      "pi\"\037\n\017GreetingRequest\022\014\n\004name\030\001 \001(\t\"\037\n\020G" +
      "reetingResponse\022\013\n\003msg\030\001 \001(\t2o\n\010Greeting" +
      "\022c\n\010SayHello\022).com.bigdata.rpc.grpc.api." +
      "GreetingRequest\032*.com.bigdata.rpc.grpc.a" +
      "pi.GreetingResponse\"\000B<\n!com.bigdata.rpc" +
      ".grpc.api.greetingB\rGreetingProtoP\001\242\002\005Hu" +
      "Haob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_bigdata_rpc_grpc_api_GreetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bigdata_rpc_grpc_api_GreetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bigdata_rpc_grpc_api_GreetingRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_bigdata_rpc_grpc_api_GreetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_bigdata_rpc_grpc_api_GreetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bigdata_rpc_grpc_api_GreetingResponse_descriptor,
        new java.lang.String[] { "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
