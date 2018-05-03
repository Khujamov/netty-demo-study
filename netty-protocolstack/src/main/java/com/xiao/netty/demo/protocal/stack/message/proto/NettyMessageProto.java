// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

package com.xiao.netty.demo.protocal.stack.message.proto;

public final class NettyMessageProto {
  private NettyMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NettyMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NettyMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * java int 必填选项
     * </pre>
     *
     * <code>int32 magic = 1;</code>
     */
    int getMagic();

    /**
     * <pre>
     * java long 消息ID
     * </pre>
     *
     * <code>uint64 messageid = 2;</code>
     */
    long getMessageid();

    /**
     * <pre>
     * java int 消息类型
     * </pre>
     *
     * <code>.NettyMessage.MessageType type = 3;</code>
     */
    int getTypeValue();
    /**
     * <pre>
     * java int 消息类型
     * </pre>
     *
     * <code>.NettyMessage.MessageType type = 3;</code>
     */
    com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType getType();

    /**
     * <pre>
     * java string 消息内容  可选(心跳握手没有消息体)
     * </pre>
     *
     * <code>string content = 4;</code>
     */
    java.lang.String getContent();
    /**
     * <pre>
     * java string 消息内容  可选(心跳握手没有消息体)
     * </pre>
     *
     * <code>string content = 4;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();
  }
  /**
   * Protobuf type {@code NettyMessage}
   */
  public  static final class NettyMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NettyMessage)
      NettyMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NettyMessage.newBuilder() to construct.
    private NettyMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NettyMessage() {
      magic_ = 0;
      messageid_ = 0L;
      type_ = 0;
      content_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    @SuppressWarnings("unused")
    private NettyMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              magic_ = input.readInt32();
              break;
            }
            case 16: {

              messageid_ = input.readUInt64();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
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
      return com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.internal_static_NettyMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.internal_static_NettyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.class, com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.Builder.class);
    }

    /**
     * <pre>
     * 枚举 消息类型
     * </pre>
     *
     * Protobuf enum {@code NettyMessage.MessageType}
     */
    public enum MessageType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       *业务请求  proto3 从0开始
       * </pre>
       *
       * <code>REQ = 0;</code>
       */
      REQ(0),
      /**
       * <pre>
       *业务响应
       * </pre>
       *
       * <code>RESP = 1;</code>
       */
      RESP(1),
      /**
       * <pre>
       *即是请求也是响应
       * </pre>
       *
       * <code>SERVICE = 2;</code>
       */
      SERVICE(2),
      /**
       * <pre>
       *握手请求
       * </pre>
       *
       * <code>SHAKE_HANDS_REQ = 3;</code>
       */
      SHAKE_HANDS_REQ(3),
      /**
       * <pre>
       *握手应答
       * </pre>
       *
       * <code>SHAKE_HANDS_RESP = 4;</code>
       */
      SHAKE_HANDS_RESP(4),
      /**
       * <pre>
       *心跳 ping
       * </pre>
       *
       * <code>PING = 5;</code>
       */
      PING(5),
      /**
       * <pre>
       *心跳PONG
       * </pre>
       *
       * <code>PONG = 6;</code>
       */
      PONG(6),
      UNRECOGNIZED(-1),
      ;

      /**
       * <pre>
       *业务请求  proto3 从0开始
       * </pre>
       *
       * <code>REQ = 0;</code>
       */
      public static final int REQ_VALUE = 0;
      /**
       * <pre>
       *业务响应
       * </pre>
       *
       * <code>RESP = 1;</code>
       */
      public static final int RESP_VALUE = 1;
      /**
       * <pre>
       *即是请求也是响应
       * </pre>
       *
       * <code>SERVICE = 2;</code>
       */
      public static final int SERVICE_VALUE = 2;
      /**
       * <pre>
       *握手请求
       * </pre>
       *
       * <code>SHAKE_HANDS_REQ = 3;</code>
       */
      public static final int SHAKE_HANDS_REQ_VALUE = 3;
      /**
       * <pre>
       *握手应答
       * </pre>
       *
       * <code>SHAKE_HANDS_RESP = 4;</code>
       */
      public static final int SHAKE_HANDS_RESP_VALUE = 4;
      /**
       * <pre>
       *心跳 ping
       * </pre>
       *
       * <code>PING = 5;</code>
       */
      public static final int PING_VALUE = 5;
      /**
       * <pre>
       *心跳PONG
       * </pre>
       *
       * <code>PONG = 6;</code>
       */
      public static final int PONG_VALUE = 6;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static MessageType valueOf(int value) {
        return forNumber(value);
      }

      public static MessageType forNumber(int value) {
        switch (value) {
          case 0: return REQ;
          case 1: return RESP;
          case 2: return SERVICE;
          case 3: return SHAKE_HANDS_REQ;
          case 4: return SHAKE_HANDS_RESP;
          case 5: return PING;
          case 6: return PONG;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MessageType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
              public MessageType findValueByNumber(int number) {
                return MessageType.forNumber(number);
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
        return com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final MessageType[] VALUES = values();

      public static MessageType valueOf(
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

      private MessageType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:NettyMessage.MessageType)
    }

    public static final int MAGIC_FIELD_NUMBER = 1;
    private int magic_;
    /**
     * <pre>
     * java int 必填选项
     * </pre>
     *
     * <code>int32 magic = 1;</code>
     */
    public int getMagic() {
      return magic_;
    }

    public static final int MESSAGEID_FIELD_NUMBER = 2;
    private long messageid_;
    /**
     * <pre>
     * java long 消息ID
     * </pre>
     *
     * <code>uint64 messageid = 2;</code>
     */
    public long getMessageid() {
      return messageid_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <pre>
     * java int 消息类型
     * </pre>
     *
     * <code>.NettyMessage.MessageType type = 3;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * java int 消息类型
     * </pre>
     *
     * <code>.NettyMessage.MessageType type = 3;</code>
     */
    public com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType getType() {
      com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType result = com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType.valueOf(type_);
      return result == null ? com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType.UNRECOGNIZED : result;
    }

    public static final int CONTENT_FIELD_NUMBER = 4;
    private volatile java.lang.Object content_;
    /**
     * <pre>
     * java string 消息内容  可选(心跳握手没有消息体)
     * </pre>
     *
     * <code>string content = 4;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * java string 消息内容  可选(心跳握手没有消息体)
     * </pre>
     *
     * <code>string content = 4;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (magic_ != 0) {
        output.writeInt32(1, magic_);
      }
      if (messageid_ != 0L) {
        output.writeUInt64(2, messageid_);
      }
      if (type_ != com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType.REQ.getNumber()) {
        output.writeEnum(3, type_);
      }
      if (!getContentBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, content_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (magic_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, magic_);
      }
      if (messageid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, messageid_);
      }
      if (type_ != com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType.REQ.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      if (!getContentBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, content_);
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
      if (!(obj instanceof com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage)) {
        return super.equals(obj);
      }
      com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage other = (com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage) obj;

      boolean result = true;
      result = result && (getMagic()
          == other.getMagic());
      result = result && (getMessageid()
          == other.getMessageid());
      result = result && type_ == other.type_;
      result = result && getContent()
          .equals(other.getContent());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @SuppressWarnings("unchecked")
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MAGIC_FIELD_NUMBER;
      hash = (53 * hash) + getMagic();
      hash = (37 * hash) + MESSAGEID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMessageid());
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code NettyMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NettyMessage)
        com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.internal_static_NettyMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.internal_static_NettyMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.class, com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.Builder.class);
      }

      // Construct using com.xiao.netty.demo.protocal.stack.message.NettyMessageProto.NettyMessage.newBuilder()
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
      public Builder clear() {
        super.clear();
        magic_ = 0;

        messageid_ = 0L;

        type_ = 0;

        content_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.internal_static_NettyMessage_descriptor;
      }

      public com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage getDefaultInstanceForType() {
        return com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.getDefaultInstance();
      }

      public com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage build() {
        com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage buildPartial() {
        com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage result = new com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage(this);
        result.magic_ = magic_;
        result.messageid_ = messageid_;
        result.type_ = type_;
        result.content_ = content_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage) {
          return mergeFrom((com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage other) {
        if (other == com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.getDefaultInstance()) return this;
        if (other.getMagic() != 0) {
          setMagic(other.getMagic());
        }
        if (other.getMessageid() != 0L) {
          setMessageid(other.getMessageid());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int magic_ ;
      /**
       * <pre>
       * java int 必填选项
       * </pre>
       *
       * <code>int32 magic = 1;</code>
       */
      public int getMagic() {
        return magic_;
      }
      /**
       * <pre>
       * java int 必填选项
       * </pre>
       *
       * <code>int32 magic = 1;</code>
       */
      public Builder setMagic(int value) {
        
        magic_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * java int 必填选项
       * </pre>
       *
       * <code>int32 magic = 1;</code>
       */
      public Builder clearMagic() {
        
        magic_ = 0;
        onChanged();
        return this;
      }

      private long messageid_ ;
      /**
       * <pre>
       * java long 消息ID
       * </pre>
       *
       * <code>uint64 messageid = 2;</code>
       */
      public long getMessageid() {
        return messageid_;
      }
      /**
       * <pre>
       * java long 消息ID
       * </pre>
       *
       * <code>uint64 messageid = 2;</code>
       */
      public Builder setMessageid(long value) {
        
        messageid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * java long 消息ID
       * </pre>
       *
       * <code>uint64 messageid = 2;</code>
       */
      public Builder clearMessageid() {
        
        messageid_ = 0L;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <pre>
       * java int 消息类型
       * </pre>
       *
       * <code>.NettyMessage.MessageType type = 3;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <pre>
       * java int 消息类型
       * </pre>
       *
       * <code>.NettyMessage.MessageType type = 3;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * java int 消息类型
       * </pre>
       *
       * <code>.NettyMessage.MessageType type = 3;</code>
       */
      public com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType getType() {
        com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType result = com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType.valueOf(type_);
        return result == null ? com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * java int 消息类型
       * </pre>
       *
       * <code>.NettyMessage.MessageType type = 3;</code>
       */
      public Builder setType(com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage.MessageType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * java int 消息类型
       * </pre>
       *
       * <code>.NettyMessage.MessageType type = 3;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <pre>
       * java string 消息内容  可选(心跳握手没有消息体)
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * java string 消息内容  可选(心跳握手没有消息体)
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * java string 消息内容  可选(心跳握手没有消息体)
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * java string 消息内容  可选(心跳握手没有消息体)
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * java string 消息内容  可选(心跳握手没有消息体)
       * </pre>
       *
       * <code>string content = 4;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:NettyMessage)
    }

    // @@protoc_insertion_point(class_scope:NettyMessage)
    private static final com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage();
    }

    public static com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NettyMessage>
        PARSER = new com.google.protobuf.AbstractParser<NettyMessage>() {
      public NettyMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NettyMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NettyMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NettyMessage> getParserForType() {
      return PARSER;
    }

    public com.xiao.netty.demo.protocal.stack.message.proto.NettyMessageProto.NettyMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NettyMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NettyMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rMessage.proto\"\330\001\n\014NettyMessage\022\r\n\005magi" +
      "c\030\001 \001(\005\022\021\n\tmessageid\030\002 \001(\004\022\'\n\004type\030\003 \001(\016" +
      "2\031.NettyMessage.MessageType\022\017\n\007content\030\004" +
      " \001(\t\"l\n\013MessageType\022\007\n\003REQ\020\000\022\010\n\004RESP\020\001\022\013" +
      "\n\007SERVICE\020\002\022\023\n\017SHAKE_HANDS_REQ\020\003\022\024\n\020SHAK" +
      "E_HANDS_RESP\020\004\022\010\n\004PING\020\005\022\010\n\004PONG\020\006B?\n*co" +
      "m.xiao.netty.demo.protocal.stack.message" +
      "B\021NettyMessageProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_NettyMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NettyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NettyMessage_descriptor,
        new java.lang.String[] { "Magic", "Messageid", "Type", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
