/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * 
 * @generated
 */
package org.apache.fluo.core.thrift;

import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

public class Stamps implements org.apache.thrift.TBase<Stamps, Stamps._Fields>,
    java.io.Serializable, Cloneable, Comparable<Stamps> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
      new org.apache.thrift.protocol.TStruct("Stamps");

  private static final org.apache.thrift.protocol.TField TX_STAMPS_START_FIELD_DESC =
      new org.apache.thrift.protocol.TField("txStampsStart", org.apache.thrift.protocol.TType.I64,
          (short) 1);
  private static final org.apache.thrift.protocol.TField GC_STAMP_FIELD_DESC =
      new org.apache.thrift.protocol.TField("gcStamp", org.apache.thrift.protocol.TType.I64,
          (short) 2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes =
      new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StampsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StampsTupleSchemeFactory());
  }

  public long txStampsStart; // required
  public long gcStamp; // required

  /**
   * The set of fields this struct contains, along with convenience methods for finding and
   * manipulating them.
   */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TX_STAMPS_START((short) 1, "txStampsStart"), GC_STAMP((short) 2, "gcStamp");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch (fieldId) {
        case 1: // TX_STAMPS_START
          return TX_STAMPS_START;
        case 2: // GC_STAMP
          return GC_STAMP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null)
        throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TXSTAMPSSTART_ISSET_ID = 0;
  private static final int __GCSTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
        new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TX_STAMPS_START, new org.apache.thrift.meta_data.FieldMetaData(
        "txStampsStart", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GC_STAMP, new org.apache.thrift.meta_data.FieldMetaData("gcStamp",
        org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Stamps.class, metaDataMap);
  }

  public Stamps() {}

  public Stamps(long txStampsStart, long gcStamp) {
    this();
    this.txStampsStart = txStampsStart;
    setTxStampsStartIsSet(true);
    this.gcStamp = gcStamp;
    setGcStampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Stamps(Stamps other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txStampsStart = other.txStampsStart;
    this.gcStamp = other.gcStamp;
  }

  @Override
  public Stamps deepCopy() {
    return new Stamps(this);
  }

  @Override
  public void clear() {
    setTxStampsStartIsSet(false);
    this.txStampsStart = 0;
    setGcStampIsSet(false);
    this.gcStamp = 0;
  }

  public long getTxStampsStart() {
    return this.txStampsStart;
  }

  public Stamps setTxStampsStart(long txStampsStart) {
    this.txStampsStart = txStampsStart;
    setTxStampsStartIsSet(true);
    return this;
  }

  public void unsetTxStampsStart() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TXSTAMPSSTART_ISSET_ID);
  }

  /** Returns true if field txStampsStart is set (has been assigned a value) and false otherwise */
  public boolean isSetTxStampsStart() {
    return EncodingUtils.testBit(__isset_bitfield, __TXSTAMPSSTART_ISSET_ID);
  }

  public void setTxStampsStartIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TXSTAMPSSTART_ISSET_ID, value);
  }

  public long getGcStamp() {
    return this.gcStamp;
  }

  public Stamps setGcStamp(long gcStamp) {
    this.gcStamp = gcStamp;
    setGcStampIsSet(true);
    return this;
  }

  public void unsetGcStamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GCSTAMP_ISSET_ID);
  }

  /** Returns true if field gcStamp is set (has been assigned a value) and false otherwise */
  public boolean isSetGcStamp() {
    return EncodingUtils.testBit(__isset_bitfield, __GCSTAMP_ISSET_ID);
  }

  public void setGcStampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GCSTAMP_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
      case TX_STAMPS_START:
        if (value == null) {
          unsetTxStampsStart();
        } else {
          setTxStampsStart((Long) value);
        }
        break;

      case GC_STAMP:
        if (value == null) {
          unsetGcStamp();
        } else {
          setGcStamp((Long) value);
        }
        break;

    }
  }

  @Override
  public Object getFieldValue(_Fields field) {
    switch (field) {
      case TX_STAMPS_START:
        return Long.valueOf(getTxStampsStart());

      case GC_STAMP:
        return Long.valueOf(getGcStamp());

    }
    throw new IllegalStateException();
  }

  /**
   * Returns true if field corresponding to fieldID is set (has been assigned a value) and false
   * otherwise
   */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
      case TX_STAMPS_START:
        return isSetTxStampsStart();
      case GC_STAMP:
        return isSetGcStamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Stamps)
      return this.equals((Stamps) that);
    return false;
  }

  public boolean equals(Stamps that) {
    if (that == null)
      return false;

    boolean this_present_txStampsStart = true;
    boolean that_present_txStampsStart = true;
    if (this_present_txStampsStart || that_present_txStampsStart) {
      if (!(this_present_txStampsStart && that_present_txStampsStart))
        return false;
      if (this.txStampsStart != that.txStampsStart)
        return false;
    }

    boolean this_present_gcStamp = true;
    boolean that_present_gcStamp = true;
    if (this_present_gcStamp || that_present_gcStamp) {
      if (!(this_present_gcStamp && that_present_gcStamp))
        return false;
      if (this.gcStamp != that.gcStamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Stamps other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTxStampsStart()).compareTo(other.isSetTxStampsStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxStampsStart()) {
      lastComparison =
          org.apache.thrift.TBaseHelper.compareTo(this.txStampsStart, other.txStampsStart);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGcStamp()).compareTo(other.isSetGcStamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGcStamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gcStamp, other.gcStamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Stamps(");
    boolean first = true;

    sb.append("txStampsStart:");
    sb.append(this.txStampsStart);
    first = false;
    if (!first)
      sb.append(", ");
    sb.append("gcStamp:");
    sb.append(this.gcStamp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(
          new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException,
      ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and
      // doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(
          new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StampsStandardSchemeFactory implements SchemeFactory {
    @Override
    public StampsStandardScheme getScheme() {
      return new StampsStandardScheme();
    }
  }

  private static class StampsStandardScheme extends StandardScheme<Stamps> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, Stamps struct)
        throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true) {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // TX_STAMPS_START
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txStampsStart = iprot.readI64();
              struct.setTxStampsStartIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GC_STAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gcStamp = iprot.readI64();
              struct.setGcStampIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, Stamps struct)
        throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TX_STAMPS_START_FIELD_DESC);
      oprot.writeI64(struct.txStampsStart);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GC_STAMP_FIELD_DESC);
      oprot.writeI64(struct.gcStamp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StampsTupleSchemeFactory implements SchemeFactory {
    @Override
    public StampsTupleScheme getScheme() {
      return new StampsTupleScheme();
    }
  }

  private static class StampsTupleScheme extends TupleScheme<Stamps> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Stamps struct)
        throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTxStampsStart()) {
        optionals.set(0);
      }
      if (struct.isSetGcStamp()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTxStampsStart()) {
        oprot.writeI64(struct.txStampsStart);
      }
      if (struct.isSetGcStamp()) {
        oprot.writeI64(struct.gcStamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Stamps struct)
        throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.txStampsStart = iprot.readI64();
        struct.setTxStampsStartIsSet(true);
      }
      if (incoming.get(1)) {
        struct.gcStamp = iprot.readI64();
        struct.setGcStampIsSet(true);
      }
    }
  }

}