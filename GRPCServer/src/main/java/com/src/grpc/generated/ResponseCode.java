// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageService.proto

package com.src.grpc.generated;

/**
 * Protobuf enum {@code ResponseCode}
 */
public enum ResponseCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Unknown = 0;</code>
   */
  Unknown(0),
  /**
   * <code>Success = 1;</code>
   */
  Success(1),
  /**
   * <code>Failed = 2;</code>
   */
  Failed(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Unknown = 0;</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <code>Success = 1;</code>
   */
  public static final int Success_VALUE = 1;
  /**
   * <code>Failed = 2;</code>
   */
  public static final int Failed_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ResponseCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResponseCode forNumber(int value) {
    switch (value) {
      case 0: return Unknown;
      case 1: return Success;
      case 2: return Failed;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResponseCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResponseCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResponseCode>() {
          public ResponseCode findValueByNumber(int number) {
            return ResponseCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.src.grpc.generated.MessageService.getDescriptor().getEnumTypes().get(0);
  }

  private static final ResponseCode[] VALUES = values();

  public static ResponseCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResponseCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ResponseCode)
}

