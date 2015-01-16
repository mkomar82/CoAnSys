/*
 * This file is part of CoAnSys project.
 * Copyright (c) 2012-2013 ICM-UW
 *
 * CoAnSys is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * CoAnSys is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with CoAnSys. If not, see <http://www.gnu.org/licenses/>.
 */

package pl.edu.icm.coansys.models;

public final class PICProtos {
  private PICProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PicOutOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string docId = 1;
    /**
     * <code>required string docId = 1;</code>
     */
    boolean hasDocId();
    /**
     * <code>required string docId = 1;</code>
     */
    java.lang.String getDocId();
    /**
     * <code>required string docId = 1;</code>
     */
    com.google.protobuf.ByteString
        getDocIdBytes();

    // repeated .pl.edu.icm.coansys.models.Reference refs = 2;
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    java.util.List<pl.edu.icm.coansys.models.PICProtos.Reference> 
        getRefsList();
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    pl.edu.icm.coansys.models.PICProtos.Reference getRefs(int index);
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    int getRefsCount();
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    java.util.List<? extends pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder> 
        getRefsOrBuilderList();
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder getRefsOrBuilder(
        int index);

    // repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> 
        getAuxsList();
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    pl.edu.icm.coansys.models.PICProtos.Auxiliar getAuxs(int index);
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    int getAuxsCount();
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    java.util.List<? extends pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> 
        getAuxsOrBuilderList();
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder getAuxsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code pl.edu.icm.coansys.models.PicOut}
   */
  public static final class PicOut extends
      com.google.protobuf.GeneratedMessage
      implements PicOutOrBuilder {
    // Use PicOut.newBuilder() to construct.
    private PicOut(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PicOut(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PicOut defaultInstance;
    public static PicOut getDefaultInstance() {
      return defaultInstance;
    }

    public PicOut getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PicOut(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              docId_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                refs_ = new java.util.ArrayList<pl.edu.icm.coansys.models.PICProtos.Reference>();
                mutable_bitField0_ |= 0x00000002;
              }
              refs_.add(input.readMessage(pl.edu.icm.coansys.models.PICProtos.Reference.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                auxs_ = new java.util.ArrayList<pl.edu.icm.coansys.models.PICProtos.Auxiliar>();
                mutable_bitField0_ |= 0x00000004;
              }
              auxs_.add(input.readMessage(pl.edu.icm.coansys.models.PICProtos.Auxiliar.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          refs_ = java.util.Collections.unmodifiableList(refs_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          auxs_ = java.util.Collections.unmodifiableList(auxs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_PicOut_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_PicOut_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pl.edu.icm.coansys.models.PICProtos.PicOut.class, pl.edu.icm.coansys.models.PICProtos.PicOut.Builder.class);
    }

    public static com.google.protobuf.Parser<PicOut> PARSER =
        new com.google.protobuf.AbstractParser<PicOut>() {
      public PicOut parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PicOut(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PicOut> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string docId = 1;
    public static final int DOCID_FIELD_NUMBER = 1;
    private java.lang.Object docId_;
    /**
     * <code>required string docId = 1;</code>
     */
    public boolean hasDocId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string docId = 1;</code>
     */
    public java.lang.String getDocId() {
      java.lang.Object ref = docId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          docId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string docId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDocIdBytes() {
      java.lang.Object ref = docId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        docId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .pl.edu.icm.coansys.models.Reference refs = 2;
    public static final int REFS_FIELD_NUMBER = 2;
    private java.util.List<pl.edu.icm.coansys.models.PICProtos.Reference> refs_;
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    public java.util.List<pl.edu.icm.coansys.models.PICProtos.Reference> getRefsList() {
      return refs_;
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    public java.util.List<? extends pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder> 
        getRefsOrBuilderList() {
      return refs_;
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    public int getRefsCount() {
      return refs_.size();
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    public pl.edu.icm.coansys.models.PICProtos.Reference getRefs(int index) {
      return refs_.get(index);
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
     */
    public pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder getRefsOrBuilder(
        int index) {
      return refs_.get(index);
    }

    // repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;
    public static final int AUXS_FIELD_NUMBER = 3;
    private java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> auxs_;
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> getAuxsList() {
      return auxs_;
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public java.util.List<? extends pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> 
        getAuxsOrBuilderList() {
      return auxs_;
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public int getAuxsCount() {
      return auxs_.size();
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public pl.edu.icm.coansys.models.PICProtos.Auxiliar getAuxs(int index) {
      return auxs_.get(index);
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder getAuxsOrBuilder(
        int index) {
      return auxs_.get(index);
    }

    private void initFields() {
      docId_ = "";
      refs_ = java.util.Collections.emptyList();
      auxs_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasDocId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getRefsCount(); i++) {
        if (!getRefs(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getDocIdBytes());
      }
      for (int i = 0; i < refs_.size(); i++) {
        output.writeMessage(2, refs_.get(i));
      }
      for (int i = 0; i < auxs_.size(); i++) {
        output.writeMessage(3, auxs_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getDocIdBytes());
      }
      for (int i = 0; i < refs_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, refs_.get(i));
      }
      for (int i = 0; i < auxs_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, auxs_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static pl.edu.icm.coansys.models.PICProtos.PicOut parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.models.PICProtos.PicOut prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code pl.edu.icm.coansys.models.PicOut}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.models.PICProtos.PicOutOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_PicOut_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_PicOut_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                pl.edu.icm.coansys.models.PICProtos.PicOut.class, pl.edu.icm.coansys.models.PICProtos.PicOut.Builder.class);
      }

      // Construct using pl.edu.icm.coansys.models.PICProtos.PicOut.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRefsFieldBuilder();
          getAuxsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        docId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (refsBuilder_ == null) {
          refs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          refsBuilder_.clear();
        }
        if (auxsBuilder_ == null) {
          auxs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          auxsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_PicOut_descriptor;
      }

      public pl.edu.icm.coansys.models.PICProtos.PicOut getDefaultInstanceForType() {
        return pl.edu.icm.coansys.models.PICProtos.PicOut.getDefaultInstance();
      }

      public pl.edu.icm.coansys.models.PICProtos.PicOut build() {
        pl.edu.icm.coansys.models.PICProtos.PicOut result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public pl.edu.icm.coansys.models.PICProtos.PicOut buildPartial() {
        pl.edu.icm.coansys.models.PICProtos.PicOut result = new pl.edu.icm.coansys.models.PICProtos.PicOut(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.docId_ = docId_;
        if (refsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            refs_ = java.util.Collections.unmodifiableList(refs_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.refs_ = refs_;
        } else {
          result.refs_ = refsBuilder_.build();
        }
        if (auxsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            auxs_ = java.util.Collections.unmodifiableList(auxs_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.auxs_ = auxs_;
        } else {
          result.auxs_ = auxsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.models.PICProtos.PicOut) {
          return mergeFrom((pl.edu.icm.coansys.models.PICProtos.PicOut)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(pl.edu.icm.coansys.models.PICProtos.PicOut other) {
        if (other == pl.edu.icm.coansys.models.PICProtos.PicOut.getDefaultInstance()) return this;
        if (other.hasDocId()) {
          bitField0_ |= 0x00000001;
          docId_ = other.docId_;
          onChanged();
        }
        if (refsBuilder_ == null) {
          if (!other.refs_.isEmpty()) {
            if (refs_.isEmpty()) {
              refs_ = other.refs_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRefsIsMutable();
              refs_.addAll(other.refs_);
            }
            onChanged();
          }
        } else {
          if (!other.refs_.isEmpty()) {
            if (refsBuilder_.isEmpty()) {
              refsBuilder_.dispose();
              refsBuilder_ = null;
              refs_ = other.refs_;
              bitField0_ = (bitField0_ & ~0x00000002);
              refsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getRefsFieldBuilder() : null;
            } else {
              refsBuilder_.addAllMessages(other.refs_);
            }
          }
        }
        if (auxsBuilder_ == null) {
          if (!other.auxs_.isEmpty()) {
            if (auxs_.isEmpty()) {
              auxs_ = other.auxs_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureAuxsIsMutable();
              auxs_.addAll(other.auxs_);
            }
            onChanged();
          }
        } else {
          if (!other.auxs_.isEmpty()) {
            if (auxsBuilder_.isEmpty()) {
              auxsBuilder_.dispose();
              auxsBuilder_ = null;
              auxs_ = other.auxs_;
              bitField0_ = (bitField0_ & ~0x00000004);
              auxsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAuxsFieldBuilder() : null;
            } else {
              auxsBuilder_.addAllMessages(other.auxs_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasDocId()) {
          
          return false;
        }
        for (int i = 0; i < getRefsCount(); i++) {
          if (!getRefs(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        pl.edu.icm.coansys.models.PICProtos.PicOut parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (pl.edu.icm.coansys.models.PICProtos.PicOut) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string docId = 1;
      private java.lang.Object docId_ = "";
      /**
       * <code>required string docId = 1;</code>
       */
      public boolean hasDocId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string docId = 1;</code>
       */
      public java.lang.String getDocId() {
        java.lang.Object ref = docId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          docId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string docId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDocIdBytes() {
        java.lang.Object ref = docId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          docId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string docId = 1;</code>
       */
      public Builder setDocId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        docId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string docId = 1;</code>
       */
      public Builder clearDocId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        docId_ = getDefaultInstance().getDocId();
        onChanged();
        return this;
      }
      /**
       * <code>required string docId = 1;</code>
       */
      public Builder setDocIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        docId_ = value;
        onChanged();
        return this;
      }

      // repeated .pl.edu.icm.coansys.models.Reference refs = 2;
      private java.util.List<pl.edu.icm.coansys.models.PICProtos.Reference> refs_ =
        java.util.Collections.emptyList();
      private void ensureRefsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          refs_ = new java.util.ArrayList<pl.edu.icm.coansys.models.PICProtos.Reference>(refs_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.models.PICProtos.Reference, pl.edu.icm.coansys.models.PICProtos.Reference.Builder, pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder> refsBuilder_;

      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public java.util.List<pl.edu.icm.coansys.models.PICProtos.Reference> getRefsList() {
        if (refsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(refs_);
        } else {
          return refsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public int getRefsCount() {
        if (refsBuilder_ == null) {
          return refs_.size();
        } else {
          return refsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Reference getRefs(int index) {
        if (refsBuilder_ == null) {
          return refs_.get(index);
        } else {
          return refsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public Builder setRefs(
          int index, pl.edu.icm.coansys.models.PICProtos.Reference value) {
        if (refsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRefsIsMutable();
          refs_.set(index, value);
          onChanged();
        } else {
          refsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public Builder setRefs(
          int index, pl.edu.icm.coansys.models.PICProtos.Reference.Builder builderForValue) {
        if (refsBuilder_ == null) {
          ensureRefsIsMutable();
          refs_.set(index, builderForValue.build());
          onChanged();
        } else {
          refsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public Builder addRefs(pl.edu.icm.coansys.models.PICProtos.Reference value) {
        if (refsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRefsIsMutable();
          refs_.add(value);
          onChanged();
        } else {
          refsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public Builder addRefs(
          int index, pl.edu.icm.coansys.models.PICProtos.Reference value) {
        if (refsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRefsIsMutable();
          refs_.add(index, value);
          onChanged();
        } else {
          refsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public Builder addRefs(
          pl.edu.icm.coansys.models.PICProtos.Reference.Builder builderForValue) {
        if (refsBuilder_ == null) {
          ensureRefsIsMutable();
          refs_.add(builderForValue.build());
          onChanged();
        } else {
          refsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public Builder addRefs(
          int index, pl.edu.icm.coansys.models.PICProtos.Reference.Builder builderForValue) {
        if (refsBuilder_ == null) {
          ensureRefsIsMutable();
          refs_.add(index, builderForValue.build());
          onChanged();
        } else {
          refsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public Builder addAllRefs(
          java.lang.Iterable<? extends pl.edu.icm.coansys.models.PICProtos.Reference> values) {
        if (refsBuilder_ == null) {
          ensureRefsIsMutable();
          super.addAll(values, refs_);
          onChanged();
        } else {
          refsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public Builder clearRefs() {
        if (refsBuilder_ == null) {
          refs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          refsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public Builder removeRefs(int index) {
        if (refsBuilder_ == null) {
          ensureRefsIsMutable();
          refs_.remove(index);
          onChanged();
        } else {
          refsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Reference.Builder getRefsBuilder(
          int index) {
        return getRefsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder getRefsOrBuilder(
          int index) {
        if (refsBuilder_ == null) {
          return refs_.get(index);  } else {
          return refsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public java.util.List<? extends pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder> 
           getRefsOrBuilderList() {
        if (refsBuilder_ != null) {
          return refsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(refs_);
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Reference.Builder addRefsBuilder() {
        return getRefsFieldBuilder().addBuilder(
            pl.edu.icm.coansys.models.PICProtos.Reference.getDefaultInstance());
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Reference.Builder addRefsBuilder(
          int index) {
        return getRefsFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.models.PICProtos.Reference.getDefaultInstance());
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Reference refs = 2;</code>
       */
      public java.util.List<pl.edu.icm.coansys.models.PICProtos.Reference.Builder> 
           getRefsBuilderList() {
        return getRefsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.models.PICProtos.Reference, pl.edu.icm.coansys.models.PICProtos.Reference.Builder, pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder> 
          getRefsFieldBuilder() {
        if (refsBuilder_ == null) {
          refsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.models.PICProtos.Reference, pl.edu.icm.coansys.models.PICProtos.Reference.Builder, pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder>(
                  refs_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          refs_ = null;
        }
        return refsBuilder_;
      }

      // repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;
      private java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> auxs_ =
        java.util.Collections.emptyList();
      private void ensureAuxsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          auxs_ = new java.util.ArrayList<pl.edu.icm.coansys.models.PICProtos.Auxiliar>(auxs_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.models.PICProtos.Auxiliar, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder, pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> auxsBuilder_;

      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> getAuxsList() {
        if (auxsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(auxs_);
        } else {
          return auxsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public int getAuxsCount() {
        if (auxsBuilder_ == null) {
          return auxs_.size();
        } else {
          return auxsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Auxiliar getAuxs(int index) {
        if (auxsBuilder_ == null) {
          return auxs_.get(index);
        } else {
          return auxsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder setAuxs(
          int index, pl.edu.icm.coansys.models.PICProtos.Auxiliar value) {
        if (auxsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuxsIsMutable();
          auxs_.set(index, value);
          onChanged();
        } else {
          auxsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder setAuxs(
          int index, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder builderForValue) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          auxs_.set(index, builderForValue.build());
          onChanged();
        } else {
          auxsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAuxs(pl.edu.icm.coansys.models.PICProtos.Auxiliar value) {
        if (auxsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuxsIsMutable();
          auxs_.add(value);
          onChanged();
        } else {
          auxsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAuxs(
          int index, pl.edu.icm.coansys.models.PICProtos.Auxiliar value) {
        if (auxsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuxsIsMutable();
          auxs_.add(index, value);
          onChanged();
        } else {
          auxsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAuxs(
          pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder builderForValue) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          auxs_.add(builderForValue.build());
          onChanged();
        } else {
          auxsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAuxs(
          int index, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder builderForValue) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          auxs_.add(index, builderForValue.build());
          onChanged();
        } else {
          auxsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAllAuxs(
          java.lang.Iterable<? extends pl.edu.icm.coansys.models.PICProtos.Auxiliar> values) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          super.addAll(values, auxs_);
          onChanged();
        } else {
          auxsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder clearAuxs() {
        if (auxsBuilder_ == null) {
          auxs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          auxsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder removeAuxs(int index) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          auxs_.remove(index);
          onChanged();
        } else {
          auxsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder getAuxsBuilder(
          int index) {
        return getAuxsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder getAuxsOrBuilder(
          int index) {
        if (auxsBuilder_ == null) {
          return auxs_.get(index);  } else {
          return auxsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public java.util.List<? extends pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> 
           getAuxsOrBuilderList() {
        if (auxsBuilder_ != null) {
          return auxsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(auxs_);
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder addAuxsBuilder() {
        return getAuxsFieldBuilder().addBuilder(
            pl.edu.icm.coansys.models.PICProtos.Auxiliar.getDefaultInstance());
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder addAuxsBuilder(
          int index) {
        return getAuxsFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.models.PICProtos.Auxiliar.getDefaultInstance());
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder> 
           getAuxsBuilderList() {
        return getAuxsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.models.PICProtos.Auxiliar, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder, pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> 
          getAuxsFieldBuilder() {
        if (auxsBuilder_ == null) {
          auxsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.models.PICProtos.Auxiliar, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder, pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder>(
                  auxs_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          auxs_ = null;
        }
        return auxsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:pl.edu.icm.coansys.models.PicOut)
    }

    static {
      defaultInstance = new PicOut(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:pl.edu.icm.coansys.models.PicOut)
  }

  public interface ReferenceOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 refNum = 1;
    /**
     * <code>required int32 refNum = 1;</code>
     */
    boolean hasRefNum();
    /**
     * <code>required int32 refNum = 1;</code>
     */
    int getRefNum();

    // required string docId = 2;
    /**
     * <code>required string docId = 2;</code>
     */
    boolean hasDocId();
    /**
     * <code>required string docId = 2;</code>
     */
    java.lang.String getDocId();
    /**
     * <code>required string docId = 2;</code>
     */
    com.google.protobuf.ByteString
        getDocIdBytes();

    // optional string rawText = 4;
    /**
     * <code>optional string rawText = 4;</code>
     */
    boolean hasRawText();
    /**
     * <code>optional string rawText = 4;</code>
     */
    java.lang.String getRawText();
    /**
     * <code>optional string rawText = 4;</code>
     */
    com.google.protobuf.ByteString
        getRawTextBytes();

    // repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> 
        getAuxsList();
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    pl.edu.icm.coansys.models.PICProtos.Auxiliar getAuxs(int index);
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    int getAuxsCount();
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    java.util.List<? extends pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> 
        getAuxsOrBuilderList();
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder getAuxsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code pl.edu.icm.coansys.models.Reference}
   */
  public static final class Reference extends
      com.google.protobuf.GeneratedMessage
      implements ReferenceOrBuilder {
    // Use Reference.newBuilder() to construct.
    private Reference(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Reference(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Reference defaultInstance;
    public static Reference getDefaultInstance() {
      return defaultInstance;
    }

    public Reference getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Reference(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              refNum_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              docId_ = input.readBytes();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                auxs_ = new java.util.ArrayList<pl.edu.icm.coansys.models.PICProtos.Auxiliar>();
                mutable_bitField0_ |= 0x00000008;
              }
              auxs_.add(input.readMessage(pl.edu.icm.coansys.models.PICProtos.Auxiliar.PARSER, extensionRegistry));
              break;
            }
            case 34: {
              bitField0_ |= 0x00000004;
              rawText_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          auxs_ = java.util.Collections.unmodifiableList(auxs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Reference_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Reference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pl.edu.icm.coansys.models.PICProtos.Reference.class, pl.edu.icm.coansys.models.PICProtos.Reference.Builder.class);
    }

    public static com.google.protobuf.Parser<Reference> PARSER =
        new com.google.protobuf.AbstractParser<Reference>() {
      public Reference parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Reference(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Reference> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 refNum = 1;
    public static final int REFNUM_FIELD_NUMBER = 1;
    private int refNum_;
    /**
     * <code>required int32 refNum = 1;</code>
     */
    public boolean hasRefNum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 refNum = 1;</code>
     */
    public int getRefNum() {
      return refNum_;
    }

    // required string docId = 2;
    public static final int DOCID_FIELD_NUMBER = 2;
    private java.lang.Object docId_;
    /**
     * <code>required string docId = 2;</code>
     */
    public boolean hasDocId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string docId = 2;</code>
     */
    public java.lang.String getDocId() {
      java.lang.Object ref = docId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          docId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string docId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDocIdBytes() {
      java.lang.Object ref = docId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        docId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string rawText = 4;
    public static final int RAWTEXT_FIELD_NUMBER = 4;
    private java.lang.Object rawText_;
    /**
     * <code>optional string rawText = 4;</code>
     */
    public boolean hasRawText() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string rawText = 4;</code>
     */
    public java.lang.String getRawText() {
      java.lang.Object ref = rawText_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rawText_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string rawText = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRawTextBytes() {
      java.lang.Object ref = rawText_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rawText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;
    public static final int AUXS_FIELD_NUMBER = 3;
    private java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> auxs_;
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> getAuxsList() {
      return auxs_;
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public java.util.List<? extends pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> 
        getAuxsOrBuilderList() {
      return auxs_;
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public int getAuxsCount() {
      return auxs_.size();
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public pl.edu.icm.coansys.models.PICProtos.Auxiliar getAuxs(int index) {
      return auxs_.get(index);
    }
    /**
     * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
     */
    public pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder getAuxsOrBuilder(
        int index) {
      return auxs_.get(index);
    }

    private void initFields() {
      refNum_ = 0;
      docId_ = "";
      rawText_ = "";
      auxs_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasRefNum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDocId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, refNum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getDocIdBytes());
      }
      for (int i = 0; i < auxs_.size(); i++) {
        output.writeMessage(3, auxs_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(4, getRawTextBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, refNum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getDocIdBytes());
      }
      for (int i = 0; i < auxs_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, auxs_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getRawTextBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static pl.edu.icm.coansys.models.PICProtos.Reference parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Reference parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Reference parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Reference parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Reference parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Reference parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Reference parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Reference parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Reference parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Reference parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.models.PICProtos.Reference prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code pl.edu.icm.coansys.models.Reference}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.models.PICProtos.ReferenceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Reference_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Reference_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                pl.edu.icm.coansys.models.PICProtos.Reference.class, pl.edu.icm.coansys.models.PICProtos.Reference.Builder.class);
      }

      // Construct using pl.edu.icm.coansys.models.PICProtos.Reference.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getAuxsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        refNum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        docId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        rawText_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        if (auxsBuilder_ == null) {
          auxs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          auxsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Reference_descriptor;
      }

      public pl.edu.icm.coansys.models.PICProtos.Reference getDefaultInstanceForType() {
        return pl.edu.icm.coansys.models.PICProtos.Reference.getDefaultInstance();
      }

      public pl.edu.icm.coansys.models.PICProtos.Reference build() {
        pl.edu.icm.coansys.models.PICProtos.Reference result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public pl.edu.icm.coansys.models.PICProtos.Reference buildPartial() {
        pl.edu.icm.coansys.models.PICProtos.Reference result = new pl.edu.icm.coansys.models.PICProtos.Reference(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.refNum_ = refNum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.docId_ = docId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.rawText_ = rawText_;
        if (auxsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            auxs_ = java.util.Collections.unmodifiableList(auxs_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.auxs_ = auxs_;
        } else {
          result.auxs_ = auxsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.models.PICProtos.Reference) {
          return mergeFrom((pl.edu.icm.coansys.models.PICProtos.Reference)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(pl.edu.icm.coansys.models.PICProtos.Reference other) {
        if (other == pl.edu.icm.coansys.models.PICProtos.Reference.getDefaultInstance()) return this;
        if (other.hasRefNum()) {
          setRefNum(other.getRefNum());
        }
        if (other.hasDocId()) {
          bitField0_ |= 0x00000002;
          docId_ = other.docId_;
          onChanged();
        }
        if (other.hasRawText()) {
          bitField0_ |= 0x00000004;
          rawText_ = other.rawText_;
          onChanged();
        }
        if (auxsBuilder_ == null) {
          if (!other.auxs_.isEmpty()) {
            if (auxs_.isEmpty()) {
              auxs_ = other.auxs_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureAuxsIsMutable();
              auxs_.addAll(other.auxs_);
            }
            onChanged();
          }
        } else {
          if (!other.auxs_.isEmpty()) {
            if (auxsBuilder_.isEmpty()) {
              auxsBuilder_.dispose();
              auxsBuilder_ = null;
              auxs_ = other.auxs_;
              bitField0_ = (bitField0_ & ~0x00000008);
              auxsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAuxsFieldBuilder() : null;
            } else {
              auxsBuilder_.addAllMessages(other.auxs_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRefNum()) {
          
          return false;
        }
        if (!hasDocId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        pl.edu.icm.coansys.models.PICProtos.Reference parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (pl.edu.icm.coansys.models.PICProtos.Reference) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 refNum = 1;
      private int refNum_ ;
      /**
       * <code>required int32 refNum = 1;</code>
       */
      public boolean hasRefNum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 refNum = 1;</code>
       */
      public int getRefNum() {
        return refNum_;
      }
      /**
       * <code>required int32 refNum = 1;</code>
       */
      public Builder setRefNum(int value) {
        bitField0_ |= 0x00000001;
        refNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 refNum = 1;</code>
       */
      public Builder clearRefNum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        refNum_ = 0;
        onChanged();
        return this;
      }

      // required string docId = 2;
      private java.lang.Object docId_ = "";
      /**
       * <code>required string docId = 2;</code>
       */
      public boolean hasDocId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string docId = 2;</code>
       */
      public java.lang.String getDocId() {
        java.lang.Object ref = docId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          docId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string docId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDocIdBytes() {
        java.lang.Object ref = docId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          docId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string docId = 2;</code>
       */
      public Builder setDocId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        docId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string docId = 2;</code>
       */
      public Builder clearDocId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        docId_ = getDefaultInstance().getDocId();
        onChanged();
        return this;
      }
      /**
       * <code>required string docId = 2;</code>
       */
      public Builder setDocIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        docId_ = value;
        onChanged();
        return this;
      }

      // optional string rawText = 4;
      private java.lang.Object rawText_ = "";
      /**
       * <code>optional string rawText = 4;</code>
       */
      public boolean hasRawText() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string rawText = 4;</code>
       */
      public java.lang.String getRawText() {
        java.lang.Object ref = rawText_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          rawText_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string rawText = 4;</code>
       */
      public com.google.protobuf.ByteString
          getRawTextBytes() {
        java.lang.Object ref = rawText_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          rawText_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string rawText = 4;</code>
       */
      public Builder setRawText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        rawText_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string rawText = 4;</code>
       */
      public Builder clearRawText() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rawText_ = getDefaultInstance().getRawText();
        onChanged();
        return this;
      }
      /**
       * <code>optional string rawText = 4;</code>
       */
      public Builder setRawTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        rawText_ = value;
        onChanged();
        return this;
      }

      // repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;
      private java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> auxs_ =
        java.util.Collections.emptyList();
      private void ensureAuxsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          auxs_ = new java.util.ArrayList<pl.edu.icm.coansys.models.PICProtos.Auxiliar>(auxs_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.models.PICProtos.Auxiliar, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder, pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> auxsBuilder_;

      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar> getAuxsList() {
        if (auxsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(auxs_);
        } else {
          return auxsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public int getAuxsCount() {
        if (auxsBuilder_ == null) {
          return auxs_.size();
        } else {
          return auxsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Auxiliar getAuxs(int index) {
        if (auxsBuilder_ == null) {
          return auxs_.get(index);
        } else {
          return auxsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder setAuxs(
          int index, pl.edu.icm.coansys.models.PICProtos.Auxiliar value) {
        if (auxsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuxsIsMutable();
          auxs_.set(index, value);
          onChanged();
        } else {
          auxsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder setAuxs(
          int index, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder builderForValue) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          auxs_.set(index, builderForValue.build());
          onChanged();
        } else {
          auxsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAuxs(pl.edu.icm.coansys.models.PICProtos.Auxiliar value) {
        if (auxsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuxsIsMutable();
          auxs_.add(value);
          onChanged();
        } else {
          auxsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAuxs(
          int index, pl.edu.icm.coansys.models.PICProtos.Auxiliar value) {
        if (auxsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuxsIsMutable();
          auxs_.add(index, value);
          onChanged();
        } else {
          auxsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAuxs(
          pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder builderForValue) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          auxs_.add(builderForValue.build());
          onChanged();
        } else {
          auxsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAuxs(
          int index, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder builderForValue) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          auxs_.add(index, builderForValue.build());
          onChanged();
        } else {
          auxsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder addAllAuxs(
          java.lang.Iterable<? extends pl.edu.icm.coansys.models.PICProtos.Auxiliar> values) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          super.addAll(values, auxs_);
          onChanged();
        } else {
          auxsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder clearAuxs() {
        if (auxsBuilder_ == null) {
          auxs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          auxsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public Builder removeAuxs(int index) {
        if (auxsBuilder_ == null) {
          ensureAuxsIsMutable();
          auxs_.remove(index);
          onChanged();
        } else {
          auxsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder getAuxsBuilder(
          int index) {
        return getAuxsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder getAuxsOrBuilder(
          int index) {
        if (auxsBuilder_ == null) {
          return auxs_.get(index);  } else {
          return auxsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public java.util.List<? extends pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> 
           getAuxsOrBuilderList() {
        if (auxsBuilder_ != null) {
          return auxsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(auxs_);
        }
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder addAuxsBuilder() {
        return getAuxsFieldBuilder().addBuilder(
            pl.edu.icm.coansys.models.PICProtos.Auxiliar.getDefaultInstance());
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder addAuxsBuilder(
          int index) {
        return getAuxsFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.models.PICProtos.Auxiliar.getDefaultInstance());
      }
      /**
       * <code>repeated .pl.edu.icm.coansys.models.Auxiliar auxs = 3;</code>
       */
      public java.util.List<pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder> 
           getAuxsBuilderList() {
        return getAuxsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.models.PICProtos.Auxiliar, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder, pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder> 
          getAuxsFieldBuilder() {
        if (auxsBuilder_ == null) {
          auxsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.models.PICProtos.Auxiliar, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder, pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder>(
                  auxs_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          auxs_ = null;
        }
        return auxsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:pl.edu.icm.coansys.models.Reference)
    }

    static {
      defaultInstance = new Reference(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:pl.edu.icm.coansys.models.Reference)
  }

  public interface AuxiliarOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string type = 1;
    /**
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    // optional string value = 2;
    /**
     * <code>optional string value = 2;</code>
     */
    boolean hasValue();
    /**
     * <code>optional string value = 2;</code>
     */
    java.lang.String getValue();
    /**
     * <code>optional string value = 2;</code>
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * Protobuf type {@code pl.edu.icm.coansys.models.Auxiliar}
   */
  public static final class Auxiliar extends
      com.google.protobuf.GeneratedMessage
      implements AuxiliarOrBuilder {
    // Use Auxiliar.newBuilder() to construct.
    private Auxiliar(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Auxiliar(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Auxiliar defaultInstance;
    public static Auxiliar getDefaultInstance() {
      return defaultInstance;
    }

    public Auxiliar getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Auxiliar(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              type_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              value_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Auxiliar_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Auxiliar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pl.edu.icm.coansys.models.PICProtos.Auxiliar.class, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder.class);
    }

    public static com.google.protobuf.Parser<Auxiliar> PARSER =
        new com.google.protobuf.AbstractParser<Auxiliar>() {
      public Auxiliar parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Auxiliar(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Auxiliar> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private java.lang.Object type_;
    /**
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string value = 2;
    public static final int VALUE_FIELD_NUMBER = 2;
    private java.lang.Object value_;
    /**
     * <code>optional string value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          value_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      type_ = "";
      value_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getValueBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getValueBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static pl.edu.icm.coansys.models.PICProtos.Auxiliar parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.models.PICProtos.Auxiliar prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code pl.edu.icm.coansys.models.Auxiliar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.models.PICProtos.AuxiliarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Auxiliar_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Auxiliar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                pl.edu.icm.coansys.models.PICProtos.Auxiliar.class, pl.edu.icm.coansys.models.PICProtos.Auxiliar.Builder.class);
      }

      // Construct using pl.edu.icm.coansys.models.PICProtos.Auxiliar.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.models.PICProtos.internal_static_pl_edu_icm_coansys_models_Auxiliar_descriptor;
      }

      public pl.edu.icm.coansys.models.PICProtos.Auxiliar getDefaultInstanceForType() {
        return pl.edu.icm.coansys.models.PICProtos.Auxiliar.getDefaultInstance();
      }

      public pl.edu.icm.coansys.models.PICProtos.Auxiliar build() {
        pl.edu.icm.coansys.models.PICProtos.Auxiliar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public pl.edu.icm.coansys.models.PICProtos.Auxiliar buildPartial() {
        pl.edu.icm.coansys.models.PICProtos.Auxiliar result = new pl.edu.icm.coansys.models.PICProtos.Auxiliar(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.models.PICProtos.Auxiliar) {
          return mergeFrom((pl.edu.icm.coansys.models.PICProtos.Auxiliar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(pl.edu.icm.coansys.models.PICProtos.Auxiliar other) {
        if (other == pl.edu.icm.coansys.models.PICProtos.Auxiliar.getDefaultInstance()) return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasValue()) {
          bitField0_ |= 0x00000002;
          value_ = other.value_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        pl.edu.icm.coansys.models.PICProtos.Auxiliar parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (pl.edu.icm.coansys.models.PICProtos.Auxiliar) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string type = 1;
      private java.lang.Object type_ = "";
      /**
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string type = 1;</code>
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      // optional string value = 2;
      private java.lang.Object value_ = "";
      /**
       * <code>optional string value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>optional string value = 2;</code>
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:pl.edu.icm.coansys.models.Auxiliar)
    }

    static {
      defaultInstance = new Auxiliar(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:pl.edu.icm.coansys.models.Auxiliar)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_pl_edu_icm_coansys_models_PicOut_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_pl_edu_icm_coansys_models_PicOut_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_pl_edu_icm_coansys_models_Reference_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_pl_edu_icm_coansys_models_Reference_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_pl_edu_icm_coansys_models_Auxiliar_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_pl_edu_icm_coansys_models_Auxiliar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpic_out.proto\022\031pl.edu.icm.coansys.mode" +
      "ls\"~\n\006PicOut\022\r\n\005docId\030\001 \002(\t\0222\n\004refs\030\002 \003(" +
      "\0132$.pl.edu.icm.coansys.models.Reference\022" +
      "1\n\004auxs\030\003 \003(\0132#.pl.edu.icm.coansys.model" +
      "s.Auxiliar\"n\n\tReference\022\016\n\006refNum\030\001 \002(\005\022" +
      "\r\n\005docId\030\002 \002(\t\022\017\n\007rawText\030\004 \001(\t\0221\n\004auxs\030" +
      "\003 \003(\0132#.pl.edu.icm.coansys.models.Auxili" +
      "ar\"\'\n\010Auxiliar\022\014\n\004type\030\001 \001(\t\022\r\n\005value\030\002 " +
      "\001(\tB&\n\031pl.edu.icm.coansys.modelsB\tPICPro" +
      "tos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_pl_edu_icm_coansys_models_PicOut_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_pl_edu_icm_coansys_models_PicOut_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_pl_edu_icm_coansys_models_PicOut_descriptor,
              new java.lang.String[] { "DocId", "Refs", "Auxs", });
          internal_static_pl_edu_icm_coansys_models_Reference_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_pl_edu_icm_coansys_models_Reference_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_pl_edu_icm_coansys_models_Reference_descriptor,
              new java.lang.String[] { "RefNum", "DocId", "RawText", "Auxs", });
          internal_static_pl_edu_icm_coansys_models_Auxiliar_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_pl_edu_icm_coansys_models_Auxiliar_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_pl_edu_icm_coansys_models_Auxiliar_descriptor,
              new java.lang.String[] { "Type", "Value", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
