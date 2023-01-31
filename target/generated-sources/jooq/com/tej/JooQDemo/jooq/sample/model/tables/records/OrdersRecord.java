/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.Orders;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrdersRecord extends UpdatableRecordImpl<OrdersRecord> implements Record3<Integer, Byte, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>chubaka_site.orders.clientId</code>.
     */
    public OrdersRecord setClientid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>chubaka_site.orders.clientId</code>.
     */
    public Integer getClientid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>chubaka_site.orders.statusPayment</code>.
     */
    public OrdersRecord setStatuspayment(Byte value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>chubaka_site.orders.statusPayment</code>.
     */
    public Byte getStatuspayment() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>chubaka_site.orders.productsId</code>.
     */
    public OrdersRecord setProductsid(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>chubaka_site.orders.productsId</code>.
     */
    public Integer getProductsid() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Byte, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Byte, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Orders.ORDERS.CLIENTID;
    }

    @Override
    public Field<Byte> field2() {
        return Orders.ORDERS.STATUSPAYMENT;
    }

    @Override
    public Field<Integer> field3() {
        return Orders.ORDERS.PRODUCTSID;
    }

    @Override
    public Integer component1() {
        return getClientid();
    }

    @Override
    public Byte component2() {
        return getStatuspayment();
    }

    @Override
    public Integer component3() {
        return getProductsid();
    }

    @Override
    public Integer value1() {
        return getClientid();
    }

    @Override
    public Byte value2() {
        return getStatuspayment();
    }

    @Override
    public Integer value3() {
        return getProductsid();
    }

    @Override
    public OrdersRecord value1(Integer value) {
        setClientid(value);
        return this;
    }

    @Override
    public OrdersRecord value2(Byte value) {
        setStatuspayment(value);
        return this;
    }

    @Override
    public OrdersRecord value3(Integer value) {
        setProductsid(value);
        return this;
    }

    @Override
    public OrdersRecord values(Integer value1, Byte value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrdersRecord
     */
    public OrdersRecord() {
        super(Orders.ORDERS);
    }

    /**
     * Create a detached, initialised OrdersRecord
     */
    public OrdersRecord(Integer clientid, Byte statuspayment, Integer productsid) {
        super(Orders.ORDERS);

        setClientid(clientid);
        setStatuspayment(statuspayment);
        setProductsid(productsid);
    }
}
