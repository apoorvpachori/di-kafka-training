/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.xyzcorp;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1419469911307856645L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"com.xyzcorp\",\"fields\":[{\"name\":\"total\",\"type\":\"int\"},{\"name\":\"shipping\",\"type\":{\"type\":\"enum\",\"name\":\"Shipping\",\"symbols\":[\"NEXT_DAY\",\"TWO_DAY\",\"GROUND\"]}},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"discount\",\"type\":\"float\"},{\"name\":\"gender\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"Gender\",\"symbols\":[\"MALE\",\"FEMALE\"]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Order> ENCODER =
      new BinaryMessageEncoder<Order>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Order> DECODER =
      new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Order> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Order> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Order to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Order from a ByteBuffer. */
  public static Order fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int total;
  @Deprecated public com.xyzcorp.Shipping shipping;
  @Deprecated public java.lang.CharSequence state;
  @Deprecated public float discount;
  @Deprecated public com.xyzcorp.Gender gender;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param total The new value for total
   * @param shipping The new value for shipping
   * @param state The new value for state
   * @param discount The new value for discount
   * @param gender The new value for gender
   */
  public Order(java.lang.Integer total, com.xyzcorp.Shipping shipping, java.lang.CharSequence state, java.lang.Float discount, com.xyzcorp.Gender gender) {
    this.total = total;
    this.shipping = shipping;
    this.state = state;
    this.discount = discount;
    this.gender = gender;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return total;
    case 1: return shipping;
    case 2: return state;
    case 3: return discount;
    case 4: return gender;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: total = (java.lang.Integer)value$; break;
    case 1: shipping = (com.xyzcorp.Shipping)value$; break;
    case 2: state = (java.lang.CharSequence)value$; break;
    case 3: discount = (java.lang.Float)value$; break;
    case 4: gender = (com.xyzcorp.Gender)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'total' field.
   * @return The value of the 'total' field.
   */
  public java.lang.Integer getTotal() {
    return total;
  }

  /**
   * Sets the value of the 'total' field.
   * @param value the value to set.
   */
  public void setTotal(java.lang.Integer value) {
    this.total = value;
  }

  /**
   * Gets the value of the 'shipping' field.
   * @return The value of the 'shipping' field.
   */
  public com.xyzcorp.Shipping getShipping() {
    return shipping;
  }

  /**
   * Sets the value of the 'shipping' field.
   * @param value the value to set.
   */
  public void setShipping(com.xyzcorp.Shipping value) {
    this.shipping = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'discount' field.
   * @return The value of the 'discount' field.
   */
  public java.lang.Float getDiscount() {
    return discount;
  }

  /**
   * Sets the value of the 'discount' field.
   * @param value the value to set.
   */
  public void setDiscount(java.lang.Float value) {
    this.discount = value;
  }

  /**
   * Gets the value of the 'gender' field.
   * @return The value of the 'gender' field.
   */
  public com.xyzcorp.Gender getGender() {
    return gender;
  }

  /**
   * Sets the value of the 'gender' field.
   * @param value the value to set.
   */
  public void setGender(com.xyzcorp.Gender value) {
    this.gender = value;
  }

  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static com.xyzcorp.Order.Builder newBuilder() {
    return new com.xyzcorp.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static com.xyzcorp.Order.Builder newBuilder(com.xyzcorp.Order.Builder other) {
    return new com.xyzcorp.Order.Builder(other);
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static com.xyzcorp.Order.Builder newBuilder(com.xyzcorp.Order other) {
    return new com.xyzcorp.Order.Builder(other);
  }

  /**
   * RecordBuilder for Order instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    private int total;
    private com.xyzcorp.Shipping shipping;
    private java.lang.CharSequence state;
    private float discount;
    private com.xyzcorp.Gender gender;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.xyzcorp.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.total)) {
        this.total = data().deepCopy(fields()[0].schema(), other.total);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.shipping)) {
        this.shipping = data().deepCopy(fields()[1].schema(), other.shipping);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.discount)) {
        this.discount = data().deepCopy(fields()[3].schema(), other.discount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.gender)) {
        this.gender = data().deepCopy(fields()[4].schema(), other.gender);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(com.xyzcorp.Order other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.total)) {
        this.total = data().deepCopy(fields()[0].schema(), other.total);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.shipping)) {
        this.shipping = data().deepCopy(fields()[1].schema(), other.shipping);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.discount)) {
        this.discount = data().deepCopy(fields()[3].schema(), other.discount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.gender)) {
        this.gender = data().deepCopy(fields()[4].schema(), other.gender);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'total' field.
      * @return The value.
      */
    public java.lang.Integer getTotal() {
      return total;
    }

    /**
      * Sets the value of the 'total' field.
      * @param value The value of 'total'.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder setTotal(int value) {
      validate(fields()[0], value);
      this.total = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'total' field has been set.
      * @return True if the 'total' field has been set, false otherwise.
      */
    public boolean hasTotal() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'total' field.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder clearTotal() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'shipping' field.
      * @return The value.
      */
    public com.xyzcorp.Shipping getShipping() {
      return shipping;
    }

    /**
      * Sets the value of the 'shipping' field.
      * @param value The value of 'shipping'.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder setShipping(com.xyzcorp.Shipping value) {
      validate(fields()[1], value);
      this.shipping = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'shipping' field has been set.
      * @return True if the 'shipping' field has been set, false otherwise.
      */
    public boolean hasShipping() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'shipping' field.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder clearShipping() {
      shipping = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.CharSequence getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder setState(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.state = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder clearState() {
      state = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'discount' field.
      * @return The value.
      */
    public java.lang.Float getDiscount() {
      return discount;
    }

    /**
      * Sets the value of the 'discount' field.
      * @param value The value of 'discount'.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder setDiscount(float value) {
      validate(fields()[3], value);
      this.discount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'discount' field has been set.
      * @return True if the 'discount' field has been set, false otherwise.
      */
    public boolean hasDiscount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'discount' field.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder clearDiscount() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'gender' field.
      * @return The value.
      */
    public com.xyzcorp.Gender getGender() {
      return gender;
    }

    /**
      * Sets the value of the 'gender' field.
      * @param value The value of 'gender'.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder setGender(com.xyzcorp.Gender value) {
      validate(fields()[4], value);
      this.gender = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'gender' field has been set.
      * @return True if the 'gender' field has been set, false otherwise.
      */
    public boolean hasGender() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'gender' field.
      * @return This builder.
      */
    public com.xyzcorp.Order.Builder clearGender() {
      gender = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Order build() {
      try {
        Order record = new Order();
        record.total = fieldSetFlags()[0] ? this.total : (java.lang.Integer) defaultValue(fields()[0]);
        record.shipping = fieldSetFlags()[1] ? this.shipping : (com.xyzcorp.Shipping) defaultValue(fields()[1]);
        record.state = fieldSetFlags()[2] ? this.state : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.discount = fieldSetFlags()[3] ? this.discount : (java.lang.Float) defaultValue(fields()[3]);
        record.gender = fieldSetFlags()[4] ? this.gender : (com.xyzcorp.Gender) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Order>
    WRITER$ = (org.apache.avro.io.DatumWriter<Order>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Order>
    READER$ = (org.apache.avro.io.DatumReader<Order>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
