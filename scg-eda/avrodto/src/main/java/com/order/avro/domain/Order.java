/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.order.avro.domain;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -232074653670388930L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"com.order.avro.domain\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"customerId\",\"type\":\"long\"},{\"name\":\"state\",\"type\":{\"type\":\"enum\",\"name\":\"OrderState\",\"symbols\":[\"CREATED\",\"VALIDATED\",\"FAILED\",\"SHIPPED\"]}},{\"name\":\"product\",\"type\":{\"type\":\"record\",\"name\":\"Product\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"productName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"price\",\"type\":\"double\"}]}},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"price\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String id;
   private long customerId;
   private com.order.avro.domain.OrderState state;
   private com.order.avro.domain.Product product;
   private int quantity;
   private double price;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param customerId The new value for customerId
   * @param state The new value for state
   * @param product The new value for product
   * @param quantity The new value for quantity
   * @param price The new value for price
   */
  public Order(java.lang.String id, java.lang.Long customerId, com.order.avro.domain.OrderState state, com.order.avro.domain.Product product, java.lang.Integer quantity, java.lang.Double price) {
    this.id = id;
    this.customerId = customerId;
    this.state = state;
    this.product = product;
    this.quantity = quantity;
    this.price = price;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return customerId;
    case 2: return state;
    case 3: return product;
    case 4: return quantity;
    case 5: return price;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: customerId = (java.lang.Long)value$; break;
    case 2: state = (com.order.avro.domain.OrderState)value$; break;
    case 3: product = (com.order.avro.domain.Product)value$; break;
    case 4: quantity = (java.lang.Integer)value$; break;
    case 5: price = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }


  /**
   * Gets the value of the 'customerId' field.
   * @return The value of the 'customerId' field.
   */
  public java.lang.Long getCustomerId() {
    return customerId;
  }


  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public com.order.avro.domain.OrderState getState() {
    return state;
  }


  /**
   * Gets the value of the 'product' field.
   * @return The value of the 'product' field.
   */
  public com.order.avro.domain.Product getProduct() {
    return product;
  }


  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }


  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.lang.Double getPrice() {
    return price;
  }


  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static com.order.avro.domain.Order.Builder newBuilder() {
    return new com.order.avro.domain.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static com.order.avro.domain.Order.Builder newBuilder(com.order.avro.domain.Order.Builder other) {
    return new com.order.avro.domain.Order.Builder(other);
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static com.order.avro.domain.Order.Builder newBuilder(com.order.avro.domain.Order other) {
    return new com.order.avro.domain.Order.Builder(other);
  }

  /**
   * RecordBuilder for Order instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    private java.lang.String id;
    private long customerId;
    private com.order.avro.domain.OrderState state;
    private com.order.avro.domain.Product product;
    private com.order.avro.domain.Product.Builder productBuilder;
    private int quantity;
    private double price;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.order.avro.domain.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.product)) {
        this.product = data().deepCopy(fields()[3].schema(), other.product);
        fieldSetFlags()[3] = true;
      }
      if (other.hasProductBuilder()) {
        this.productBuilder = com.order.avro.domain.Product.newBuilder(other.getProductBuilder());
      }
      if (isValidValue(fields()[4], other.quantity)) {
        this.quantity = data().deepCopy(fields()[4].schema(), other.quantity);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(com.order.avro.domain.Order other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.product)) {
        this.product = data().deepCopy(fields()[3].schema(), other.product);
        fieldSetFlags()[3] = true;
      }
      this.productBuilder = null;
      if (isValidValue(fields()[4], other.quantity)) {
        this.quantity = data().deepCopy(fields()[4].schema(), other.quantity);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerId' field.
      * @return The value.
      */
    public java.lang.Long getCustomerId() {
      return customerId;
    }

    /**
      * Sets the value of the 'customerId' field.
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder setCustomerId(long value) {
      validate(fields()[1], value);
      this.customerId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder clearCustomerId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public com.order.avro.domain.OrderState getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder setState(com.order.avro.domain.OrderState value) {
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
    public com.order.avro.domain.Order.Builder clearState() {
      state = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'product' field.
      * @return The value.
      */
    public com.order.avro.domain.Product getProduct() {
      return product;
    }

    /**
      * Sets the value of the 'product' field.
      * @param value The value of 'product'.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder setProduct(com.order.avro.domain.Product value) {
      validate(fields()[3], value);
      this.productBuilder = null;
      this.product = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'product' field has been set.
      * @return True if the 'product' field has been set, false otherwise.
      */
    public boolean hasProduct() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'product' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.order.avro.domain.Product.Builder getProductBuilder() {
      if (productBuilder == null) {
        if (hasProduct()) {
          setProductBuilder(com.order.avro.domain.Product.newBuilder(product));
        } else {
          setProductBuilder(com.order.avro.domain.Product.newBuilder());
        }
      }
      return productBuilder;
    }

    /**
     * Sets the Builder instance for the 'product' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.order.avro.domain.Order.Builder setProductBuilder(com.order.avro.domain.Product.Builder value) {
      clearProduct();
      productBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'product' field has an active Builder instance
     * @return True if the 'product' field has an active Builder instance
     */
    public boolean hasProductBuilder() {
      return productBuilder != null;
    }

    /**
      * Clears the value of the 'product' field.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder clearProduct() {
      product = null;
      productBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public java.lang.Integer getQuantity() {
      return quantity;
    }

    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder setQuantity(int value) {
      validate(fields()[4], value);
      this.quantity = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder clearQuantity() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.lang.Double getPrice() {
      return price;
    }

    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder setPrice(double value) {
      validate(fields()[5], value);
      this.price = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public com.order.avro.domain.Order.Builder clearPrice() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Order build() {
      try {
        Order record = new Order();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.customerId = fieldSetFlags()[1] ? this.customerId : (java.lang.Long) defaultValue(fields()[1]);
        record.state = fieldSetFlags()[2] ? this.state : (com.order.avro.domain.OrderState) defaultValue(fields()[2]);
        if (productBuilder != null) {
          record.product = this.productBuilder.build();
        } else {
          record.product = fieldSetFlags()[3] ? this.product : (com.order.avro.domain.Product) defaultValue(fields()[3]);
        }
        record.quantity = fieldSetFlags()[4] ? this.quantity : (java.lang.Integer) defaultValue(fields()[4]);
        record.price = fieldSetFlags()[5] ? this.price : (java.lang.Double) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
