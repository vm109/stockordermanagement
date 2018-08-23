package com.stockordermanagement.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="supplierproducts")
@IdClass(SupplierProducts.SupplierProductsId.class)
public class SupplierProducts{

    @Id
    @ManyToOne(targetEntity = Suppliers.class)
    @JoinColumn(name = "supplier_id",foreignKey = @ForeignKey(name = "f_supplier"),referencedColumnName = "supplier_id")
    private String supplierId;


    @ManyToOne(targetEntity =Products.class)
    @JoinColumn(name = "product_id" ,foreignKey = @ForeignKey(name = "f_product"), referencedColumnName = "product_id")
    private String productId;


    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public static class SupplierProductsId implements Serializable{
        private String supplierId;
        private String productId;

        public SupplierProductsId(){

        }
        public SupplierProductsId(String sId, String pId){
            this.productId = pId;
            this.supplierId = sId;
        }

        @Override
        public boolean equals(Object o) {

            if (o == this) {
                return true;
            }
            if (!(o instanceof SupplierProducts)) {
                return false;
            }
            SupplierProducts sp = (SupplierProducts)o;
            return (sp.getSupplierId().equals(supplierId) && sp.getProductId().equals(productId));
        }


        @Override
        public int hashCode() {
            return Objects.hash(supplierId, productId);
        }
    }
}
