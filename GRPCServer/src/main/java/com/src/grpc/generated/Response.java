// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageService.proto

package com.src.grpc.generated;

/**
 * Protobuf type {@code Response}
 */
public  final class Response extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Response)
    ResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Response.newBuilder() to construct.
  private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Response() {
    responseMessage_ = "";
    code_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Response();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Response(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            responseMessage_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            code_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.src.grpc.generated.MessageService.internal_static_Response_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.src.grpc.generated.MessageService.internal_static_Response_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.src.grpc.generated.Response.class, com.src.grpc.generated.Response.Builder.class);
  }

  public static final int RESPONSEMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object responseMessage_;
  /**
   * <code>string responseMessage = 1;</code>
   * @return The responseMessage.
   */
  public java.lang.String getResponseMessage() {
    java.lang.Object ref = responseMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string responseMessage = 1;</code>
   * @return The bytes for responseMessage.
   */
  public com.google.protobuf.ByteString
      getResponseMessageBytes() {
    java.lang.Object ref = responseMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private int code_;
  /**
   * <code>.ResponseCode Code = 2;</code>
   * @return The enum numeric value on the wire for code.
   */
  public int getCodeValue() {
    return code_;
  }
  /**
   * <code>.ResponseCode Code = 2;</code>
   * @return The code.
   */
  public com.src.grpc.generated.ResponseCode getCode() {
    @SuppressWarnings("deprecation")
    com.src.grpc.generated.ResponseCode result = com.src.grpc.generated.ResponseCode.valueOf(code_);
    return result == null ? com.src.grpc.generated.ResponseCode.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getResponseMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, responseMessage_);
    }
    if (code_ != com.src.grpc.generated.ResponseCode.Unknown.getNumber()) {
      output.writeEnum(2, code_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResponseMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, responseMessage_);
    }
    if (code_ != com.src.grpc.generated.ResponseCode.Unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, code_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.src.grpc.generated.Response)) {
      return super.equals(obj);
    }
    com.src.grpc.generated.Response other = (com.src.grpc.generated.Response) obj;

    if (!getResponseMessage()
        .equals(other.getResponseMessage())) return false;
    if (code_ != other.code_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESPONSEMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseMessage().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.src.grpc.generated.Response parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.src.grpc.generated.Response parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.src.grpc.generated.Response parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.src.grpc.generated.Response parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.src.grpc.generated.Response parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.src.grpc.generated.Response parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.src.grpc.generated.Response parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.src.grpc.generated.Response parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.src.grpc.generated.Response parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.src.grpc.generated.Response parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.src.grpc.generated.Response parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.src.grpc.generated.Response parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.src.grpc.generated.Response prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Response}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Response)
      com.src.grpc.generated.ResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.src.grpc.generated.MessageService.internal_static_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.src.grpc.generated.MessageService.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.src.grpc.generated.Response.class, com.src.grpc.generated.Response.Builder.class);
    }

    // Construct using com.src.grpc.Response.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      responseMessage_ = "";

      code_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.src.grpc.generated.MessageService.internal_static_Response_descriptor;
    }

    @java.lang.Override
    public com.src.grpc.generated.Response getDefaultInstanceForType() {
      return com.src.grpc.generated.Response.getDefaultInstance();
    }

    @java.lang.Override
    public com.src.grpc.generated.Response build() {
      com.src.grpc.generated.Response result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.src.grpc.generated.Response buildPartial() {
      com.src.grpc.generated.Response result = new com.src.grpc.generated.Response(this);
      result.responseMessage_ = responseMessage_;
      result.code_ = code_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.src.grpc.generated.Response) {
        return mergeFrom((com.src.grpc.generated.Response)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.src.grpc.generated.Response other) {
      if (other == com.src.grpc.generated.Response.getDefaultInstance()) return this;
      if (!other.getResponseMessage().isEmpty()) {
        responseMessage_ = other.responseMessage_;
        onChanged();
      }
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.src.grpc.generated.Response parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.src.grpc.generated.Response) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object responseMessage_ = "";
    /**
     * <code>string responseMessage = 1;</code>
     * @return The responseMessage.
     */
    public java.lang.String getResponseMessage() {
      java.lang.Object ref = responseMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string responseMessage = 1;</code>
     * @return The bytes for responseMessage.
     */
    public com.google.protobuf.ByteString
        getResponseMessageBytes() {
      java.lang.Object ref = responseMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string responseMessage = 1;</code>
     * @param value The responseMessage to set.
     * @return This builder for chaining.
     */
    public Builder setResponseMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responseMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string responseMessage = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseMessage() {
      
      responseMessage_ = getDefaultInstance().getResponseMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string responseMessage = 1;</code>
     * @param value The bytes for responseMessage to set.
     * @return This builder for chaining.
     */
    public Builder setResponseMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      responseMessage_ = value;
      onChanged();
      return this;
    }

    private int code_ = 0;
    /**
     * <code>.ResponseCode Code = 2;</code>
     * @return The enum numeric value on the wire for code.
     */
    public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.ResponseCode Code = 2;</code>
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ResponseCode Code = 2;</code>
     * @return The code.
     */
    public com.src.grpc.generated.ResponseCode getCode() {
      @SuppressWarnings("deprecation")
      com.src.grpc.generated.ResponseCode result = com.src.grpc.generated.ResponseCode.valueOf(code_);
      return result == null ? com.src.grpc.generated.ResponseCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.ResponseCode Code = 2;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(com.src.grpc.generated.ResponseCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ResponseCode Code = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Response)
  }

  // @@protoc_insertion_point(class_scope:Response)
  private static final com.src.grpc.generated.Response DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.src.grpc.generated.Response();
  }

  public static com.src.grpc.generated.Response getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Response>
      PARSER = new com.google.protobuf.AbstractParser<Response>() {
    @java.lang.Override
    public Response parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Response(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Response> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Response> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.src.grpc.generated.Response getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
