// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic.proto

package edu.usc.softarch.generic.helloworld;

public final class GenericProto {
  private GenericProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generic_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generic_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generic_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generic_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rgeneric.proto\022\007generic\"\034\n\014HelloRequest" +
      "\022\014\n\004name\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007message\030" +
      "\001 \001(\t2C\n\007Greeter\0228\n\010SayHello\022\025.generic.H" +
      "elloRequest\032\023.generic.HelloReply\"\000B;\n#ed" +
      "u.usc.softarch.generic.helloworldB\014Gener" +
      "icProtoP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_generic_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_generic_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generic_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_generic_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_generic_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generic_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
