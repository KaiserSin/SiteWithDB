/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer price;
    private String  productname;
    private Integer amount;

    public Product() {}

    public Product(Product value) {
        this.id = value.id;
        this.price = value.price;
        this.productname = value.productname;
        this.amount = value.amount;
    }

    public Product(
        Integer id,
        Integer price,
        String  productname,
        Integer amount
    ) {
        this.id = id;
        this.price = price;
        this.productname = productname;
        this.amount = amount;
    }

    /**
     * Getter for <code>chubaka_site.product.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>chubaka_site.product.id</code>.
     */
    public Product setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>chubaka_site.product.price</code>.
     */
    public Integer getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>chubaka_site.product.price</code>.
     */
    public Product setPrice(Integer price) {
        this.price = price;
        return this;
    }

    /**
     * Getter for <code>chubaka_site.product.productName</code>.
     */
    public String getProductname() {
        return this.productname;
    }

    /**
     * Setter for <code>chubaka_site.product.productName</code>.
     */
    public Product setProductname(String productname) {
        this.productname = productname;
        return this;
    }

    /**
     * Getter for <code>chubaka_site.product.amount</code>.
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>chubaka_site.product.amount</code>.
     */
    public Product setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Product other = (Product) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        }
        else if (!price.equals(other.price))
            return false;
        if (productname == null) {
            if (other.productname != null)
                return false;
        }
        else if (!productname.equals(other.productname))
            return false;
        if (amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!amount.equals(other.amount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
        result = prime * result + ((this.productname == null) ? 0 : this.productname.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Product (");

        sb.append(id);
        sb.append(", ").append(price);
        sb.append(", ").append(productname);
        sb.append(", ").append(amount);

        sb.append(")");
        return sb.toString();
    }
}
